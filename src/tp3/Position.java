package tp3;

/**
 * Classe pour l'attribuation des positions (des coordonnées dans les grilles)
 * 
 * @author Mensur Rasic & Benjamin Giannotti
 * @version Automne 2016
 */
public class Position {

	private char lettre;
	private int chiffre;
	private boolean toucher;

	/**
	 * 
	 * @param lettre
	 *            dans la grille
	 * @param chiffre
	 *            dans la grille
	 * @param toucher
	 */
	public Position(char lettre, int chiffre, boolean toucher) {
		this.lettre = lettre;
		this.chiffre = chiffre;
		this.toucher = toucher;
	}

	/**
	 * 
	 * @param lettre
	 * @param chiffre
	 */
	public Position(char lettre, int chiffre) {
		this.lettre = lettre;
		this.chiffre = chiffre;
	}

	/**
	 * 
	 * @return lettre
	 */
	public char getLettre() {
		return lettre;
	}

	/**
	 * 
	 * @param lettre
	 */
	public void setLettre(char lettre) {
		this.lettre = lettre;
	}

	/**
	 * 
	 * @return chiffre
	 */
	public int getChiffre() {
		return chiffre;
	}

	/**
	 * 
	 * @param chiffre
	 */
	public void setChiffre(int chiffre) {
		this.chiffre = chiffre;
	}

	/**
	 * 
	 * @return toucher
	 */
	public boolean isToucher() {
		return toucher;
	}

	/**
	 * 
	 * @param toucher
	 */
	public void setToucher(boolean toucher) {
		this.toucher = toucher;
	}

	public String toString() {
		return "Lettre : " + this.getLettre() + " Chiffre : " + this.getChiffre() + " Toucher : " + this.isToucher()
				+ " ;";
	}

}
