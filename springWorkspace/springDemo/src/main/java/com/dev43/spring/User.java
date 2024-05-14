package com.dev43.spring;

public class User {
    private int age;

    public User() {
        System.out.println("Im User");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code() {
        System.out.println("Coding...");
    }
}
