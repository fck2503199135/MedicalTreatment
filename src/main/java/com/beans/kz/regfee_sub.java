package com.beans.kz;

public class regfee_sub {

    private int  reg_sub_id;
    private int regid;   // 挂号费用ID
    private String sub_regfeename;  //挂号费用子费用名称
    private double sub_regfee_fee;   //子费用 金额


    @Override
    public String toString() {
        return "regfee_sub{" +
                "reg_sub_id=" + reg_sub_id +
                ", regid=" + regid +
                ", sub_regfeename='" + sub_regfeename + '\'' +
                ", sub_regfee_fee=" + sub_regfee_fee +
                '}';
    }

    public regfee_sub(int reg_sub_id, int regid, String sub_regfeename, double sub_regfee_fee) {
        this.reg_sub_id = reg_sub_id;
        this.regid = regid;
        this.sub_regfeename = sub_regfeename;
        this.sub_regfee_fee = sub_regfee_fee;
    }

    public regfee_sub() {
    }

    public int getReg_sub_id() {
        return reg_sub_id;
    }

    public void setReg_sub_id(int reg_sub_id) {
        this.reg_sub_id = reg_sub_id;
    }

    public int getRegid() {
        return regid;
    }

    public void setRegid(int regid) {
        this.regid = regid;
    }

    public String getSub_regfeename() {
        return sub_regfeename;
    }

    public void setSub_regfeename(String sub_regfeename) {
        this.sub_regfeename = sub_regfeename;
    }

    public double getSub_regfee_fee() {
        return sub_regfee_fee;
    }

    public void setSub_regfee_fee(double sub_regfee_fee) {
        this.sub_regfee_fee = sub_regfee_fee;
    }
}
