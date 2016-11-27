package tp3;

/**
 * Classe pour la création d'un maillon avec ses get et set
 * 
 * @author Mensur Rasic & Benjamin Giannotti
 * @version Automne 2016
 */
public class Maillon {

	// ATTRIBUTS
	private Position unePosition;
	private Maillon next;

	/**
	 * Constructeur Maillon
	 * 
	 * @param p
	 *            position
	 */
	public Maillon(Position p) {
		this.unePosition = p;
	}

	/**
	 * 
	 * @return unePosition
	 */
	public Position getUnePosition() {
		return unePosition;
	}

	/**
	 * 
	 * @param unePosition
	 */
	public void setUnePosition(Position unePosition) {
		this.unePosition = unePosition;
	}

	/**
	 *
	 * @return next
	 */
	public Maillon getNext() {
		return next;
	}

	/**
	 *
	 * @param next
	 *            maillon
	 */
	public void setNext(Maillon next) {
		this.next = next;
	}

	public String toString() {
		return unePosition.toString();
	}

}