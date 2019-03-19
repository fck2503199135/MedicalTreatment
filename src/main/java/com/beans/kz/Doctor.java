package com.beans.kz;

public class Doctor {
    private int did;//   id
    private String dname;   //姓名
    private int dage;   //年龄
    private String dpicture;   //头像图片
    private int dsex;       //性别
    private String dphone;   // 电话
    private String dstrong; //  擅长
    private String introduction;  //  简介
    private int  donline;   //  是否在线
    private int deptid;   //   科室id
    private String deptname; //科室名称
    private int postid; //职务id
    private String postname;  //职务名称

    private String dsexStr;


    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }



    public String getDsexStr() {
        return dsexStr;
    }

    public void setDsexStr(int dsex) {

        if (dsex == 0){
            this.dsexStr = "男";
        }else {
            this.dsexStr = "女";
        }


    }

    @Override
    public String toString() {
        return "Doctor{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", dage=" + dage +
                ", dpicture='" + dpicture + '\'' +
                ", dsex=" + dsex +
                ", dphone='" + dphone + '\'' +
                ", dstrong='" + dstrong + '\'' +
                ", introduction='" + introduction + '\'' +
                ", donline=" + donline +
                ", deptid=" + deptid +
                ", deptname='" + deptname + '\'' +
                ", postid=" + postid +
                ", postname='" + postname + '\'' +
                ", dsexStr='" + dsexStr + '\'' +
                '}';
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }

    public int getPostid() {
        return postid;
    }

    public void setPostid(int postid) {
        this.postid = postid;
    }

    public Doctor(int did, String dname, int dage, String dpicture, int dsex, String dphone, String dstrong, String introduction, int donline, int deptid) {
        this.did = did;
        this.dname = dname;
        this.dage = dage;
        this.dpicture = dpicture;
        this.dsex = dsex;
        this.dphone = dphone;
        this.dstrong = dstrong;
        this.introduction = introduction;
        this.donline = donline;
        this.deptid = deptid;
    }

    public Doctor() {
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getDage() {
        return dage;
    }

    public void setDage(int dage) {
        this.dage = dage;
    }

    public String getDpicture() {
        return dpicture;
    }

    public void setDpicture(String dpicture) {
        this.dpicture = dpicture;
    }

    public int getDsex() {
        return dsex;
    }

    public void setDsex(int dsex) {
        setDsexStr(dsex);
        this.dsex = dsex;
    }

    public String getDphone() {
        return dphone;
    }

    public void setDphone(String dphone) {
        this.dphone = dphone;
    }

    public String getDstrong() {
        return dstrong;
    }

    public void setDstrong(String dstrong) {
        this.dstrong = dstrong;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getDonline() {
        return donline;
    }

    public void setDonline(int donline) {
        this.donline = donline;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }
}
