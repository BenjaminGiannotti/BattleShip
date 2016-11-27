package tp3;

/**
 * Interface avec les méthodes tire, qui recoit en paramètre le joueur ciblé ,et
 * recoitTire qui recoit en paramètre la position du tir qui a été lancé
 * 
 * @author Mensur Rasic & Benjamin Giannotti
 * @version Automne 2016
 */
public interface IJoueur {

	/**
	 * 
	 * @param cible
	 */
	public void tire(IJoueur cible);

	/**
	 * 
	 * @param position
	 */
	public void recoitTire(Position position);

}
