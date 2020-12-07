/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
import static sun.jvm.hotspot.runtime.PerfMemory.start;

/**
 *
 * @author Lisa
 */
public class BoogieBoogie extends EffetDAnimation {
   
    protected boolean clignote;
    
    public BoogieBoogie (Bandeau monBandeau, int rep, String msg){
        super(monBandeau, rep, msg);
    }
   
    
    
   public void demarrer(){
        clignote = true;
        start();
    }
    
    public void arreter(){
        clignote = false;
    }
    
    @Override
    public void jouer(){
       monBandeau.setMessage(msg); 
       
       for (int i=0; i<=94; i+=3){
           monBandeau.setBackground(Color.CYAN);
           monBandeau.setForeground(Color.ORANGE);
           monBandeau.sleep(5);
           }
       
       for (int i=3; i<=97; i+=3){
           monBandeau.setBackground(Color.red);
           monBandeau.setForeground(Color.white);
           monBandeau.sleep(5);
           }
        
        for (int i=6; i<=100; i+=3){
           monBandeau.setFont(new Font("Dialog3", Font.CENTER_BASELINE, 5 + i));
           monBandeau.setBackground(Color.blue);
           monBandeau.setForeground(Color.yellow);
           monBandeau.sleep(5);  
       }
        monBandeau.sleep(100);
        
    }
    
}
