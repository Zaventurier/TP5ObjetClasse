package TP5ObjetClasse;

import java.util.Scanner;

public class Exercice4CaractereMot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fonctions f = new Fonctions();
        System.out.println("Saisir un mot :");
        String mot = sc.next();
        System.out.println(f.caractere(0,mot));
        System.out.println(f.caractere(1,mot));

    }
}
