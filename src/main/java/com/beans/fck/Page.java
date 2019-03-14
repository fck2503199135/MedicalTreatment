package com.beans.fck;

public class Page {
    private int limit;
    private int offset;//传递参数

    private int tid;//药品类别
    private String mname;//药品名称
    private int mjudge;//判断字段

    private String name;//供应商和联系人名称,患者名

    private int sid;//生产商名称

    private String rnum; //制单号
    private String sdate; //开始时间
    private String edate; // 结束时间
    private int rstate; //判断字段

    private int rid; //挂号序号

    private String getname; //通过药品与检查项目名
    private String byname;

    private String patphone; //患者手机号

    private int[] pids;

    public Page() {

    }

    public int[] getPids() {
        return pids;
    }

    public void setPids(int[] pids) {
        this.pids = pids;
    }

    public String getPatphone() {
        return patphone;
    }

    public void setPatphone(String patphone) {
        this.patphone = patphone;
    }

    public String getByname() {
        return byname;
    }

    public void setByname(String byname) {
        this.byname = byname;
    }

    public String getGetname() {
        return getname;
    }

    public void setGetname(String getname) {
        this.getname = getname;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getRstate() {
        return rstate;
    }

    public void setRstate(int rstate) {
        this.rstate = rstate;
    }

    public String getEdate() {
        return edate;
    }

    public void setEdate(String edate) {
        this.edate = edate;
    }

    public String getRnum() {
        return rnum;
    }

    public void setRnum(String rnum) {
        this.rnum = rnum;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMjudge() {
        return mjudge;
    }

    public void setMjudge(int mjudge) {
        this.mjudge = mjudge;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    @Override
    public String toString() {
        return "Page{" +
                "limit=" + limit +
                ", offset=" + offset +
                ", tid=" + tid +
                ", mname='" + mname + '\'' +
                ", mjudge=" + mjudge +
                ", name='" + name + '\'' +
                ", sid=" + sid +
                ", rnum='" + rnum + '\'' +
                ", sdate='" + sdate + '\'' +
                ", edate='" + edate + '\'' +
                ", rstate=" + rstate +
                ", rid=" + rid +
                '}';
    }
}
