/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp07;

import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author Jean-Claude
 */
public class Bouton extends Composant {

    public Bouton(String texte, int x, int y, int largeur, int hauteur) {
        super(texte, x, y, largeur, hauteur);
    }

   /* @Override
    public void dessine(Graphics gfx) {
        gfx.drawRect(super.getX(), super.getY(), super.getLargeur(), super.getHauteur());
        gfx.drawString(super.getTexte(), super.getLargeur()/2 + super.getX(), super.getHauteur()/2 + super.getY());
    }
    */
    
    @Override
    public void paintComponent(Graphics gfx) {
        super.paintComponent(gfx);
    }
    
    @Override
    public void dessine(Graphics gfx) {
        JButton jbutton = new JButton(super.getTexte());
        jbutton.setLocation(super.getX(), super.getY());
        jbutton.setSize(super.getLargeur(), super.getHauteur());
        jbutton.paint(gfx);
    }
    

    @Override
    public void clic() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clic(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
