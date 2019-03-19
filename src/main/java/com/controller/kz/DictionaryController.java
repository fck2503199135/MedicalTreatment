package com.controller.kz;

import com.alibaba.fastjson.JSON;
import com.beans.kz.Dictionary;
import com.beans.kz.Doctor;
import com.beans.kz.Pages;
import com.myservice.kz.MService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
@Controller
public class DictionaryController {

    @Autowired
    MService ms;

    @RequestMapping(value = "/getAllDictionary")
    @ResponseBody
    public String getAllDictionary(){

        System.out.println("dictionary------");
        List<Dictionary> allDictionary = ms.getAllDictionary();
        System.out.println(allDictionary);
        String s = JSON.toJSONString(allDictionary);
        return s;
    }


}
