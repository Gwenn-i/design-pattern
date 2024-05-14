package com.design.pattern.bridge;

public class Fox2 extends Animal {

    public Fox2(Color color) {
        super(color);
    }

    @Override
    public void applyColor(){
        color.applyColor();
    }
}