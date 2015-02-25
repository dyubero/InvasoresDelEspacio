
package clases;

import java.awt.Image;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author xp
 */
public class Disparo {
   Image imagenDisparo = null;
    //coordenadas del disparo
   private int x = 0;
   private int y = 0;
   Clip sonidoDisparo;
   
   
   public Disparo(){
        try {
            //sonido del disparo
        sonidoDisparo= AudioSystem.getClip();
        sonidoDisparo.open(AudioSystem.getAudioInputStream(getClass().getResource("/sonidos/laser.wav")));
            imagenDisparo = ImageIO.read((getClass().getResource("/imagenes/disparo.png")));
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
   
}
