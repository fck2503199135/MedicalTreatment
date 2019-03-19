package com.beans.kz;


public class Pages {
    private int limit;
    private int offset;
    private  int cid;
    private  String dname;
    private  String deptname;
    private  String regname;
    private  String prename;


    @Override
    public String toString() {
        return "Page{" +
                "limit=" + limit +
                ", offset=" + offset +
                ", cid=" + cid +
                ", dname='" + dname + '\'' +
                ", deptname='" + deptname + '\'' +
                ", regname='" + regname + '\'' +
                ", prename='" + prename + '\'' +
                '}';
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public String getRegname() {
        return regname;
    }

    public void setRegname(String regname) {
        this.regname = regname;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String gname) {
        this.dname = gname;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}

