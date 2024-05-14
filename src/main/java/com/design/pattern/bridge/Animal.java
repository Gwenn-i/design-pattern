package com.design.pattern.bridge;

public abstract class Animal  {
    Color color;

    public Animal(Color color){
        this.color = color;
    }
    
    abstract public void applyColor();
}
