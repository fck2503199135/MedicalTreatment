package com.beans.fck;

public class Supplier {
    private int sid; //供应商标号
    private String sname; //供应商名称
    private String saddress; //供应商地址
    private String speoname; // 联系人名称
    private String slandline; // 供应商座机
    private String smphone; // 供应商手机
    private String sbank; // 银行账号
    private String sdate; //创建日期

    public Supplier() {
    }

    public Supplier(String sname, String saddress, String speoname, String slandline, String smphone, String sbank, String sdate) {
        this.sname = sname;
        this.saddress = saddress;
        this.speoname = speoname;
        this.slandline = slandline;
        this.smphone = smphone;
        this.sbank = sbank;
        this.sdate = sdate;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public String getSpeoname() {
        return speoname;
    }

    public void setSpeoname(String speoname) {
        this.speoname = speoname;
    }

    public String getSlandline() {
        return slandline;
    }

    public void setSlandline(String slandline) {
        this.slandline = slandline;
    }

    public String getSmphone() {
        return smphone;
    }

    public void setSmphone(String smphone) {
        this.smphone = smphone;
    }

    public String getSbank() {
        return sbank;
    }

    public void setSbank(String sbank) {
        this.sbank = sbank;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", saddress='" + saddress + '\'' +
                ", speoname='" + speoname + '\'' +
                ", slandline='" + slandline + '\'' +
                ", smphone='" + smphone + '\'' +
                ", sbank='" + sbank + '\'' +
                ", sdate='" + sdate + '\'' +
                '}';
    }
}
