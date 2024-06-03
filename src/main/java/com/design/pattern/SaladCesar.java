package com.design.pattern;

public class SaladCesar extends SaladDecorator {

    public SaladCesar(Salad customSalade) {
        super(customSalade);
    }

    @Override
    public String prepare() {
        return customSalade.prepare() + addMeat();
    }

    private String addMeat() {
       return " with Meat";
    }
}
