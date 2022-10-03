package TP5ObjetClasse;

import java.io.File;

public class Exercice13NomFichier {
    public static void main(String[] args) {
        String nomDossier = "C:\\Users\\pasca\\OneDrive\\Documents\\Cours BTS\\COURS2022\\Anglais";
        File Dossier = new File(nomDossier);
        String nomFichier = "C:\\Users\\pasca\\OneDrive\\Documents\\Cours BTS\\COURS2022\\Anglais\\ExpressionEcrite";
        File fichier = new File(nomFichier);

        if(Dossier.exists()){
            System.out.println("Dossier présent");
        }
        if(fichier.exists()){
            System.out.println("Fichier présent");
        }
        if(Dossier.isDirectory()){
            System.out.println("C'est un dossier");
        }
        System.out.println(Dossier.toURI());
        System.out.println(Dossier.toString());
    }
}
