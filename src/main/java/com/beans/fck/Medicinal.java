package com.beans.fck;

public class Medicinal {
    private int mid;   // 药品标号
    private String medid; //药品标号
    private String mname;  //药品名称
    private int tid;   //药品种类标号
    private String tname;
    private Mtype mtype;  // 种类名称
    private int mcount;   // 药品库存
    private String mweight;  //重量单位
    private String mspec;  //药品规格
    private int sid; //出产厂商
    private Supplier supplier;
    private String sname;
    private String mdate;   //创建日期
    private double minprice; // 批发价
    private double moutprice; // 处方价
    private double minamount; // 批发额
    private double moutamount; // 处方额
    private String mjudge; //判断是否在维护

    private String rnum;//采购编号
    private int pid;// 采购序号

    private int cot;//数据统计


    public Medicinal() {
    }

    public int getCot() {
        return cot;
    }

    public void setCot(int cot) {
        this.cot = cot;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getRnum() {
        return rnum;
    }

    public void setRnum(String rnum) {
        this.rnum = rnum;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getMedid() {
        return medid;
    }

    public void setMedid(String medid) {
        this.medid = medid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public double getMinprice() {
        return minprice;
    }

    public void setMinprice(double minprice) {
        this.minprice = minprice;
    }

    public double getMoutprice() {
        return moutprice;
    }

    public void setMoutprice(double moutprice) {
        this.moutprice = moutprice;
    }

    public double getMinamount() {
        return minamount;
    }

    public void setMinamount(double minamount) {
        this.minamount = minamount;
    }

    public double getMoutamount() {
        return moutamount;
    }

    public void setMoutamount(double moutamount) {
        this.moutamount = moutamount;
    }

    public String getMweight() {
        return mweight;
    }

    public void setMweight(String mweight) {
        this.mweight = mweight;
    }

    public String getMjudge() {
        return mjudge;
    }

    public void setMjudge(String mjudge) {
        this.mjudge = mjudge;
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
                ", medid='" + medid + '\'' +
                ", mname='" + mname + '\'' +
                ", tid=" + tid +
                ", tname='" + tname + '\'' +
                ", mtype=" + mtype +
                ", mcount=" + mcount +
                ", mweight='" + mweight + '\'' +
                ", mspec='" + mspec + '\'' +
                ", sid=" + sid +
                ", supplier=" + supplier +
                ", sname='" + sname + '\'' +
                ", mdate='" + mdate + '\'' +
                ", minprice=" + minprice +
                ", moutprice=" + moutprice +
                ", minamount=" + minamount +
                ", moutamount=" + moutamount +
                ", mjudge='" + mjudge + '\'' +
                ", rnum='" + rnum + '\'' +
                ", pid=" + pid +
                ", cot=" + cot +
                '}';
    }
}
