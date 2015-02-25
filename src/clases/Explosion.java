/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Dani
 */

   
public class Explosion {
    Image imagenExp1 = null;
    Image imagenExp2 = null;
    
    
    private int x = 0;
    private int y = 0;
    private int tiempoDeVida = 35 ;
    public Explosion (){
        try {
            imagenExp1 = ImageIO.read((getClass().getResource("/imagenes/e1.png")));
            imagenExp2 = ImageIO.read((getClass().getResource("/imagenes/e2.png")));
            
        } catch (IOException ex) {
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getTiempoDeVida() {
        return tiempoDeVida;
    }

    public void setTiempoDeVida(int tiempoDeVida) {
        this.tiempoDeVida = tiempoDeVida;
    }

    
}