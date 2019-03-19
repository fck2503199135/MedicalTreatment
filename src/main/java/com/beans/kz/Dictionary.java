package com.beans.kz;

public class Dictionary {

    private  int did;
    private String dictionary_name;


    @Override
    public String toString() {
        return "Dictionary{" +
                "did=" + did +
                ", dictionary_name='" + dictionary_name + '\'' +
                '}';
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDictionary_name() {
        return dictionary_name;
    }

    public void setDictionary_name(String dictionary_name) {
        this.dictionary_name = dictionary_name;
    }

    public Dictionary() {
    }
}
