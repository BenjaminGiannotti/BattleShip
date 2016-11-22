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
	
	private int nbCase;
	
	public JeuButton (String nom, String text, int nbCase){
		this.setName(nom);
		this.setText(text);
		this.nbCase = nbCase;
	}
	
	public int nbCaseNavire(int number) {
		return number;
	}

}
