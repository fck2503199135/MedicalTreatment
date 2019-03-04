package com.beans.fck;

public class Mtype {

    private int tid;
    private String tname;

    public Mtype() {
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "Mtype{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }
}
