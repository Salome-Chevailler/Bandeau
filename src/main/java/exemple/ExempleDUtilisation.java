package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation {
    
    public static void main(String[] args) {
	Bandeau monBandeau = new Bandeau();
        Scenario scenario = new Scenario(monBandeau);
        scenario.ajouterEffetDAnimation(new DoigtDevant(monBandeau,1,"Je mets le doigt devant"));
        scenario.ajouterEffetDAnimation(new DoigtDerriere(monBandeau,1,"Je mets le doigt derrière"));
        scenario.ajouterEffetDAnimation(new DoigtDevant(monBandeau,1,"Je mets le doigt devant"));
        scenario.ajouterEffetDAnimation(new TousPetitsRonds(monBandeau,1,"Je fais de tous petits ronds"));
        scenario.ajouterEffetDAnimation(new BoogieBoogie(monBandeau,5,"Je fais le Boogie Boogie"));
        scenario.ajouterEffetDAnimation(new TourDeMoiMeme(monBandeau,1,"Je fais le tour de moi-même"));
        scenario.ajouterEffetDAnimation(new EnAvant(monBandeau,1,"Et je vais en avant"));
        
        scenario.lancerScenario();

    }
    
 /* public void exemple() {
	Bandeau monBandeau = new Bandeau();
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        monBandeau.setMessage("Hello");
	monBandeau.sleep(1000);
	monBandeau.setMessage("On va changer de police");
	monBandeau.sleep(1000);
	monBandeau.setMessage("Monospaced 15 Bold");
	monBandeau.setFont(new Font("Monospaced", Font.BOLD, 15));
	monBandeau.sleep(1000);
	monBandeau.setMessage("SansSerif 15");
	monBandeau.setFont(new Font("SansSerif", Font.PLAIN, 15));
	monBandeau.sleep(1000);
	monBandeau.setMessage("On va zoomer");
	monBandeau.sleep(1000);
	monBandeau.setMessage("Zoom........");
	for (int i = 5; i < 60 ; i+=5) {
		monBandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
		monBandeau.sleep(100);
	}
	monBandeau.sleep(1000);

	monBandeau.setFont(new Font("Courier new", Font.PLAIN, 15));
	monBandeau.setMessage("On va tourner");
	monBandeau.sleep(1000);
	monBandeau.setMessage("On tourne...");
	for (int i = 0; i <= 100; i++) {
		monBandeau.setRotation(2*Math.PI*i / 100);
		monBandeau.sleep(100);
	}

	monBandeau.setMessage("On va changer de couleur de fond");
	monBandeau.sleep(1000);
	monBandeau.setBackground(Color.DARK_GRAY);
	monBandeau.setMessage("On va changer de couleur");
	monBandeau.sleep(1000);
	monBandeau.setForeground(Color.YELLOW);
	monBandeau.sleep(1000);
	monBandeau.setFont(font);
	monBandeau.setForeground(fore);
	monBandeau.setBackground(back);
	monBandeau.setMessage("Terminé");
	monBandeau.sleep(3000);
	monBandeau.close();
   }*/
}
