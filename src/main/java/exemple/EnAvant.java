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
public class EnAvant extends EffetDAnimation {

    public EnAvant(Bandeau bandeau, int rep, String msg) {
        super(bandeau, rep, msg);
    }

    public void jouer() {
        monBandeau.setMessage(msg);
        for (int i = 15; i < 60; i += 20) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, i));
            monBandeau.sleep(1000);
        }

    }
}
