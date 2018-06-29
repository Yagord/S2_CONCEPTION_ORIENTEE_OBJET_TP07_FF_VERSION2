/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp07;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jean-Claude
 */
public class TP07 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fenetre fenetre = new Fenetre("TP07");
        
        JPanel jpanel = fenetre.getJpanel();
        
        Bouton bouton = new Bouton("Bouton", 50, 50, 100, 25);
        bouton.dessine(jpanel.getGraphics());
        jpanel.add(bouton);
        
        BoiteTexte boitetexte = new BoiteTexte("boitetexte", 150, 150, 100, 25);
        boitetexte.dessine(jpanel.getGraphics());
    }
    
}
