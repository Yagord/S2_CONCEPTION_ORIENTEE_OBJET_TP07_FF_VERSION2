/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp07;

import java.awt.Graphics;
import javax.swing.JTextField;

/**
 *
 * @author Jean-Claude
 */
public class BoiteTexte extends Composant {

    public BoiteTexte(String texte, int x, int y, int largeur, int hauteur) {
        super(texte, x, y, largeur, hauteur);
    }

    @Override
    public void dessine(Graphics gfx) {
        JTextField jtextfield = new JTextField(super.getTexte());
        jtextfield.setLocation(super.getX(), super.getY());
        jtextfield.setSize(super.getLargeur(), super.getHauteur());
        jtextfield.paint(gfx);
        jtextfield.setEditable(true);
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
