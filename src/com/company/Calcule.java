package com.company;

public class Calcule {
    private int operande1;
    private int operande2;
    String operateur;

    public Calcule(int operande1, int operande2, String operateur) {
        this.operande1 = operande1;
        this.operande2 = operande2;
        this.operateur = operateur;
    }

    public int getOperande1() {
        return operande1;
    }

    public void setOperande1(int operande1) {
        this.operande1 = operande1;
    }

    public int getOperande2() {
        return operande2;
    }

    public void setOperande2(int operande2) {
        this.operande2 = operande2;
    }

    public String getOperateur() {
        return operateur;
    }

    public void setOperateur(String operateur) {
        this.operateur = operateur;
    }

    public static int addition(int operande1, int operande2) {
        int resultat = 0;
        resultat = operande1 + operande2;
        return resultat;
    }

    public static int soustraction(int operande1, int operande2) {
        int resultat = 0;
        resultat = operande1 - operande2;
        return resultat;
    }

    public static int multiplication(int operande1, int operande2) {
        int resultat = 0;
        resultat = operande1 * operande2;
        return resultat;
    }

    public static int division(int operande1, int operande2) {
        int resultat = 0;
        resultat = operande1 / operande2;
        return resultat;
    }
}