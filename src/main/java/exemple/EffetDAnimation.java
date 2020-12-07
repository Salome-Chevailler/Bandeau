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
public abstract class EffetDAnimation {
    
    public Bandeau monBandeau;
    protected int rep;
    protected String msg;
    
    public EffetDAnimation( Bandeau monBandeau, int rep, String msg ){
        this.monBandeau=monBandeau;
        this.msg=msg;
        this.rep=rep;
    }
    
    public abstract void jouer();
    
}
