package com.beans.kz;

public class Prescription {
    //处方附加费

    private int preid;
    private String prename;  //处方附加费名称
    private  double fee;      //金额
    private  int ptype;
    private  String ptypeStr;
    //类型中药  0  ，西药   1


    @Override
    public String toString() {
        return "Prescription{" +
                "preid=" + preid +
                ", prename='" + prename + '\'' +
                ", fee=" + fee +
                ", ptype=" + ptype +
                ", ptypeStr='" + ptypeStr + '\'' +
                '}';
    }

    public String getPtypeStr() {
        return ptypeStr;
    }

    public void setPtypeStr(int ptype) {
        if (ptype == 0){
            this.ptypeStr = "中药处方";
        }else {
            this.ptypeStr = "西药处方";
        }
    }

    public int getPtype() {
        return ptype;
    }

    public void setPtype(int ptype) {
        setPtypeStr(ptype);

        this.ptype = ptype;
    }

    public Prescription() {
    }

    public Prescription(int preid, String prename, double fee, int ptype) {
        this.preid = preid;
        this.prename = prename;
        this.fee = fee;
        this.ptype = ptype;
    }


    public int getPreid() {
        return preid;
    }

    public void setPreid(int preid) {
        this.preid = preid;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }


}
