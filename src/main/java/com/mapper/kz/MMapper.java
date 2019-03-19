package com.mapper.kz;

import com.beans.kz.*;

import java.util.List;


public interface MMapper {

    //查询数量
    int getCount();

//    //查询科室数量
//    int getdeptCount();
        //挂号费数量
   int  getregfeeCount();
      //处方附加费数量
   int getpreCount();
//        //项目费数量
//   int getinsCount();
    /**
     * 查询所有医生
     * @param page
     * @return
     */
    List<Doctor> getAllDoctor(Pages page);

    /**
     * 查询所有的职务
     * @param
     * @return
     */
    List<Post> getAllPost();

    /**
     * 添加医生
     * @param doctor
     */
    void addDoctor(Doctor doctor);

    /**
     * 编辑查看
     * @return
     */
    Doctor getDoctorByDid(int did);


    /**
     * 查询所有医生 模糊查询
     * @param page
     * @return
     */
    List<Doctor> getDoctorByName(Pages page);

    /**
     * 编辑医生信息
     * @param doctor
     */
    void updateDoctor(Doctor doctor);



    /**
     * 禁用医生
     * @param did
     */
    void  prohibitDoctor(int did);


    /**
     * 解除禁用
     * @param did
     */
    void  relieveDoctor(int did);


    /**
     * 禁用的医生
     * @return
     */

    List<Doctor>  getAllProhibit();


//    /**
//     * 查询所有科室111111111111111111111111111111111111
//     * @param page
//     * @return
//     */
//    List<Dept> getAllDept(Page page);
//    List<Dept> getAllDeptByName(Page page);
//
//    /**
//     * 查询所有科室2222222222222222222222222222222222222
//     * @param
//     * @return
//     */
//    List<Dept> getAllDepts();
//
//    /**
//     * 查询某个科室
//     * @param
//     * @return
//     */
//    Dept getDeptByDeptid(int deptid);
//
//    /**
//     * 新增科室
//     * @param dept
//     */
//    void  addDept(Dept dept);
//
//
//    /**
//     * 修改科室
//     * @param dept
//     */
//    void  updateDept(Dept dept);
//
//    /**
//     * 删除科室
//     * @param deptid
//     */
//
//    void  delDept(int deptid);



    /**
     * 查询挂号费
     * @param page
     * @return
     */
    List<Regfee> getAllRegfee(Pages page);

    /**
     * 添加挂号费
     * @param regfee
     */
     void   addRegfee(Regfee regfee);

    /**
     * 删除挂号费类型
     * @param regid
     */
    void  delRegfee(int regid);


 /**
  * 修改挂号费类费
  * @param regfee
  */
 void updateRegfee(Regfee regfee);

    /**
     * 查一个挂号费类型
     * @param regid
     * @return
     */
    Regfee getRegfeeByid(int regid);




    /**
     * 查询处方附加费
     * @param page
     * @return
     */
    List<Prescription> getAllPrescription(Pages page);


    /**
     * 添加处方附加费
     * @param p
     */
    void addPrescription(Prescription p);


    /**
     * 删除处方附加费
     * @param p
     */
    void delPrescription(Prescription p);


 /**
  * 查询一个处方附加
  * @param preid
  * @return
  */
 Prescription getPrescriptionByid(int preid);

 /**
  * 修改处方附加费
  * @param p
  */
 void updatePrescription(Prescription p);

//    getAllInspection


    /**
     * 查询字典表项目
     * @return
     */
    List<Dictionary> getAllDictionary();
//
//    /**
//     * 查询项目检查费
//     * @param page
//     * @return
//     */
//    List<Inspectionfee> getAllInspection(Page page);
//
//
//
//
//    void addInspection(Inspectionfee inspectionfee);



}
