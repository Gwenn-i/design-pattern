package com.design.pattern;

public abstract class SaladDecorator implements Salad {

    protected Salad customSalade;

    public SaladDecorator(Salad customSalade) {
        this.customSalade = customSalade;
    }

    @Override
    public String prepare() {
        return this.customSalade.prepare();
    }
}
