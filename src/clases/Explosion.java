/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

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
    Clip sonidoExplosion;
    
    
    public Explosion (){
        try {
            sonidoExplosion= AudioSystem.getClip();
        sonidoExplosion.open(AudioSystem.getAudioInputStream(getClass().getResource("/sonidos/explosion.wav")));
            
            imagenExp1 = ImageIO.read((getClass().getResource("/imagenes/e1.png")));
            imagenExp2 = ImageIO.read((getClass().getResource("/imagenes/e2.png")));
            
        } catch (Exception ex) {
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