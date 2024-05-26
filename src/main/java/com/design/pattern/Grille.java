package com.design.pattern;

import java.util.Iterator;

// Composite (structure composite)
public class Grille extends GrilleComponent {

   public Grille(int largeur, int longueur){
        this.largeur = largeur;
        this.longueur = longueur;
   }
    @Override
   public GrilleComponent add(GrilleComponent familleComponent) {
    this.familles.add(familleComponent);
    return familleComponent;
   }
   @Override
   public GrilleComponent remove(GrilleComponent familleComponent) {
    this.familles.remove(familleComponent);
    return familleComponent;
   }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(print(this));

        Iterator<GrilleComponent> iterator = familles.iterator();
        while (iterator.hasNext()) {
            GrilleComponent familleComponent = iterator.next();
            builder.append(familleComponent.toString());
        }

        return builder.toString();
    }

}
