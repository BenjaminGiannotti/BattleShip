/**
 * 
 */
package tp3;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
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
	
}
