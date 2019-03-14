package com.beans.fck;

import java.util.Arrays;

public class Purchase {
    private int pid; //采购编号
    private String pp;//mid的编号
    private String pname; //采购药品名
    private int sid; //生产厂商
    private String sname; //生产厂商
    private int pcount; // 数量
    private String pweight; // 重量单位
    private String pdec; //规格
    private double pinprice; // 批发价
    private double poutprice; // 处方价
    private double pinamount; // 批发额
    private double poutamount; // 处方额
    private int tid;
    private String tname;//种类名称

    private int rid;//审核id

    private int[] pids; //数组

    public Purchase() {
    }

    public int[] getPids() {
        return pids;
    }

    public void setPids(int[] pids) {
        this.pids = pids;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getPp() {
        return pp;
    }

    public void setPp(String pp) {
        this.pp = pp;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getPdec() {
        return pdec;
    }

    public void setPdec(String pdec) {
        this.pdec = pdec;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getPcount() {
        return pcount;
    }

    public void setPcount(int pcount) {
        this.pcount = pcount;
    }

    public String getPweight() {
        return pweight;
    }

    public void setPweight(String pweight) {
        this.pweight = pweight;
    }

    public double getPinprice() {
        return pinprice;
    }

    public void setPinprice(double pinprice) {
        this.pinprice = pinprice;
    }

    public double getPoutprice() {
        return poutprice;
    }

    public void setPoutprice(double poutprice) {
        this.poutprice = poutprice;
    }

    public double getPinamount() {
        return pinamount;
    }

    public void setPinamount(double pinamount) {
        this.pinamount = pinamount;
    }

    public double getPoutamount() {
        return poutamount;
    }

    public void setPoutamount(double poutamount) {
        this.poutamount = poutamount;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "pid=" + pid +
                ", pp='" + pp + '\'' +
                ", pname='" + pname + '\'' +
                ", sid=" + sid +
                ", sname='" + sname + '\'' +
                ", pcount=" + pcount +
                ", pweight='" + pweight + '\'' +
                ", pdec='" + pdec + '\'' +
                ", pinprice=" + pinprice +
                ", poutprice=" + poutprice +
                ", pinamount=" + pinamount +
                ", poutamount=" + poutamount +
                ", tid=" + tid +
                ", tname='" + tname + '\'' +
                ", rid=" + rid +
                ", pids=" + Arrays.toString(pids) +
                '}';
    }
}
