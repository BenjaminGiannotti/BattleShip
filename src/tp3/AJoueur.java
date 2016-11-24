/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.util.Random;

/**
 *
 * @author Benjamin
 */
public abstract class AJoueur implements IJoueur{    
	//public void tire(IJoueur cible);
	
	private Position NORD;
	private Position SUD;
	private Position EST;
	private Position OUEST;
	
	
	
	//public void recoitTire(Position position);
	
	//(placeNavire(Navire navire))
	
	//algorithme normal
	

	//random numbers
	public Position chasseEtTireHasard(){
		Random randomValeur = new Random();
		int chiffre = randomValeur.nextInt(10) + 1;
		char lettre = (char)(randomValeur.nextInt(10) + 'A');
		Position positionRandom = new Position(lettre, chiffre);
		
		return positionRandom;
	}

	public Position getNORD(Position unePosition) {
		unePosition.setChiffre(unePosition.getChiffre() + 1);
		return unePosition;
	}

	public Position getSUD(Position unePosition) {
		unePosition.setChiffre(unePosition.getChiffre() - 1);
		return unePosition;
	}

	public Position getEST(Position unePosition) {
		unePosition.setLettre( (char) ((int) unePosition.getLettre() + 1));
		return unePosition;
	}

	public Position getOUEST(Position unePosition) {
		unePosition.setLettre( (char) ((int) unePosition.getLettre() - 1));
		return unePosition;
	}
	
}
