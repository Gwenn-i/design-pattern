package com.design.pattern;

import java.util.ArrayList;
import java.util.List;


// Component (structure composite)
public abstract class GrilleComponent {
    int largeur;
    int longueur;
    List<GrilleComponent> familles = new ArrayList<>();

  public int getLargeur() {
        return largeur;
    }

    public int getLongueur() {
        return longueur;
    }
    public GrilleComponent add(GrilleComponent grilleComponent) {
        throw new UnsupportedOperationException("Not implemented at this level");
    }
    public GrilleComponent remove(GrilleComponent grilleComponent) {
        throw new UnsupportedOperationException("Not implemented at this level");
    }
    public abstract String toString();

    String print(GrilleComponent familleComponent){
        StringBuilder builder = new StringBuilder();
        builder.append(largeur);
        builder.append(" - ");
        builder.append(longueur);
        builder.append(" - ");
        return builder.toString();
    }
}
