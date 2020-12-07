/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;
import bandeau.Bandeau;
import java.util.ArrayList;

/**
 *
 * @author Salomé Chevailler
 */
public class Scenario {
    
    private Bandeau monBandeau;
    private ArrayList<EffetDAnimation> lesEffets = new ArrayList<>();
    
    public Scenario(Bandeau bandeau){
        monBandeau = bandeau;
    }

    public void ajouterEffetDAnimation(EffetDAnimation e){
        lesEffets.add(e);
    }
    
    public void lancerScenario(){
        for (EffetDAnimation e : lesEffets){
            e.jouer();
            monBandeau.sleep(1000);
        }
        monBandeau.close();
    }
    
}
    
