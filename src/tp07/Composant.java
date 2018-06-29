/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp07;

import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author Jean-Claude
 */
public abstract class Composant extends JComponent{
    private String texte;
    private int x;
    private int y;
    private int largeur;
    private int hauteur;

    public String getTexte() {
        return texte;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }
    
    public Composant(String texte, int x, int y, int largeur, int hauteur) {
        this.texte = texte;
        this.x = x;
        this.y = y;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    
    public abstract void dessine(Graphics gfx);
    
    public abstract void clic();
    
    public abstract void clic(int x, int y);
    
    public void chercheComposant(int x, int y) {
        
    }
    
    public Composant getComposant(String texte) {
        return this;
    }
    
}
