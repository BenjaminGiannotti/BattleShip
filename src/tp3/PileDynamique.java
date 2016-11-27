package tp3;

/**
 * Cr�ation d'une classe qui contient une pile dynamique prit d'un exemple de
 * Mathieu Nayrolles, INF111
 *
 * @author Mensur Rasic & Benjamin Giannotti
 * @version Automne 2016
 */
public class PileDynamique {

	// ATTRIBUTS
	private Maillon tete;

	/**
	 * Constructeur de la pile dynamique qui met la t�te du maillon � une position donn�e
	 *
	 * @param maillon
	 */
	public PileDynamique(Position unePosition) {
		this.tete = new Maillon(unePosition);
	}

	/**
	 * M�thode si la liste est vide
	 *
	 * @return null
	 */
	public boolean estVide() {
		return this.tete == null;
	}

	/**
	 *
	 * @param position
	 *            en coordonn�es
	 */
	public void empile(Position position) {
		Maillon maillon = new Maillon(position);
		maillon.setNext(tete);
		tete = maillon;
	}

	/**
	 *
	 * @return la position du maillon de retour
	 */
	public Position depile() {
		Maillon maillonDeRetour = this.tete;
		this.tete = this.tete.getNext();
		return maillonDeRetour.getUnePosition();
	}
}