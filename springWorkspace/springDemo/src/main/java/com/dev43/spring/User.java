package com.dev43.spring;

public class User {
    private int age;
    private Computer com;

    public void code() {
        System.out.println("Coding...");
        com.compile();
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }


//    public User(int age, Laptop laptop) {
//        this.age = age;
//        this.laptop = laptop;
//    }

//    public User() {
//        System.out.println("Im User");
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
