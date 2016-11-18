/**
 * 
 */
package tp3;

import javax.swing.text.Position;

/**
 * @author mensur
 *
 */
public interface IJoueur {
	public void tire(IJoueur cible);
	
	public void recoitTire(Position position);
	
}
