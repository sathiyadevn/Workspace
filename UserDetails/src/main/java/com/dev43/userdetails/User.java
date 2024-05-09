package com.dev43.userdetails;

public class User {
    private int uid;
    private String name;
    private String tech;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "UserDetails {" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
