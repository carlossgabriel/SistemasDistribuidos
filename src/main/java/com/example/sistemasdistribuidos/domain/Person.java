package com.example.sistemasdistribuidos.domain;

public class Person {

    private int code;
    private String name;

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
