/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Font;

/**
 *
 * @author Salomé Chevailler
 */
public class DoigtDevant extends EffetDAnimation {

    public DoigtDevant(Bandeau bandeau, int rep, String msg) {
        super(bandeau, rep, msg);
    }

    public void jouer() {
        monBandeau.setMessage(msg);
        for (int i = 5; i < 60; i += 5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            monBandeau.sleep(100);
        }
    }
}
