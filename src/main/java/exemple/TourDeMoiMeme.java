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
public class TourDeMoiMeme extends EffetDAnimation {
   
    public TourDeMoiMeme(Bandeau monBandeau, int rep, String msg){
        super(monBandeau, rep, msg);
    }
    
    public void jouer(){
        monBandeau.setMessage(msg);
        for (int i=0; i<=100; i++){
            monBandeau.setBackground(Color.WHITE);
            monBandeau.setRotation(2*Math.PI*i/100);
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 30));
            monBandeau.sleep(100);
        }
    }
}
