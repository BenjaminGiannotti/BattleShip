/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

/**
 *
 * @author Benjamin
 */
public class Navire {

	String nomDuNavire;
	int nbCaseNavire;
	ListeDynamique listePosition;

	public Navire(String nomDuNavire, int nbCaseNavire){
		this.nomDuNavire = nomDuNavire;
		this.nbCaseNavire = nbCaseNavire;
		listePosition = new ListeDynamique();
	}
	
	public void ajouterNavire(Position position) {
		listePosition.add(position);
	}

	public boolean estCoulé() {
		try {
			if(!listePosition.estVide()){
				// Si toute les case du navire sont toucher, return true
				for (int i = 0; i < listePosition.getSize(); i++) {
					if (listePosition.get(i).getUnePosition().isToucher() == false) {
						return false;
					}
				}
			}else{
				System.out.println("La liste est vide");
				return false;
			}
		} catch (Exception e) {
			System.out.println("Il y a eu une erreur dans la methode estCoule(),"
					+ " il se peut que votre pile est vide");
			e.printStackTrace();
		}
		return true;
	}
}
