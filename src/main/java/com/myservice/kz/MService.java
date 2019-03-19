package com.myservice.kz;


import com.beans.kz.*;


import java.util.List;
import java.util.Map;

public interface MService {


    /**
     * 编辑医生信息
     * @param doctor
     */
    void updateDoctor(Doctor doctor);


    /**
     * 查询所有医生
     * @param page
     * @return
     */

    Map<String,Object> getAllDoctor(Pages page);

    /**
     * 查询所有医生 模糊查询
     * @param page
     * @return
     */
    Map<String,Object> getDoctorByName(Pages page);


    /**
     * 添加医生
     * @param doctor
     */
    void addDoctor(Doctor doctor);

    /**
     * 查询所有的职务
     * @param
     * @return
     */
    List<Post> getAllPost();

    /**
     * 编辑查看
     * @return
     */
    Doctor getDoctorByDid(int did);



    /**
     * 禁用医生
     * @param
     */
    void  prohibitDoctor(int did);



    /**
     * 解除禁用
     * @param did
     */
    void  relieveDoctor(int did);

    /**
     * 禁用的医生表
     * @return
     */

    List<Doctor>  getAllProhibit();

    //科室================================
//
//    /**
//     * 查询所有科室
//     * @param page
//     * @return
//     */
////    Map<String,Object> getAllDept(Page page);
//    Map<String,Object> getAllDeptByName(Page page);
//
//
//    /**
//     * 查询所有科室
//     * @param
//     * @return
//     */
//    List<Dept> getAllDepts();
//
//
////    //查询科室数量
////    int getdeptCount();
//
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
//    void  delDept(int deptid);


    /**
     * 查询挂号费
     * @param page
     * @return
     */


    Map<String,Object> getAllRegfee(Pages page);


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
     * 查一个挂号费类型
     * @param regid
     * @return
     */
    Regfee getRegfeeByid(int regid);

    /**
     * 修改挂号费类费
     * @param regfee
     */
    void updateRegfee(Regfee regfee);





    /**
     * 查询处方附加费----------------------------------------
     * @param page
     * @return
     */

    Map<String,Object> getAllPrescription(Pages page);


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
//    /**
//     * 查询项目检查费
//     * @param page
//     * @return
//     */
//    Map<String,Object> getAllInspection(Page page);


    /**
     * 查询字典表项目
     * @return
     */
    List<Dictionary> getAllDictionary();

}
