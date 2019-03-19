package com.myservice.kz;

import com.beans.kz.Dept;
import com.beans.kz.Pages;

import java.util.List;
import java.util.Map;

public interface DeptService {


    /**
     * 查询所有科室111111111111111111111111111111111111
     * @param page
     * @return
     */
    Map<String,Object> getAllDept(Pages page);
    Map<String,Object> getAllDeptByName(Pages page);

    /**
     * 查询所有科室2222222222222222222222222222222222222
     * @param
     * @return
     */
    List<Dept> getAllDepts();



    /**
     * 查询某个科室
     * @param
     * @return
     */
    Dept getDeptByDeptid(int deptid);

    /**
     * 新增科室
     * @param dept
     */
    void  addDept(Dept dept);


    /**
     * 修改科室
     * @param dept
     */
    void  updateDept(Dept dept);

    /**
     * 删除科室
     * @param deptid
     */

    void  delDept(int deptid);
}
