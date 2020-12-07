package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lisa
 */
public class DoigtDerriere extends EffetDAnimation {
    
    public DoigtDerriere(Bandeau monBandeau, int rep, String msg){
        super(monBandeau, rep, msg);
    }
    
    public void jouer(){
        monBandeau.setMessage(msg);
        for (int i=60; i>5; i-=5 ){
            monBandeau.setFont ( new Font ("Dialog", Font.ITALIC, 5-i));
            monBandeau.setBackground(Color.BLUE);
            monBandeau.setForeground(Color.PINK);
            monBandeau.sleep(100);
        }
    }
    
}
