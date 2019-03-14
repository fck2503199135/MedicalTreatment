package com.beans.fck;

public class Review {

    private int rid; //id
    private String rnum; //审核号
    private String rpname; //采购员
    private double rmoney; //采购金额
    private String rpdate; //采购日期
    private String rname; //审核员
    private String rdate; // 审核日期
    private int sid;
    private String sname; // 供应商
    private int rstate; // 审核状态
    private int rgo;   //判断状态
    private String strgo;

    public Review() {
    }

    public int getRgo() {
        return rgo;
    }

    public void setRgo(int rgo) {
        setStrgo(rgo);
        this.rgo = rgo;
    }

    public String getStrgo() {
        return strgo;
    }

    public void setStrgo(int rgo) {
        if(rgo==0){
            this.strgo = "未入库";
        }else {
            this.strgo = "已入库";
        }
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRnum() {
        return rnum;
    }

    public void setRnum(String rnum) {
        this.rnum = rnum;
    }

    public String getRpname() {
        return rpname;
    }

    public void setRpname(String rpname) {
        this.rpname = rpname;
    }

    public double getRmoney() {
        return rmoney;
    }

    public void setRmoney(double rmoney) {
        this.rmoney = rmoney;
    }

    public String getRpdate() {
        return rpdate;
    }

    public void setRpdate(String rpdate) {
        this.rpdate = rpdate;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getRstate() {
        return rstate;
    }

    public void setRstate(int rstate) {
        this.rstate = rstate;
    }

    @Override
    public String toString() {
        return "Review{" +
                "rid=" + rid +
                ", rnum='" + rnum + '\'' +
                ", rpname='" + rpname + '\'' +
                ", rmoney=" + rmoney +
                ", rpdate='" + rpdate + '\'' +
                ", rname='" + rname + '\'' +
                ", rdate='" + rdate + '\'' +
                ", sid=" + sid +
                ", sname='" + sname + '\'' +
                ", rstate=" + rstate +
                ", rgo=" + rgo +
                ", strgo='" + strgo + '\'' +
                '}';
    }
}
