package tp3;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.JButton;

/**
 * Classe qui contient un constructeur pour la cr�ation des boutons dans le jeu.
 * Ils doivent contenir un nom, un text �crit dessus et un nombre de case d�di�e
 * pour chaque navire.
 * 
 * @author Mensur Rasic & Benjamin Giannotti
 * @version Automne 2016
 */
public class JeuButton extends JButton {

	private int nbCase;

	public JeuButton(String nom, String text, int nbCase) {
		this.setName(nom);
		this.setText(text);
		this.nbCase = nbCase;
	}

}
