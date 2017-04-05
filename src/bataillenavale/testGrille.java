package bataillenavale;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class testGrille extends TestCase {
    
    @Test
    // Les cases de la grille doivent être égales à 0
    public void testValeurGrille(){
    	Grille grilleTest = new Grille(5, 5);
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){       
                assertEquals(0, grilleTest.grille[i][j]);    
            }
        }
        
    }
    
    @Test(expected=Class<T extends ArrayIndexOutOfBoundsException>)
    // La largeur et la longueur maximale (4,4 dans un test de tableau 5,5)
    public void testMaxDimensions() {
    	Grille grilleTest = new Grille(5, 5);
       // Assert.assertNotEquals(0, grilleTest.grille[5][5]);    
        assertEquals(NULL, grilleTest.grille[5][5]);
        
    }

}
// Voir la syntaxe de l'exception
// Normalement avec les getters et setters 5/5 est mis à Null donc on peut amener ça
// Mettre un fail
