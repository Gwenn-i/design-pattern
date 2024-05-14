package com.design.pattern.bridge;

public class Rabbit2 extends Animal {

    public Rabbit2(Color color) {
        super(color);
    }

    @Override
    public void applyColor(){
        color.applyColor();
    }
}