package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Choisissez un operateur: -,+,/,*");
        Calcule monCalcule = new Calcule(1,2,"");

        Scanner sc = new Scanner(System.in);
         monCalcule.setOperateur(sc.nextLine());

        System.out.println("Entrez l'operannde 1");
        monCalcule.setOperande1(sc.nextInt());

        System.out.println("Entrez l'operande 2");
        //int operandeB=sc.nextInt();
        monCalcule.setOperande2(sc.nextInt());

        int resultat = 0;

        if (monCalcule.getOperateur().equals("+")){ // si opérateur de monCalcul est + alors on fait l'addition

            resultat = Calcule.addition(monCalcule.getOperande1(),monCalcule.getOperande2()); // on fait l'addition
            System.out.println(resultat);
        }
        if (monCalcule.getOperateur().equals("-")){ // si opérateur de monCalcul est - alors on fait la soustraction

            resultat = Calcule.soustraction(monCalcule.getOperande1(),monCalcule.getOperande2()); // on fait la soustraction
            System.out.println(resultat);
        }

    }
}
