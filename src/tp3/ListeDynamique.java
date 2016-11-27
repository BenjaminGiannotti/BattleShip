package tp3;

/**
 * Création d'une classe qui contient une liste dynamique prit d'un exemple de
 * Mathieu Nayrolles, INF111
 * 
 * @author Mensur Rasic & Benjamin Giannotti
 * @version Automne 2016
 */
public class ListeDynamique {

	private Maillon head;
	private int size = 0;

	/**
	 * Enlève un maillon de la liste. Dans le cas particulier de l'indice 0, on
	 * n'a pas besoin d'enlever.
	 * 
	 * @param indice
	 * @throws Exception
	 */
	public void remove(int indice) throws Exception {
		if (indice >= size || indice < 0) {
			throw new Exception("Indice n'existe pas");
		}

		Maillon tmp = this.head;
		int count = 0;
		this.size--;

		while (indice - 1 > 0 && count != indice - 1 && tmp.getNext() != null) {
			tmp = tmp.getNext();
			count++;
		}

		if (count == indice - 1) {

			tmp.setNext(tmp.getNext().getNext());
		} else if (indice == 0) {

			this.head = this.head.getNext();
		}

	}

	/**
	 * Récupère la valeur de l'indice
	 * 
	 * @param indice
	 *            la valeur qu'on recherche
	 * @return la variable temporaire
	 * @throws Exception
	 */
	public Maillon get(int indice) throws Exception {

		// On va jusqu'à l'indice
		if (indice >= size || indice < 0) {
			throw new Exception("Indice n'existe pas");
		}

		Maillon tmp = this.head;
		int count = 0;
		while (count != indice && tmp.getNext() != null) {
			tmp = tmp.getNext();
			count++;
		}

		return tmp;
	}

	/**
	 * Ajoute une position
	 * 
	 * @param position
	 */
	public void add(Position position) {

		// On va jusqu'à la fin de la liste et on ajoute la position
		if (this.estVide()) {
			this.head = new Maillon(position);
			this.size++;

		} else {

			Maillon tmp = this.head;
			while (tmp.getNext() != null) {
				tmp = tmp.getNext();
			}
			tmp.setNext(new Maillon(position));
			this.size++;

		}
	}

	/**
	 * Méthode si la liste est vide
	 * 
	 * @return 0
	 */
	public boolean estVide() {
		return this.size == 0;
	}

	/**
	 * Affiche ce qu'il y a dans la liste
	 * 
	 * @return string le texte qui est dans la liste
	 */
	public String toString() {

		String string = "";
		Maillon tmp = this.head;

		while (tmp.getNext() != null) {
			string += tmp.toString();
			tmp = tmp.getNext();
		}

		string += tmp.toString();

		return string;

	}

	/**
	 * 
	 * @return size
	 */
	public int getSize() {
		return size;
	}

}