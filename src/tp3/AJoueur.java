package tp3;

import java.util.Random;

/**
 * Classe abstrète qui implemente l'interface IJoueur. Elle crée les méthodes
 * recoitTire, chateEtTireHasard et get les positions de chaque point cardinal
 * (Nord, Sud, Est, Ouest), pour le fonctionnement de l'argorithme
 * 
 * @author Mensur Rasic & Benjamin Giannotti
 * @version Automne 2016 
 */
public abstract class AJoueur implements IJoueur {

	// Variables privées des points cardinaux
	private Position NORD;
	private Position SUD;
	private Position EST;
	private Position OUEST;

	public void recoitTire(Position position) {

	}

	/**
	 * ¸ Méthode pour générer les coordonnées d'un tir aléatoire dans un
	 * tableau, dans les colonnes de A à J et des rangées de 1 à 10
	 * 
	 * @return Une position random dans le tableau
	 */
	public Position chasseEtTireHasard() {
		Random randomValeur = new Random();
		int chiffre = randomValeur.nextInt(10) + 1;
		char lettre = (char) (randomValeur.nextInt(10) + 'A');
		Position positionRandom = new Position(lettre, chiffre);

		return positionRandom;
	}

	/**
	 * 
	 * @param unePosition
	 * @return La position Nord du tir random
	 */
	public Position getNORD(Position unePosition) {
		unePosition.setChiffre(unePosition.getChiffre() + 1);
		return unePosition;
	}

	/**
	 * 
	 * @param unePosition
	 * @return La position Sud du tir random
	 */
	public Position getSUD(Position unePosition) {
		unePosition.setChiffre(unePosition.getChiffre() - 1);
		return unePosition;
	}

	/**
	 * 
	 * @param unePosition
	 * @return La position Est du tir random
	 */
	public Position getEST(Position unePosition) {
		unePosition.setLettre((char) ((int) unePosition.getLettre() + 1));
		return unePosition;
	}

	/**
	 * 
	 * @param unePosition
	 * @return La position Ouest du tir random
	 */
	public Position getOUEST(Position unePosition) {
		unePosition.setLettre((char) ((int) unePosition.getLettre() - 1));
		return unePosition;
	}

}
