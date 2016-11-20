/**
 * 
 */
package tp3;

import java.awt.Dimension;

import javax.swing.JButton;

/**
 * @author mensur
 *
 */
public class JeuButton extends JButton{
	
	public JButton jeuButton(String nom, String text, int x, int y, int largeur, int hauteur){
		JButton j = new JButton();
		j.setName(nom);
		j.setText(text);
		j.setBounds(x, y, largeur, hauteur);
		//j.setVisible(true);
		return j;
	}

}
