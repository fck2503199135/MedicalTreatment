package com.beans.kz;

public class Dept {
    private  int deptid;//科室id
    private  String deptname;//科室名称
    private  String create_time;//创建时间
    private  String update_time;//修改时间
    private  int dept_number;//科室编号





    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public int getDept_number() {
        return dept_number;
    }

    public void setDept_number(int dept_number) {
        this.dept_number = dept_number;
    }
}
