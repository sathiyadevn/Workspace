package com.dev43.spring;

public class User {
    private int age;
    private  Laptop laptop;

    public User(int age, Laptop laptop) {
        this.age = age;
        this.laptop = laptop;
    }

    public void code() {
        System.out.println("Coding...");
        laptop.compile();
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

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
