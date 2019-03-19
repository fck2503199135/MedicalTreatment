package com.beans.kz;

public class Inspectionfee {

    // 检查项目费
        private  int insid;     //项目编号
        private  String insname;  //项目名称
        private  String  iclass;  //项目类别
        private  double unitprice; //项目单价
        private  double cost;//项目成本
        private  int create_time;  //创建时间
        private  int update_time; //修改时间
        private  String unit;  //单位
        private  int  classid; //类别id


    @Override
    public String toString() {
        return "Inspectionfee{" +
                "insid=" + insid +
                ", insname='" + insname + '\'' +
                ", iclass='" + iclass + '\'' +
                ", unitprice=" + unitprice +
                ", cost=" + cost +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                ", unit='" + unit + '\'' +
                ", classid=" + classid +
                '}';
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Inspectionfee(int insid, String insname, String iclass, double unitprice, int create_time, int update_time, String unit, int classid) {
        this.insid = insid;
        this.insname = insname;
        this.iclass = iclass;
        this.unitprice = unitprice;
        this.create_time = create_time;
        this.update_time = update_time;
        this.unit = unit;
        this.classid = classid;
    }

    public Inspectionfee() {
    }

    public int getInsid() {
        return insid;
    }

    public void setInsid(int insid) {
        this.insid = insid;
    }

    public String getInsname() {
        return insname;
    }

    public void setInsname(String insname) {
        this.insname = insname;
    }

    public String getIclass() {
        return iclass;
    }

    public void setIclass(String iclass) {
        this.iclass = iclass;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public int getCreate_time() {
        return create_time;
    }

    public void setCreate_time(int create_time) {
        this.create_time = create_time;
    }

    public int getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(int update_time) {
        this.update_time = update_time;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }
}
