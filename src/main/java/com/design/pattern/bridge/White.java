package com.design.pattern.bridge;

public class White implements Color {

    @Override
    public void applyColor() {
        System.out.println("Applying white color");
    }

}
