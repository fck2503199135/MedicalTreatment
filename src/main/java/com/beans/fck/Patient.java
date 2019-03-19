package com.beans.fck;

public class Patient {

    private int patid; //患者id
    private String patname; //患者名字
    private String patbirthday; //出生日期
    private int patsex; // 性别
    private String strsex;
    private int patage; // 年龄
    private String patnum; // 身份证号
    private String pataddress; //住址
    private String patallergy;// 过敏史
    private String patself;// 个人史
    private String patfamily;// 家族史
    private String patphone; // 患者手机号
    private String patsickdate; // 发病日期
    private int patdiatype; // 诊断类型
    private String str_patdiatype;
    private int patinf; // 是否传染
    private String str_patinf;
    private String patconcatname; // 紧急联系人 名字
    private String patconcatrelation; // 关系
    private String patconcatphone; // 联系方式
    private String patdoctchief; // 医生主诉
    private String patdoctdet; // 诊断详情
    private String patdoctadce; // 医生建议
    private double pathigh; // 患者身高
    private double patwight; //体重
    private int patblood; // 血型  "0" A型血 "1"B型血 "2"AB型血 "3"O型血 "4"其他
    private String strblood;
    private int patleftlisten; // 左耳听力
    private int patrightlisten; // 右耳听力
    private double patleftview; // 左视力
    private double patrightview; // 右视力
    private String patnowtime;//修改时间


    private int patdid; //医生
    private String dname;

    private int cot;//数据统计

    private Registered registered;
    private int rid;


    public Patient() {
    }

    public int getCot() {
        return cot;
    }

    public void setCot(int cot) {
        this.cot = cot;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getPatdid() {
        return patdid;
    }

    public void setPatdid(int patdid) {
        this.patdid = patdid;
    }

    public String getStr_patdiatype() {
        return str_patdiatype;
    }

    public void setStr_patdiatype(int patdiatype) {
        if(patdiatype == 0){
            this.str_patdiatype = "初诊";
        }else{
            this.str_patdiatype = "复诊";
        }

    }

    public String getStr_patinf() {
        return str_patinf;
    }

    public void setStr_patinf(int patinf) {
        if(patinf == 0){
            this.str_patinf = "是";
        }else{
            this.str_patinf = "否";
        }
    }

    public String getPatself() {
        return patself;
    }

    public void setPatself(String patself) {
        this.patself = patself;
    }

    public String getPatfamily() {
        return patfamily;
    }

    public void setPatfamily(String patfamily) {
        this.patfamily = patfamily;
    }

    public String getPatnowtime() {
        return patnowtime;
    }

    public void setPatnowtime(String patnowtime) {
        this.patnowtime = patnowtime;
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

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public Registered getRegistered() {
        return registered;
    }

    public void setRegistered(Registered registered) {
        this.registered = registered;
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

    public String getPatallergy() {
        return patallergy;
    }

    public void setPatallergy(String patallergy) {
        this.patallergy = patallergy;
    }

    public String getPatphone() {
        return patphone;
    }

    public void setPatphone(String patphone) {
        this.patphone = patphone;
    }

    public String getPatsickdate() {
        return patsickdate;
    }

    public void setPatsickdate(String patsickdate) {
        this.patsickdate = patsickdate;
    }

    public int getPatdiatype() {
        return patdiatype;
    }

    public void setPatdiatype(int patdiatype) {
        setStr_patdiatype(patdiatype);
        this.patdiatype = patdiatype;
    }

    public int getPatinf() {
        return patinf;
    }

    public void setPatinf(int patinf) {
        setStr_patinf(patinf);
        this.patinf = patinf;
    }

    public String getPatconcatname() {
        return patconcatname;
    }

    public void setPatconcatname(String patconcatname) {
        this.patconcatname = patconcatname;
    }

    public String getPatconcatrelation() {
        return patconcatrelation;
    }

    public void setPatconcatrelation(String patconcatrelation) {
        this.patconcatrelation = patconcatrelation;
    }

    public String getPatconcatphone() {
        return patconcatphone;
    }

    public void setPatconcatphone(String patconcatphone) {
        this.patconcatphone = patconcatphone;
    }

    public String getPatdoctchief() {
        return patdoctchief;
    }

    public void setPatdoctchief(String patdoctchief) {
        this.patdoctchief = patdoctchief;
    }

    public String getPatdoctdet() {
        return patdoctdet;
    }

    public void setPatdoctdet(String patdoctdet) {
        this.patdoctdet = patdoctdet;
    }

    public String getPatdoctadce() {
        return patdoctadce;
    }

    public void setPatdoctadce(String patdoctadce) {
        this.patdoctadce = patdoctadce;
    }

    public double getPathigh() {
        return pathigh;
    }

    public void setPathigh(double pathigh) {
        this.pathigh = pathigh;
    }

    public double getPatwight() {
        return patwight;
    }

    public void setPatwight(double patwight) {
        this.patwight = patwight;
    }

    public int getPatblood() {
        return patblood;
    }

    public void setPatblood(int patblood) {
        this.patblood = patblood;
    }

    public int getPatleftlisten() {
        return patleftlisten;
    }

    public void setPatleftlisten(int patleftlisten) {
        this.patleftlisten = patleftlisten;
    }

    public int getPatrightlisten() {
        return patrightlisten;
    }

    public void setPatrightlisten(int patrightlisten) {
        this.patrightlisten = patrightlisten;
    }

    public double getPatleftview() {
        return patleftview;
    }

    public void setPatleftview(double patleftview) {
        this.patleftview = patleftview;
    }

    public double getPatrightview() {
        return patrightview;
    }

    public void setPatrightview(double patrightview) {
        this.patrightview = patrightview;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patid=" + patid +
                ", patname='" + patname + '\'' +
                ", patbirthday='" + patbirthday + '\'' +
                ", patsex=" + patsex +
                ", strsex='" + strsex + '\'' +
                ", patage=" + patage +
                ", patnum='" + patnum + '\'' +
                ", pataddress='" + pataddress + '\'' +
                ", patallergy='" + patallergy + '\'' +
                ", patself='" + patself + '\'' +
                ", patfamily='" + patfamily + '\'' +
                ", patphone='" + patphone + '\'' +
                ", patsickdate='" + patsickdate + '\'' +
                ", patdiatype=" + patdiatype +
                ", str_patdiatype='" + str_patdiatype + '\'' +
                ", patinf=" + patinf +
                ", str_patinf='" + str_patinf + '\'' +
                ", patconcatname='" + patconcatname + '\'' +
                ", patconcatrelation='" + patconcatrelation + '\'' +
                ", patconcatphone='" + patconcatphone + '\'' +
                ", patdoctchief='" + patdoctchief + '\'' +
                ", patdoctdet='" + patdoctdet + '\'' +
                ", patdoctadce='" + patdoctadce + '\'' +
                ", pathigh=" + pathigh +
                ", patwight=" + patwight +
                ", patblood=" + patblood +
                ", strblood='" + strblood + '\'' +
                ", patleftlisten=" + patleftlisten +
                ", patrightlisten=" + patrightlisten +
                ", patleftview=" + patleftview +
                ", patrightview=" + patrightview +
                ", patnowtime='" + patnowtime + '\'' +
                ", patdid=" + patdid +
                ", dname='" + dname + '\'' +
                ", cot=" + cot +
                ", registered=" + registered +
                ", rid=" + rid +
                '}';
    }

}
