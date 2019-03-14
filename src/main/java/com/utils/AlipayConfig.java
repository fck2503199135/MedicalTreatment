
package com.utils;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092500595901";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key =
			"MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCd4BViCgeSsvSrNXoVsv+lMCgEe04cpEdJ2khJaI8Ih/SSPfcWWo9HBZav8YuVe/Ro3WACMXa96iRvmVAK90MuG/Et6WD8RLdoC/CKjNVZ7c7o+6ugzcN0pwZk7LI3mknmrXrkmODQA3ecDz88Bi11RlDrYVdkCOT274lD1tGdbuizmnUYOM203SY9rbnDS79RiWljxGeuc8HF95siN6MQUhCqBRqRFgsFi8KW7bPS9sq3eIwpOe+dXR4+1f+wlsOa00iSQBMcf5iJemyU2eGr/aDRNjIP7sVOixI5BdE9zsBY7CaG7y/rkqXyChgmwDUDsXFO++c/9xHNmM03FMBXAgMBAAECggEAHI99Ts8hr5hQSujRvTs0pF2h362u49+URfgHO8B+n7x4sjwjhxe6884/BHVeGxzhilcCF2N7Z8AD92x03ob80EqdxwCBWyHTTC9cxLPVpP8wf1WIJv8SbPgKYBex5f0zgVfA87n0ca0u5jyb4+/6KU0fNnXVqXMyeLm8y1kBcslk7rwPD6NgbaCBwNLscBmBabRbvqfeHi3JRDhr2JPMt8y0nPCswxXoixQqdDVcbl++oRZmM2T96O5ghsKQN2ZyUNH6VmYYoIvBfcr8S3nb9ygunVyqlvvck/F7QbLF3K3T4c1yk6ZxkSRAHHOw1GNU10mU1tTRoNiGJfk0GFK5gQKBgQDNHq6TSKEDE/bTGKsJpfv024INfR2RTk021eFbHurMgGPoJnTYq6NcgH2sPUuue3yBnDUjrTBQxD0HVAHkYtLqn7NMbK2J7BIBrF1kJuEyv01P+WsMfvuz+Ba4Fq2PpTVP3xMquM3rfay8nGBB2aqE1vN95seW6VxtbcnGO61OXQKBgQDFCVOSygM77IoYYmeggK5rYo6rS8yQdVAvV7G21gzPZvXWFOVhmWKJ4K2UROh8Gxn2LG2+pI/7062IH57AkreLyD8uwFZxjZzgPp1VVPbLk8+hOEi6u/68sxW1RaBMUVnb7Y3ri0H5pFuxWhKTcv9g1K3MA3YeHxuzQyXe355WQwKBgF3nhP6SinvxQNdlfK//GDkB4SkxtT6XfUv0YKYpok6bHKHkMSwcb75iaKZYrXQkvlxL2hwKJotjO5lGQVOAVpTpJdmAC3aP57JyaZL3JbPo1okdY3+mBq9ejXAbmbugY6a8NnchgcwkjdcPNBYRgzoree+Snp8dGJ5UW8JwAahVAoGBAJLa5q1LX6m0HSEbhvz7rARhitBlSGyK417Fz7DkTNvwc15CaMybk/QLv5P44AZP9MOkTY9/+8jH9li0qJADSkYm0+C2fjdYQwpn4MAO+Xq2ClSxLJPxNmXSXGWlJVp8b6sZnWNngZ7dP3IqHhpD5c939KlQEyNUMEMl0v4QUWUdAoGAJHZUTMYZNEtMXTldCSk3wvXFJn772d345yfiaUe4l+yJGvAkPfC+dDiqA3QY7pLVhBrqctnv8+yJ7P0VSSnzsMTH4B9NrUna0OdWkdQB6KyerJAIt3j/PgHRPYl3aMf9zpzzSnQxutyAcS9M9459RdAuGYcP7KJOZ7NFcogRZ4k=";


    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm
	// 对应APPID下的支付宝公钥。
    public static String alipay_public_key =
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAyiQzRn9U36Svfbp7C0tlaJZU/aeJO9ISCT7cwiM7NdgKrHf1mN+FTUV8KbxaAuhL2QWGcIL2vl/yi32ne77X5BID9WkHzTjVIRrs7lE/1XYYxecIVtH+vDdLlt3iYYokbq1/tF0PHpjggFPXffhxZvY8kJI0mdmqhYE0PCynGStPFSPHgUdmB+iUWH9lr/RrdbhPIug4nDLpCReatRXTX23hV1h9BwX041GjBHzKfMCWM/Sc7rZbmnw20nV+P96aoNwRD/1t3IAJxTqQ+BjPvusnEiaZsQqUxnl8y8f4LvzBciYHOTbKXIq+ShHq0sEsZIFUr9E0AwA9avO5hqUMUQIDAQAB";


    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/notify_url";
    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/return_url";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 日志
    public static String log_path = "/logs";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer =
					new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

