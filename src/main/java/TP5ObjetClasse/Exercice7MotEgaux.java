package TP5ObjetClasse;

import java.util.Scanner;

public class Exercice7MotEgaux {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fonctions f = new Fonctions();
        System.out.println("Saisir mot 1 :");
        String mot1 = sc.next();
        System.out.println("Saisir mot 2 :");
        String mot2 = sc.next();
        if(f.motEgaux(mot1,mot2) == true){
            System.out.println("Les 2 mots sont les mêmes !");
        }else{
            System.out.println("Les 2 mots sont differents !");
        }
    }
}
