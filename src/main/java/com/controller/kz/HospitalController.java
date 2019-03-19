package com.controller.kz;

import com.alibaba.fastjson.JSON;
import com.beans.kz.Hospital;
import com.mapper.kz.HospitalMapper;
import com.mapper.kz.MMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HospitalController {

    @Autowired
    HospitalMapper hospitalMapper;

    @Autowired
    MMapper mMapper;



    @RequestMapping(value = "/getAllHospital")
    @ResponseBody
    public String getAllHospital(){

        Hospital allHospital = hospitalMapper.getAllHospital();
        System.out.println(allHospital);
        String s = JSON.toJSONString(allHospital);

        return s;
    }



    @RequestMapping(value = "/updateHospital")
    @ResponseBody
    public String updateHospital(Hospital hospital){

        System.out.println("updatehospital");
        hospitalMapper.updateHospital(hospital);
//        System.out.println(allDeptname);
        return "1";
    }

//    getDoctorNumber


    @RequestMapping(value = "/getDoctorNumber")
    @ResponseBody
    public int getDoctorNumber(){

        int count = mMapper.getCount();
        System.out.println(count);
        return count;
    }


    @RequestMapping(value = "/getAllDeptname")
    @ResponseBody
    public String getAllDeptname(){

        List<String> allDeptname = hospitalMapper.getAllDeptname();
//        System.out.println(allDeptname);
        String s = JSON.toJSONString(allDeptname);

        return s;
    }

}
