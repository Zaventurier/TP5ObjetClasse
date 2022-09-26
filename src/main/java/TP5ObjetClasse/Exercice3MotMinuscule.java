package TP5ObjetClasse;

import java.util.Scanner;

public class Exercice3MotMinuscule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fonctions f = new Fonctions();
        System.out.println("Saisir mot :");
        String mot = sc.next();
        System.out.println(f.motMinuscule(mot));
    }
}
