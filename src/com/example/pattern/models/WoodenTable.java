package com.example.pattern.models;

public class WoodenTable implements ITable{
    @Override
    public void get() {
        System.out.println("This is a wooden table");
    }
}
