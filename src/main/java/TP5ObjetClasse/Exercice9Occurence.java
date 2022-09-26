package TP5ObjetClasse;

import java.util.Scanner;

public class Exercice9Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un mot : ");
        String mot = sc.next();
        System.out.println("Saisir un char : ");
        char c = sc.next().charAt(0);
        Fonctions f = new Fonctions();
        System.out.println(f.Occurence(c, mot));
    }
}
