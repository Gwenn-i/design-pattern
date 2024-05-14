package com.design.pattern.bridge;

public class Dog2 extends Animal {

    public Dog2(Color color) {
        super(color);
    }

    @Override
    public void applyColor(){
        color.applyColor();
    }
}