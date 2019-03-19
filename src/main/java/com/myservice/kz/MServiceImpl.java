package com.myservice.kz;

import com.beans.kz.*;
import com.mapper.kz.MMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MServiceImpl implements MService {




    @Autowired
    MMapper mMapper;


    @Override
    public void updatePrescription(Prescription p) {
        mMapper.updatePrescription(p);
    }

    /**
     * getPrescriptionByid
     * @param preid
     * @return
     */
    @Override
    public Prescription getPrescriptionByid(int preid) {
        return mMapper.getPrescriptionByid(preid);
    }

    //模糊查询医生




//    @Override
//    public void updateDept(Dept dept) {
//        mMapper.updateDept(dept);
//    }
//
//    //查询某个科室
//    @Override
//    public Dept getDeptByDeptid(int deptid) {
//        return mMapper.getDeptByDeptid(deptid);
//    }

    @Override
    public Map<String, Object> getDoctorByName(Pages page) {
        System.out.println("service-------------------------");
        Map<String, Object> map = new HashMap<>();

        map.put("rows", mMapper.getDoctorByName(page));
        map.put("total",mMapper.getCount());
        return map;
    }

    @Override
    public void relieveDoctor(int did) {
        mMapper.relieveDoctor(did);
    }

    @Override
    public List<Doctor> getAllProhibit() {
        return mMapper.getAllProhibit();
    }

    @Override
    public void prohibitDoctor(int did) {
        mMapper.prohibitDoctor(did);
    }


    /**
     * 删除处方附加费
     * @param p
     */
    @Override
    public void delPrescription(Prescription p) {
                mMapper.delPrescription(p);
    }

    /**
     * 添加处方类型
     * @param p
     */

    @Override
    public void addPrescription(Prescription p) {
        mMapper.addPrescription(p);
    }


//    //查询检查项目费
//    @Override
//    public Map<String, Object> getAllInspection(Page page) {
//        Map<String, Object> map = new HashMap<>();
//        map.put("rows", mMapper.getAllInspection(page));
//        map.put("total",mMapper.getinsCount());
//        return map;
//    }

    /**
     * 查询处方类型表
     * @param page
     * @return
     */
    @Override
    public Map<String, Object> getAllPrescription(Pages page) {
        System.out.println("service----getAllPrescription---------------------");

        Map<String, Object> map = new HashMap<>();
        map.put("rows", mMapper.getAllPrescription(page));
        map.put("total",mMapper.getpreCount());
        return map;
    }

    /**
     * 查一个挂号费类型
     * @param regid
     * @return
     */
    @Override
    public Regfee getRegfeeByid(int regid) {
        return mMapper.getRegfeeByid(regid);
    }

    @Override
    public List<Dictionary> getAllDictionary() {
        return mMapper.getAllDictionary();
    }

    @Override
    public void updateRegfee(Regfee regfee) {
        mMapper.updateRegfee(regfee);
    }

    /**
     * 删除挂号类型
     * @param regid
     */
    @Override
    public void delRegfee(int regid) {
        mMapper.delRegfee(regid);
    }

    /**
     * 添加挂号费
     * @param regfee
     */
    @Override
    public void addRegfee(Regfee regfee) {
        mMapper.addRegfee(regfee);

    }

//    //删除科室
//    @Override
//    public void delDept(int deptid) {
//        System.out.println(deptid);
//        mMapper.delDept(deptid);
//    }



    @Override
    public Map<String, Object> getAllRegfee(Pages page) {
        Map<String, Object> map = new HashMap<>();

        map.put("rows", mMapper.getAllRegfee(page));
        map.put("total",mMapper.getregfeeCount());
        return map;
    }


//    @Override
//    public List<Doctor> getAllRegfee(Page page) {
//        return mMapper.getAllRegfee(page);
//    }

//    @Override
//    public void addDept(Dept dept) {
//        mMapper.addDept(dept);
//    }

    @Override
    public void updateDoctor(Doctor doctor) {
        mMapper.updateDoctor(doctor);
    }

    @Override
    public Doctor getDoctorByDid(int did) {
        return mMapper.getDoctorByDid(did);
    }

    @Override
    public Map<String, Object> getAllDoctor(Pages page) {
        System.out.println("service-------------------------");
        Map<String, Object> map = new HashMap<>();
        map.put("rows", mMapper.getAllDoctor(page));
        map.put("total",mMapper.getCount());
        return map;


    }

    /**
     * 添加医生
     * @param doctor
     */
    @Override
    public void addDoctor(Doctor doctor) {
        mMapper.addDoctor(doctor);
    }


    /**
     * 查询所有职务
     * @return
     */
    @Override
    public List<Post> getAllPost() {
        return mMapper.getAllPost();
    }


//    /**
//     * 查询所有科室
//     * @return
//     */
//    @Override
//    public List<Dept> getAllDepts() {
//        return mMapper.getAllDepts();
//    }
//
//    @Override
//    public Map<String, Object> getAllDeptByName(Page page) {
//        System.out.println("service----s--------------------");
//        Map<String, Object> map = new HashMap<>();
//        map.put("rows", mMapper.getAllDeptByName(page));
//        map.put("total",mMapper.getdeptCount());
//        return map;
//
//    }
}
