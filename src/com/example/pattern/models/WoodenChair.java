package com.example.pattern.models;

public class WoodenChair implements IChair{
    @Override
    public void get() {
        System.out.println("This is a wooden chair");
    }
}
