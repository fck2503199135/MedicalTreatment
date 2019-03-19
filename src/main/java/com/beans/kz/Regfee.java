package com.beans.kz;

public class Regfee {


    private  int regid;//序号
    private  String regname; //费用名称
    private  double regfee; //费用金额
    private  int numoffee_fee; //子费用数量

    private  String sub_regfeename;//子费用名称


    public Regfee(int regid, String regname, double regfee, int numoffee_fee, String sub_regfeename) {
        this.regid = regid;
        this.regname = regname;
        this.regfee = regfee;
        this.numoffee_fee = numoffee_fee;
        this.sub_regfeename = sub_regfeename;
    }

    @Override
    public String toString() {
        return "Regfee{" +
                "regid=" + regid +
                ", regname='" + regname + '\'' +
                ", regfee=" + regfee +
                ", numoffee_fee=" + numoffee_fee +
                ", sub_regfeename='" + sub_regfeename + '\'' +
                '}';
    }

    public String getSub_regfeename() {
        return sub_regfeename;
    }

    public void setSub_regfeename(String sub_regfeename) {
        this.sub_regfeename = sub_regfeename;
    }

    public Regfee(int regid, String regname, double regfee, int numoffee_fee) {
        this.regid = regid;
        this.regname = regname;
        this.regfee = regfee;
        this.numoffee_fee = numoffee_fee;
    }

    public Regfee() {
    }

    public int getRegid() {
        return regid;
    }

    public void setRegid(int regid) {
        this.regid = regid;
    }

    public String getRegname() {
        return regname;
    }

    public void setRegname(String regname) {
        this.regname = regname;
    }

    public double getRegfee() {
        return regfee;
    }

    public void setRegfee(double regfee) {
        this.regfee = regfee;
    }

    public int getNumoffee_fee() {
        return numoffee_fee;
    }

    public void setNumoffee_fee(int numoffee_fee) {
        this.numoffee_fee = numoffee_fee;
    }
}
