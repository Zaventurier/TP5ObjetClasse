package TP5ObjetClasse;

import java.util.Scanner;

public class Exercice5MotVertical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fonctions f = new Fonctions();
        System.out.println("Saisir un mot :");
        String mot = sc.next();
        for(int i = 0; i<mot.length();i++){
            System.out.println(f.caractere(i,mot));
        }
    }
}
