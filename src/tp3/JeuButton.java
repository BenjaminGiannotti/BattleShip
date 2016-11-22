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

	public JButton jeuButton(String nom, String text){
		JButton j = new JButton();
		j.setName(nom);
		j.setText(text);
		//j.setVisible(true);
		return j;
	}
	
	public int nbCaseNavire(int number) {
		return number;
	}

}
