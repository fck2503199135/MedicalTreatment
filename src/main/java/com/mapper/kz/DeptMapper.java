package com.mapper.kz;

import com.beans.kz.Dept;
import com.beans.kz.Pages;

import java.util.List;

public interface DeptMapper {


    //查询科室数量
    int getdeptCount();

    /**
     * 查询所有科室111111111111111111111111111111111111
     * @param page
     * @return
     */
    List<Dept> getAllDept(Pages page);
    List<Dept> getAllDeptByName(Pages page);

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
