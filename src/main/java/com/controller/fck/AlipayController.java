package com.controller.fck;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alipay.api.request.AlipayOpenAuthTokenAppRequest;
import com.alipay.api.response.AlipayOpenAuthTokenAppResponse;
import com.utils.AlipayConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author sihai
 * @version V1.0
 * @Title: AlipayController.java
 * @Package com.sihai.controller
 * @Description: controller
 * Copyright: Copyright (c) 2016
 * Company:FURUIBOKE.SCIENCE.AND.TECHNOLOGY
 * @date 2017年8月18日 上午10:39:15
 */
@Controller
public class AlipayController {

    final static Logger log = LoggerFactory.getLogger(AlipayController.class);
    /**
     * @Title: AlipayController.java
     * @Package com.sihai.controller
     * @Description: 前往支付宝第三方网关进行支付
     * Copyright: Copyright (c) 2017
     * Company:FURUIBOKE.SCIENCE.AND.TECHNOLOGY
     * @author sihai
     * @date 2017年8月23日 下午8:50:43
     * @version V1.0
     */
    @RequestMapping(value = "/alipay", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String goAlipay(HttpServletRequest requests) throws Exception {
        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = new String(requests.getParameter("WIDout_trade_no"));

        //付款金额，必填
        String total_amount = new String(requests.getParameter("WIDtotal_amount"));
        //订单名称，必填
        String subject = new String(requests.getParameter("WIDsubject"));
        //商品描述，可空
        String body = new String(requests.getParameter("WIDbody"));
        //获得初始化的AlipayClient
        AlipayClient client = new DefaultAlipayClient(AlipayConfig.gatewayUrl,
                AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json",
                AlipayConfig.charset,
                AlipayConfig.alipay_public_key,
                AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        request.setReturnUrl(AlipayConfig.return_url);
        request.setNotifyUrl(AlipayConfig.notify_url);
        request.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\","    //商户订单号，商户网站订单系统中唯一订单号，必填
                + "\"total_amount\":\"" + total_amount + "\","//付款金额，必填
                + "\"subject\":\"" + subject + "\","//订单名称，必填
                + "\"body\":\"" + body + "\","//商品描述，可空
                + "\"timeout_express\":\"10m\","//绝对超时时间，格式为yyyy-MM-dd HH:mm
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        String result = client.pageExecute(request).getBody();
        //输出
        System.out.println(result);
        return result;
    }

    /**
     * @param request
     * @param response
     * @throws Exception
     * @return支付宝登录
     */
    @RequestMapping(value = "/zfb", produces = "text/html; charset=UTF-8")
    public String zfb(HttpServletRequest request,HttpServletResponse response) throws Exception {
        //获取支付宝GET过来反馈信息
        Map<String, String> params = new HashMap<String, String>();
        Map requestParams = request.getParameterMap();
        for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
            valueStr = new String(valueStr);
            params.put(name, valueStr);
        }

        //获取支付宝的通知返回参数，可参考技术文档中页面跳转同步通知参数列表(以下仅供参考)//
        //支付宝用户号
        String app_id = new String(request.getParameter("app_id").getBytes("ISO-8859-1"), "UTF-8");
        System.out.println(app_id);

        //获取第三方登录授权
        String alipay_app_auth = new String(request.getParameter("source").getBytes("ISO-8859-1"), "UTF-8");
        System.out.println(alipay_app_auth);
        //第三方授权code
        String app_auth_code = new String(request.getParameter("app_auth_code").getBytes("ISO-8859-1"), "UTF-8");//获的第三方登录用户授权app_auth_code
        System.out.println(app_auth_code);

        //使用auth_code换取接口access_token及用户userId
        AlipayClient client = new DefaultAlipayClient(AlipayConfig.gatewayUrl,
                AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json",
                AlipayConfig.charset,
                AlipayConfig.alipay_public_key,
                AlipayConfig.sign_type);


        AlipayOpenAuthTokenAppRequest requestLogin1 = new AlipayOpenAuthTokenAppRequest();
        requestLogin1.setBizContent("{" +
                "\"grant_type\":\"authorization_code\"," +
                "\"code\":\"" + app_auth_code + "\"" +
                "}");

        //第三方授权
        AlipayOpenAuthTokenAppResponse responseToken = client.execute(requestLogin1);
        if (responseToken.isSuccess()) {
            System.out.println("调用成功");
            System.out.println(responseToken.getAuthAppId());
            System.out.println(responseToken.getAppAuthToken());
            System.out.println(responseToken.getUserId());
        } else {
            System.out.println("调用失败");
        }
        return "1";
    }

    /**
     * @Title: AlipayController.java
     * @Package com.sihai.controller
     * @Description: 支付宝同步通知页面
     * Copyright: Copyright (c) 2017
     * Company:FURUIBOKE.SCIENCE.AND.TECHNOLOGY
     * @author sihai
     * @date 2017年8月23日 下午8:51:01
     * @version V1.0
     */
    @RequestMapping(value = "/return_url", produces = "text/html; charset=UTF-8")
    public ModelAndView alipayReturnNotice(HttpServletRequest request,HttpServletResponse response) throws Exception {

        log.info("支付成功, 进入同步通知接口...");

        //获取支付宝GET过来反馈信息
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用
            valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }

        boolean signVerified = AlipaySignature.rsaCheckV1(params,
                AlipayConfig.alipay_public_key, AlipayConfig.charset,
                AlipayConfig.sign_type); //调用SDK验证签名

        ModelAndView mv = new ModelAndView();
        //——请在这里编写您的程序（以下代码仅作参考）——
        if (signVerified) {
            //商户订单号
            String out_trade_no = new String(request.getParameter(
                    "out_trade_no"));

            //支付宝交易号
            String trade_no =
                    new String(request.getParameter("trade_no"));

            //付款金额
            String total_amount = new String(request.getParameter(
                    "total_amount"));

            log.info("********************** 支付成功(支付宝同步通知) " + "**********************");
            log.info("* 订单号: {}", out_trade_no);
            log.info("* 支付宝交易号: {}", trade_no);
            log.info("* 实付金额: {}", total_amount);
            log.info( "***************************************************************");

            mv.addObject("out_trade_no", out_trade_no);
            mv.addObject("trade_no", trade_no);
            mv.addObject("total_amount", total_amount);
            mv.setViewName("/see_doctor/success");
        } else {
            mv.setViewName("/see_doctor/fail");
            log.info("支付, 验签失败...");
        }

        return mv;
    }

    /**
     * @Title: AlipayController.java
     * @Package com.sihai.controller
     * @Description: 支付宝异步 通知页面
     * Copyright: Copyright (c) 2017
     * Company:FURUIBOKE.SCIENCE.AND.TECHNOLOGY
     * @author sihai
     * @date 2017年8月23日 下午8:51:13
     * @version V1.0
     */
    @RequestMapping(value = "/notify_url", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String alipayNotifyNotice(HttpServletRequest request, HttpServletRequest response) throws Exception {

        log.info("支付成功, 进入异步通知接口...");

        //获取支付宝POST过来反馈信息
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用
            params.put(name, valueStr);
        }

        boolean signVerified = AlipaySignature.rsaCheckV1(params,
                AlipayConfig.alipay_public_key, AlipayConfig.charset,
                AlipayConfig.sign_type); //调用SDK验证签名

        //——请在这里编写您的程序（以下代码仅作参考）——
		
		/* 实际验证过程建议商户务必添加以下校验：
		1、需要验证该通知数据中的out_trade_no是否为商户系统中创建的订单号，
		2、判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额），
		3、校验通知中的seller_id（或者seller_email)
		是否为out_trade_no这笔单据的对应的操作方（有的时候，一个商户可能有多个seller_id/seller_email）
		4、验证app_id是否为该商户本身。
		*/
        if (signVerified) {//验证成功
            //商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");

            //支付宝交易号
            String trade_no = new String(request.getParameter("trade_no"));

            //交易状态
            String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"), "UTF-8");

            //付款金额
            String total_amount = new String(request.getParameter("total_amount"));

            if (trade_status.equals("TRADE_FINISHED")) {
                //判断该笔订单是否在商户网站中已经做过处理
                //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                //如果有做过处理，不执行商户的业务程序

                //注意： 尚自习的订单没有退款功能, 这个条件判断是进不来的, 所以此处不必写代码
                //退款日期超过可退款期限后（如三个月可退款），支付宝系统发送该交易状态通知
            } else if (trade_status.equals("TRADE_SUCCESS")) {
                //判断该笔订单是否在商户网站中已经做过处理
                //如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，并执行商户的业务程序
                //如果有做过处理，不执行商户的业务程序

                //注意：
                //付款完成后，支付宝系统发送该交易状态通知

                log.info("********************** 支付成功(支付宝异步通知) **********************");
                log.info("* 订单号: {}", out_trade_no);
                log.info("* 支付宝交易号: {}", trade_no);
                log.info("* 实付金额: {}", total_amount);
                log.info("***************************************************************");
            }
            log.info("支付成功...");

        } else {//验证失败
            log.info("支付, 验签失败...");
        }

        return "success";
    }

}
