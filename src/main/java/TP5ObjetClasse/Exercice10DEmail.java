package TP5ObjetClasse;

import java.util.Scanner;

public class Exercice10DEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fonctions f = new Fonctions();
        System.out.println("Saisir adresse mail :");
        String email = sc.next();
        f.dEmail(email);
    }
}
