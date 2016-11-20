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
	ListeDynamique listePosition = new ListeDynamique();
	
   public void ajouterNavire(String nomDuNavire, int nbCaseNavire, String lettre, int chiffre ){
	   this.nomDuNavire = nomDuNavire;
	   this.nbCaseNavire = nbCaseNavire;
	   listePosition.add(lettre, chiffre, false);
   }
	
    public boolean estCoulé(){
    	//Si toute les case du navire sont toucher, return true
    	return true;
    }
}
