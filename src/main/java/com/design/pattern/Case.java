package com.design.pattern;

// Leaf (structure composite)
public class Case extends GrilleComponent {

    public Case(int largeur, int longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    @Override
    public String toString() {
       return print(this);
    }
}
