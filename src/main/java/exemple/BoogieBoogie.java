/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import static java.lang.Thread.sleep;
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
    
    public void jouer(){
       monBandeau.setMessage(msg); 
       
       while(clignote){
           monBandeau.setBackground(Color.red);
           monBandeau.setForeground(Color.white);
           try{
               sleep(5);
           } catch (InterruptedException e){
           }
           
           monBandeau.setBackground(Color.blue);
           monBandeau.setForeground(Color.yellow);
           try{
               sleep(5);
           } catch (InterruptedException e){
           }
       }
    }
    
}
