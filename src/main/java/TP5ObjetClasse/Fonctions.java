package TP5ObjetClasse;


public class Fonctions {
    //Fichier contenant les fonctions
    public static int longeurMot(String mot) {
        return mot.length();
    }

    public static String motMajuscule(String mot) {
        return mot.toUpperCase();
    }

    public static String motMinuscule(String mot) {
        return mot.toLowerCase();
    }

    public static char caractere(int indice, String mot) {
        return mot.charAt(indice);
    }

    public static String motALenvers(String mot) {
        StringBuilder strb = new StringBuilder(mot);
        mot = strb.reverse().toString();
        return mot;

    }

    public static boolean motEgaux(String mot1, String mot2) {
        if (mot1.equals(mot2)) {
            return true;
        } else {
            return false;
        }
    }

    public static int Occurence(char c, String mot) {
        int j = 0;
        for (int i = mot.length(); mot.length() <= 0; i++) {
            if (mot.charAt(i) == c) {
                j++;
            }
        }return j;

    }
}
