package bataillenavale;

import java.util.Scanner;

public class BatailleNavale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Lancement du jeu
        Scanner sc;
            sc = new Scanner(System.in);
        int largeur;
        int hauteur;
        
        System.out.println("Bienvenue! Pour creer une partie de bataille navale, veuillez choisir les dimensions de la grille : ");
        System.out.println("Largeur :");
            largeur = sc.nextInt();
        System.out.println("Hauteur :");
            hauteur = sc.nextInt();
        
        Grille baseNavale = new Grille(largeur, hauteur);
        
        baseNavale.grille[2][2]=1;
        
        System.out.println(baseNavale.grille[4][4]);
        System.out.println(baseNavale.grille[1][6]);
        

    }
    
}