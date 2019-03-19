package com.controller.kz;

import com.alibaba.fastjson.JSON;
import com.beans.kz.Pages;
import com.beans.kz.Prescription;
import com.myservice.kz.MService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class PreController {

    @Autowired
    MService ms;

    //查询处方费

    @RequestMapping(value = "/getAllPrescription")
    @ResponseBody
    public Map<String, Object> getAllPrescription(Pages page){
        System.out.println("getAllPrescription"+ms.getAllPrescription(page));

        Map<String, Object> map = ms.getAllPrescription(page);
        return map;
    }




    //添加处方附加
    @RequestMapping(value = "/addPrescription")
    @ResponseBody
    public String addPrescription(Prescription p){
        System.out.println("delPrescription-----------");
        ms.addPrescription(p);
        return "1";
    }

    //删除处方附加
    @RequestMapping(value = "/delPrescription")
    @ResponseBody
    public String delPrescription(Prescription p){

        System.out.println("delPrescription-----------");
        ms.delPrescription(p);

        return "1";
    }



//    getPrescriptionByid
    //处方查询单个-----------------
    @RequestMapping(value = "/getPrescriptionByid")
    @ResponseBody
    public String getPrescriptionByid(int preid ){
        Prescription prescriptionByid = ms.getPrescriptionByid(preid);
        System.out.println(prescriptionByid);
        String s = JSON.toJSONString(prescriptionByid);
        return  s;
    }


    /**
     * 修改处方附加费
     * @param p
     * @return
     */
    @RequestMapping(value = "/updatePrescription")
    @ResponseBody
    public String updatePrescription(Prescription p){

        System.out.println("updatePrescription-----------");
        ms.updatePrescription(p);

        return "1";
    }

}
