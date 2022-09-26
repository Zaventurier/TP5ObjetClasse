package TP5ObjetClasse;

import java.util.Scanner;

public class Exercice8Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fonctions f = new Fonctions();
        System.out.println("Saisir un mot :");
        String mot = sc.next();
        if(f.motALenvers(mot).equals(mot)){
            System.out.println("Palaindrome");
        }else{
            System.out.println("Pas Palaindrome");
        }
    }
}
