/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp07;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**s
 *
 * @author Jean-Claude
 */
public class Fenetre extends JFrame{
    private JPanel jpanel;
    
    public Fenetre(String nom) {
        this.setLayout(null);
        this.setTitle(nom);
        this.setSize(300, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.jpanel = new JPanel();
        this.setContentPane(jpanel);
        
        Bouton bouton = new Bouton("Bouton", 50, 50, 100, 25);
        bouton.dessine(this.jpanel.getGraphics());
        
        
        /*
        BoiteTexte boitetexte = new BoiteTexte("boitetexte", 150, 250, 100, 25);
        boitetexte.dessine(this.jpanel.getGraphics());
        */
    }
    
    public JPanel getJpanel() {
        return this.jpanel;
    }
}
