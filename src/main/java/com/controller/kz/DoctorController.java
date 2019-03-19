package com.controller.kz;

import com.alibaba.fastjson.JSON;
import com.beans.kz.*;
import com.myservice.kz.MService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class DoctorController {

    @Autowired
    MService ms;

    @RequestMapping(value = "/getAllDoctor")
    @ResponseBody
    public Map<String, Object> getAllDoctor(Pages page){

        Map<String, Object> map = ms.getDoctorByName(page);
        System.out.println(map);
//        String s = JSON.toJSONString(allGoods);
        return map;
    }





    /**
     * 添加医生
     * @param d
     */
    @RequestMapping(value = "/addDoctor")
    @ResponseBody
    public String addDoctor(Doctor d){
        System.out.println(d);
        System.out.println("addDoctor-----------");
        ms.addDoctor(d);

        return "1";
    }
//     模糊查询
//    public Map<String, Object> getDoctorByName(Page page)——


//    @RequestMapping(value = "/getAllDepts")
//    @ResponseBody
//    public String getAllDepts(){
//        System.out.println("222");
//
//        List<Dept> allDepts = ms.getAllDepts();
//        String s = JSON.toJSONString(allDepts);
//        return s;
//    }


    @RequestMapping(value = "/getAllPost")
    @ResponseBody
    public String getAllPost(){

        List<Post> allPost = ms.getAllPost();
        System.out.println("职务查询所有"+allPost);
        String s = JSON.toJSONString(allPost);
        return s;
    }

//    @RequestMapping(value = "/getAllDept")
//    @ResponseBody
//    public Map<String, Object> getAllDepts(Page page){
//        System.out.println("333");
//        Map<String, Object> map = ms.getAllDeptByName(page);
//        return map;
//    }


    /**
     *
     * @param doctor
     * @return
     */
    @RequestMapping(value = "/updateDoctor")
    @ResponseBody
    public String updateDoctor(Doctor doctor){
        System.out.println("update-----------"+doctor);
        ms.updateDoctor(doctor);
        return "1";
    }


    /**
     * 禁用医生
     * @param
     * @return
     */
    @RequestMapping(value = "/prohibitDoctor")
    @ResponseBody
    public String prohibitDoctor(int  did){

        ms.prohibitDoctor(did);
        return "1";
    }

    @RequestMapping(value = "/getAllProhibit")
    @ResponseBody
    public String getAllProhibit(){
        System.out.println("jj------");
        List<Doctor> allDepts = ms.getAllProhibit();
        System.out.println(allDepts);
        String s = JSON.toJSONString(allDepts);
        return s;
    }


//    解除禁用  relieveDoctor

    @RequestMapping(value = "/relieveDoctor")
    @ResponseBody
    public String relieveDoctor(int  did){

        ms.relieveDoctor(did);
        return "1";
    }


    @RequestMapping(value = "/getDoctorByDid")
    @ResponseBody
    public String getDoctorByDid(int did ){

        Doctor doctorByDid = ms.getDoctorByDid(did);
        System.out.println(doctorByDid);
        String s = JSON.toJSONString(doctorByDid);
        return  s;
    }


//
//    @RequestMapping(value = "/addDept")
//    @ResponseBody
//    public String addDept(Dept dept){
//        System.out.println(dept);
//        System.out.println("adddept-----------");
//        ms.addDept(dept);
//
//        return "1";
//    }
//
////科室查询单个-----------------
//@RequestMapping(value = "/getDeptByDeptid")
//@ResponseBody
//public String getDeptByDeptid(int deptid ){
//
//    Dept deptByDeptid = ms.getDeptByDeptid(deptid);
//    System.out.println(deptByDeptid);
//    String s = JSON.toJSONString(deptByDeptid);
//    return  s;
//}
//
//
//    @RequestMapping(value = "/updateDept")
//    @ResponseBody
//    public String updateDept(Dept dept){
//
//        System.out.println("updateDept-----------");
//
//        ms.updateDept(dept);
//
//        return "1";
//    }
//
////    void  delDept(int deptid);
//
//    @RequestMapping(value = "/delDept")
//    @ResponseBody
//    public String delDept(int deptid){
//        System.out.println("delDept-----------");
//
//        ms.delDept(deptid);
//
//        return "1";
//    }
//    @Override
//    public void updateDept(Dept dept) {
//        mMapper.updateDept(dept);
//    }











    //查询挂号费

//    @RequestMapping(value = "/getAllRegfee")
//    @ResponseBody
//    public Map<String, Object> getAllRegfee(Page page){
//
//        System.out.println("33regfee3"+ms.getAllRegfee(page));
//
//
//        Map<String, Object> map = ms.getAllRegfee(page);
//        return map;
//    }
//
//
//
//    /**
//     * 添加挂号费
//     * @param regfee
//     */
//    @RequestMapping(value = "/addRegfee")
//    @ResponseBody
//    public String addRegfee(Regfee regfee){
//        System.out.println(regfee);
//        System.out.println("addregfeee-----------");
//        ms.addRegfee(regfee);
//
//        return "1";
//    }
//
//
////    delRegfee
//
//    /**
//     * 删除挂号类型
//     * @param regid
//     * @return
//     */
//    @RequestMapping(value = "/delRegfee")
//    @ResponseBody
//    public String delRegfee(int regid ){
//        System.out.println(regid);
//        System.out.println("delRegfee-----------");
//        ms.delRegfee(regid);
//        return "1";
//    }
//
////    getRegfeeByid
//
//    @RequestMapping(value = "/getRegfeeByid")
//    @ResponseBody
//    public String getRegfeeByid(int regid ){
//
//        Regfee regfeeByid = ms.getRegfeeByid(regid);
//        System.out.println(regfeeByid);
//        String s = JSON.toJSONString(regfeeByid);
//        return  s;
//    }








//    getAllPrescription

//    //查询处方费
//
//    @RequestMapping(value = "/getAllPrescription")
//    @ResponseBody
//    public Map<String, Object> getAllPrescription(Page page){
//        System.out.println("getAllPrescription"+ms.getAllPrescription(page));
//
//        Map<String, Object> map = ms.getAllPrescription(page);
//        return map;
//    }
//
//    //添加处方费
//
//
//    //添加处方附加
//    @RequestMapping(value = "/addPrescription")
//    @ResponseBody
//    public String addPrescription(Prescription p){
//        System.out.println("delPrescription-----------");
//        ms.addPrescription(p);
//        return "1";
//    }
//
//    //删除处方附加
//    @RequestMapping(value = "/delPrescription")
//    @ResponseBody
//    public String delPrescription(Prescription p){
//
//        System.out.println("delPrescription-----------");
//        ms.delPrescription(p);
//
//        return "1";
//    }



//    //查询检查项目费
//
//    @RequestMapping(value = "/getAllInspection")
//    @ResponseBody
//    public Map<String, Object> getAllInspection(Page page){
//        System.out.println("项目检查费"+page);
//        Map<String, Object> map = ms.getAllInspection(page);
//        System.out.println(map);
//        return map;
//    }



}
