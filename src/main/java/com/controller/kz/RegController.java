package com.controller.kz;

import com.alibaba.fastjson.JSON;
import com.beans.kz.Pages;
import com.beans.kz.Regfee;
import com.myservice.kz.MService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class RegController {

    @Autowired
    MService ms;


    //查询挂号费

    @RequestMapping(value = "/getAllRegfee")
    @ResponseBody
    public Map<String, Object> getAllRegfee(Pages page){

        System.out.println("33regfee3"+ms.getAllRegfee(page));


        Map<String, Object> map = ms.getAllRegfee(page);
        return map;
    }



    /**
     * 添加挂号费
     * @param regfee
     */
    @RequestMapping(value = "/addRegfee")
    @ResponseBody
    public String addRegfee(Regfee regfee){
        System.out.println(regfee);
        System.out.println("addregfeee-----------");
        ms.addRegfee(regfee);

        return "1";
    }


//    delRegfee

    /**
     * 删除挂号类型
     * @param regid
     * @return
     */
    @RequestMapping(value = "/delRegfee")
    @ResponseBody
    public String delRegfee(int regid ){
        System.out.println(regid);
        System.out.println("delRegfee-----------");
        ms.delRegfee(regid);
        return "1";
    }

//    getRegfeeByid

    @RequestMapping(value = "/getRegfeeByid")
    @ResponseBody
    public String getRegfeeByid(int regid ){

        Regfee regfeeByid = ms.getRegfeeByid(regid);
        System.out.println(regfeeByid);
        String s = JSON.toJSONString(regfeeByid);
        return  s;
    }

//    修改  getRegfeeByid
@RequestMapping(value = "/updateRegfee")
@ResponseBody
public String updateRegfee(Regfee regfee){
    System.out.println(regfee);
    System.out.println("delRegfee-----------");
    ms.updateRegfee(regfee);
    return "1";
}

}
