package com.example.logankrause.homework2;

public class Test {

    private String name;
    private String year;
    private int age;

    Test(String name, String year, int age) {
        this.name = name;
        this.year = year;
        this.age = age;
    }

    public String getData() {
        return "Info: " + name + year + age;
    }

}
