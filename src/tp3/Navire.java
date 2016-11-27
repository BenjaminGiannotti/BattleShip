package tp3;

/**
 * Classe Navire qui contient un constructeur qui permet de créer une liste
 * dynamique avec le nom du navire et le nombre de case qu'il contient. Et si le
 * navire est coulé ou non.
 *
 * @author Mensur Rasic & Benjamin Giannotti
 * @version Automne 2016
 */
public class Navire {

	String nomDuNavire;
	int nbCaseNavire;
	ListeDynamique listePosition;

	/**
	 * Constructeur Navire, son nom et le nombre de case qu'il a.
	 * 
	 * @param nomDuNavire
	 * @param nbCaseNavire
	 */
	public Navire(String nomDuNavire, int nbCaseNavire) {
		this.nomDuNavire = nomDuNavire;
		this.nbCaseNavire = nbCaseNavire;
		listePosition = new ListeDynamique();
	}

	/**
	 * Ajoute la position du navire dans la liste
	 * 
	 * @param position
	 *            du navire
	 */
	public void ajouterNavire(Position position) {
		listePosition.add(position);
	}

	/**
	 * Méthode boolean si le bateau est coulé ou non. Si la pile n'est pas vide,
	 * alors regarde si tous les positions du navire sont touchés, si oui alors
	 * la pile est vide.
	 * 
	 * @return true or false dépendament si le navire est coulé ou non
	 */
	public boolean estCoulé() {
		try {
			if (!listePosition.estVide()) {
				// Si toute les case du navire sont toucher, return true
				for (int i = 0; i < listePosition.getSize(); i++) {
					if (listePosition.get(i).getUnePosition().isToucher() == false) {
						return false;
					}
				}
			} else {
				System.out.println("La liste est vide");
				return false;
			}
		} catch (Exception e) {
			System.out.println(
					"Il y a eu une erreur dans la methode estCoule()," + " il se peut que votre pile est vide");
			e.printStackTrace();
		}
		return true;
	}
}
