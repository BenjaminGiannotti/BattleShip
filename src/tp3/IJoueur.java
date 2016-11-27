package tp3;

/**
 * Interface avec les m�thodes tire, qui recoit en param�tre le joueur cibl� ,et
 * recoitTire qui recoit en param�tre la position du tir qui a �t� lanc�
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
