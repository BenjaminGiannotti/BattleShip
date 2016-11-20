/**
 * 
 */
package tp3;

/**
 * @author mensur
 *
 */
public class ListeDynamique {

	private Maillon head;
	private int size = 0;

	/**
	 * Enleve un maillon de la liste
	 * @param indice
	 * @return
	 * @throws Exception 
	 */
	public void remove(int indice) throws Exception {
		
		/**
		 * STRATEGIE: On d�roule � partir de la tete, jusqu'a indice -1
		 * Si on a par ex, 1 5 10 15 20 25 dans la liste est qu'on cherche
		 * l'indice 3 (le 15), alors on avance jusqu'au 10, puis, on met le 
		 * setNext du 10 au 20. Le maillon 10 est donc enlev�.
		 * 
		 * Dans le cas particulier de l'indice 0, on n'a pas besoin de d�rouler.
		 */
		
		if(indice >= size || indice < 0){
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
	 * Recupere la valeur � l'indice 
	 * @param indice
	 * @return
	 */
	public Maillon get(int indice) throws Exception{
		
		/**
		 * Strategie: On d�roule jusqu'� indice.
		 */
		
		if(indice >= size || indice < 0){
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
	 * Ajoute un element
	 * @param value
	 */
	public void add(String lettre, int chiffre, boolean toucher) {
		
		/**
		 * Strat�gie: On d�roule jusqu'� la fin de la liste puis 
		 * on ajoute le nouvel element
		 */
		
		if (this.estVide()) {
			this.head = new Maillon(lettre, chiffre, toucher);
			this.size++;

		} else {

			Maillon tmp = this.head;
			while (tmp.getNext() != null) {
				tmp = tmp.getNext();
			}
			tmp.setNext(new Maillon(lettre, chiffre, toucher));
			this.size++;

		}
	}
	
	/**
	 * estVide
	 * @return
	 */
	public boolean estVide() {
		return this.size == 0;
	}

	/**
	 * Affiche ce qu'il y a dans la liste
	 */
	public String toString() {

		String string = "";
		Maillon tmp = this.head;

		while (tmp.getNext() != null) {
			string += "Lettre : " + tmp.getLettre() + " Chiffre : " + tmp.getChiffre() + " Toucher : " + tmp.isToucher() +  ";";
			tmp = tmp.getNext();
		}

		string +=  "Lettre : " + tmp.getLettre() + " Chiffre : " + tmp.getChiffre() + " Toucher : " + tmp.isToucher() + ";";

		return string;

	}

}