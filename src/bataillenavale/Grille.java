package bataillenavale;

public class Grille {
    
    protected int grille[][];
    
    public Grille(int largeur, int hauteur) {
        
            this.grille = new int[largeur][hauteur];
            
            for(int i = 1; i > largeur; i++) {
                for (int j = 1; j > hauteur; j++) {
                    grille[i][j] = 0;
                }
            }
    }
}