package com.dwcx.spring.learn.bean;

public class Student {

    private String name;

    private int age;

    public Student() {

        System.out.println("haha");
        System.out.println("haha");
        System.out.println("haha");
        System.out.print("haha");
        System.out.print("haha");
        System.out.print("haha");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public  void hello(){
        System.out.println("hello:"+name);
    }
}