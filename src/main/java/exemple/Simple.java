/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;

/**
 *
 * @author Lisa
 */
public class Simple extends EffetDAnimation {
    
    public Simple(Bandeau bandeau, int rep, String msg) {
        super(bandeau, rep, msg);
    }
        
    public void jouer(){
        monBandeau.setMessage(msg);
        monBandeau.sleep(100);
    }
}
