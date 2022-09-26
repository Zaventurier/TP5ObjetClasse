package TP5ObjetClasse;

import java.util.Scanner;

public class Exercice1LongeurString {
    public static void main(String[] args) {
        //Déclaration de l'objet Scanner
        Scanner sc = new Scanner(System.in);
        Fonctions f = new Fonctions();
        System.out.println("Saisir une chaîne de caractère :");
        String mot1 = sc.next();
        System.out.println("Saisir une autre chaîne de caractère :");
        String mot2 = sc.next();
        System.out.println(f.longeurMot(mot1));
        System.out.println(f.longeurMot(mot2));
    }
}
