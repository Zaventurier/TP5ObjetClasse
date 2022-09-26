package TP5ObjetClasse;

import java.util.Scanner;

public class Exercice6MotaLenvers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fonctions f = new Fonctions();
        System.out.println("Saisir un mot :");
        String mot = sc.next();
        System.out.println(f.motALenvers(mot));
        /*
        for(int i = mot.length();i>=0;i--){
            System.out.println(f.caractere(i,mot));
        }*/
    }
}
