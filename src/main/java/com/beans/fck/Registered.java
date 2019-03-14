package com.beans.fck;

public class Registered {
    private int rid;
    private int did; // 医生
    private String dname;
    private int deptid; // 科室
    private String deptname;
    private String rpatregtime;//挂号日期
    private int rpatdate; //上午 下午
    private String strdate;
    private double rpatregmoney;//挂号费
    private int regid; // 挂号类型
    private String regname;
    private int patid; //患者id
    private String patname; //患者名字
    private String patbirthday; //出生日期
    private int patsex; // 性别
    private String strsex;
    private int patage; // 年龄
    private String patphone; // 患者手机号
    private String patnum; // 身份证号
    private String pataddress; //住址

    private int regde; //是否就诊
    private String regvisitdate;//就诊时间

    public Registered() {
    }

    public String getRegvisitdate() {
        return regvisitdate;
    }

    public void setRegvisitdate(String regvisitdate) {
        this.regvisitdate = regvisitdate;
    }

    public String getStrsex() {
        return strsex;
    }

    public void setStrsex(int patsex) {
        if(patsex == 0){
            this.strsex = "男";
        }else{
            this.strsex = "女";
        }

    }

    public int getRegde() {
        return regde;
    }

    public void setRegde(int regde) {
        this.regde = regde;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getPatphone() {
        return patphone;
    }

    public void setPatphone(String patphone) {
        this.patphone = patphone;
    }

    public String getStrdate() {
        return strdate;
    }

    public void setStrdate(int rpatdate) {
        if(rpatdate==0){
            this.strdate = "全天";
        }else if(rpatdate==1){
            this.strdate = "上午";
        }else {
            this.strdate = "下午";
        }

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

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getRpatregtime() {
        return rpatregtime;
    }

    public void setRpatregtime(String rpatregtime) {
        this.rpatregtime = rpatregtime;
    }

    public int getRpatdate() {
        return rpatdate;
    }

    public void setRpatdate(int rpatdate) {
        setStrdate(rpatdate);
        this.rpatdate = rpatdate;
    }

    public double getRpatregmoney() {
        return rpatregmoney;
    }

    public void setRpatregmoney(double rpatregmoney) {
        this.rpatregmoney = rpatregmoney;
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

    public int getPatid() {
        return patid;
    }

    public void setPatid(int patid) {
        this.patid = patid;
    }

    public String getPatname() {
        return patname;
    }

    public void setPatname(String patname) {
        this.patname = patname;
    }

    public String getPatbirthday() {
        return patbirthday;
    }

    public void setPatbirthday(String patbirthday) {
        this.patbirthday = patbirthday;
    }

    public int getPatsex() {
        return patsex;
    }

    public void setPatsex(int patsex) {
        setStrsex(patsex);
        this.patsex = patsex;
    }

    public int getPatage() {
        return patage;
    }

    public void setPatage(int patage) {
        this.patage = patage;
    }

    public String getPatnum() {
        return patnum;
    }

    public void setPatnum(String patnum) {
        this.patnum = patnum;
    }

    public String getPataddress() {
        return pataddress;
    }

    public void setPataddress(String pataddress) {
        this.pataddress = pataddress;
    }

    @Override
    public String toString() {
        return "Registered{" +
                "rid=" + rid +
                ", did=" + did +
                ", dname='" + dname + '\'' +
                ", deptid=" + deptid +
                ", deptname='" + deptname + '\'' +
                ", rpatregtime='" + rpatregtime + '\'' +
                ", rpatdate=" + rpatdate +
                ", strdate='" + strdate + '\'' +
                ", rpatregmoney=" + rpatregmoney +
                ", regid=" + regid +
                ", regname='" + regname + '\'' +
                ", patid=" + patid +
                ", patname='" + patname + '\'' +
                ", patbirthday='" + patbirthday + '\'' +
                ", patsex=" + patsex +
                ", strsex='" + strsex + '\'' +
                ", patage=" + patage +
                ", patphone='" + patphone + '\'' +
                ", patnum='" + patnum + '\'' +
                ", pataddress='" + pataddress + '\'' +
                ", regde=" + regde +
                ", regvisitdate='" + regvisitdate + '\'' +
                '}';
    }
}
