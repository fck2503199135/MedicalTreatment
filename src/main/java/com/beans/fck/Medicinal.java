package com.beans.fck;

public class Medicinal {
    private int mid;   // 药品标号
    private String mname;  //药品名称
    private int tid;   //药品种类标号
    private Mtype mtype;  // 种类名称
    private int mcount;   // 药品数量
    private String mspec;  //药品规格
    private String mfactory; //出产厂商
    private String mdate;   //出产日期


    public Medicinal() {
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public Mtype getMtype() {
        return mtype;
    }

    public void setMtype(Mtype mtype) {
        this.mtype = mtype;
    }

    public int getMcount() {
        return mcount;
    }

    public void setMcount(int mcount) {
        this.mcount = mcount;
    }

    public String getMspec() {
        return mspec;
    }

    public void setMspec(String mspec) {
        this.mspec = mspec;
    }

    public String getMfactory() {
        return mfactory;
    }

    public void setMfactory(String mfactory) {
        this.mfactory = mfactory;
    }

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }

    @Override
    public String toString() {
        return "Medicinal{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", tid=" + tid +
                ", mtype=" + mtype +
                ", mcount=" + mcount +
                ", mspec='" + mspec + '\'' +
                ", mfactory='" + mfactory + '\'' +
                ", mdate='" + mdate + '\'' +
                '}';
    }
}
