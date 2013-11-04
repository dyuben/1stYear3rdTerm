/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package images;

/**
 *
 * @author Informatics
 */
import java.applet.*;
import java.awt.*;

public class Images extends Applet {
    
    Image newimage;
    AudioClip music;
    public void init()
    {
        newimage = getImage (getDocumentBase(), "star.png");
        music = getAudioClip (getDocumentBase(),"");
        music.play();
        music.loop();
    }
    
    public void paint(Graphics g)
    {
        g.drawImage(newimage,100,100,100,80,this);
    }
        
    /**
     * @param args the command line arguments
     */
   
}
