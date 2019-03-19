package com.beans.kz;

public class Hospital {

    //诊所

    private  int id;
    private  String hname;
    //诊所名称
    private  String owner_name;
    //拥有者名称
    private  String owner_post;
    //拥有者职务
    private  String address;
    //诊所地址
    private  String major;
    //专业方向
    private  String introduction;
    //诊所简介


    @Override
    public String toString() {
        return "Hospital{" +
                "id=" + id +
                ", hname='" + hname + '\'' +
                ", owner_name='" + owner_name + '\'' +
                ", owner_post='" + owner_post + '\'' +
                ", address='" + address + '\'' +
                ", major='" + major + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }

    public Hospital() {
    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getOwner_post() {
        return owner_post;
    }

    public void setOwner_post(String owner_post) {
        this.owner_post = owner_post;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
