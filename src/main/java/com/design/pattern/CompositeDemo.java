package com.design.pattern;

public class CompositeDemo 
{
    public static void main( String[] args )
    {
    
    //But: utiliser design pattern composite (type structural) 
    // Une grille peut contenir une case
    
      Grille grille = new Grille(50,50);

      Case caseTop = new Case(20, 21);
      grille.add(caseTop);

      Case caseLeft = new Case(10, 23);
      grille.add(caseLeft);
      
      Grille grille2 = new Grille(20,20);
      Case caseRight = new Case(2, 3);
      grille2.add(caseRight);

      System.out.println(grille);
    }
}
