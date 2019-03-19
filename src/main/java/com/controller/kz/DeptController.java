package com.controller.kz;

import com.alibaba.fastjson.JSON;
import com.beans.kz.Dept;
import com.beans.kz.Pages;
import com.myservice.kz.DeptService;
import com.myservice.kz.MService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class DeptController {

    @Autowired
    MService ms;

    @Autowired
    DeptService ds;

    @RequestMapping(value = "/getAllDepts")
    @ResponseBody
    public String getAllDepts(){
        System.out.println("222");

        List<Dept> allDepts = ds.getAllDepts();
        String s = JSON.toJSONString(allDepts);
        return s;
    }



    @RequestMapping(value = "/getAllDept")
    @ResponseBody
    public Map<String, Object> getAllDepts(Pages page){
        System.out.println("333");
        Map<String, Object> map = ds.getAllDeptByName(page);
        return map;
    }


    //科室查询单个-----------------
    @RequestMapping(value = "/getDeptByDeptid")
    @ResponseBody
    public String getDeptByDeptid(int deptid ){

        Dept deptByDeptid = ds.getDeptByDeptid(deptid);
        System.out.println(deptByDeptid);
        String s = JSON.toJSONString(deptByDeptid);
        return  s;
    }


    @RequestMapping(value = "/updateDept")
    @ResponseBody
    public String updateDept(Dept dept){

        System.out.println("updateDept-----------");

        ds.updateDept(dept);

        return "1";
    }

//    void  delDept(int deptid);

    @RequestMapping(value = "/delDept")
    @ResponseBody
    public String delDept(int deptid){
        System.out.println("delDept-----------");

        ds.delDept(deptid);

        return "1";
    }



    @RequestMapping(value = "/addDept")
    @ResponseBody
    public String addDept(Dept dept){
        System.out.println(dept);
        System.out.println("adddept-----------");
        ds.addDept(dept);

        return "1";
    }








}
