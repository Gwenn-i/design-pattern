package com.design.pattern;

public class SaladVeggie extends SaladDecorator {

    public SaladVeggie(Salad customSalade) {
        super(customSalade);
    }

    @Override
    public String prepare() {
        return customSalade.prepare() + addSeed();
    }

    private String addSeed() {
       return " with nuts, almond";
    }
}