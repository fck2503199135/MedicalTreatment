package com.beans.kz;

public class Post {

    private  int id;
    private  String postname;
    private  String power;


    public Post(int id, String postname, String power) {
        this.id = id;
        this.postname = postname;
        this.power = power;
    }

    public Post() {
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", postname='" + postname + '\'' +
                ", power='" + power + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
