package com.junshi.entity;

public class Person {

    private int id;

    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String name;

    @Override
    public String toString() {
        return this.name + "今年" + this.age +  "了";
    }
}
