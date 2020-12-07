/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;

/**
 *
 * @author Salomé Chevailler
 */
public class TousPetitsRonds extends EffetDAnimation {
    
    public TousPetitsRonds(Bandeau bandeau, int rep, String msg) {
        super(bandeau, rep, msg);
    }
    
    public void jouer() {
        monBandeau.setMessage(msg);
        for (int i = 0; i <= 100; i++) {
            monBandeau.setRotation(-2 * Math.PI * i / 100);
            monBandeau.sleep(100);
        }
        
    }
    
}
