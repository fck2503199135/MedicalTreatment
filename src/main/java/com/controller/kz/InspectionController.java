package com.controller.kz;

import com.alibaba.fastjson.JSON;
import com.beans.kz.Inspectionfee;
import com.beans.kz.Pages;
import com.myservice.kz.InspectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class InspectionController {

    @Autowired
    InspectionService is;


    //查询检查项目费

    @RequestMapping(value = "/getAllInspection")
    @ResponseBody
    public Map<String, Object> getAllInspection(Pages page){
        System.out.println("项目检查费"+page);
        Map<String, Object> map = is.getAllInspection(page);
        System.out.println(map);
        return map;
    }

//    /**
//     * 添加项目
//     * @param inspectionfee
//     */
////    void addInspection(Inspectionfee inspectionfee);

    @RequestMapping(value = "/addInspection")
    @ResponseBody
    public String addInspection(Inspectionfee inspectionfee){
        System.out.println("addd-----------");
        System.out.println(inspectionfee);

        is.addInspection(inspectionfee);
        return "1";
    }


    @RequestMapping(value = "/delInspection")
    @ResponseBody
    public String delInspection(int insid){
        System.out.println("del-----------");
        is.delInspection(insid);
        return "1";
    }

//    getInspectionById
//项目查询单个-----------------
@RequestMapping(value = "/getInspectionById")
@ResponseBody
public String getInspectionById(int insid ){

    Inspectionfee inspectionById = is.getInspectionById(insid);
    System.out.println(inspectionById);
    String s = JSON.toJSONString(inspectionById);
    return  s;
}

//    updateInspection

    @RequestMapping(value = "/updateInspection")
    @ResponseBody
    public String updateInspection(Inspectionfee inspectionfee){

        System.out.println("updateInspection-----------");

        is.updateInspection(inspectionfee);

        return "1";
    }


}
