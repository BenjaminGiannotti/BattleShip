package tp3;

/**
 * Classe qui crée un tableau d'objets, où sont placés tous les boutons avec
 * leur dimentions
 * 
 * @author Mensur Rasic & Benjamin Giannotti
 * @version Automne 2016
 */
public class NomEtConstante {
	public Object[][] nomButtons = { { "btnPlacerPA", "Placer P-A", 80, 25, 150, 25 },
			{ "btnPlacerCroiseur", "Placer Croiseur", 80, 50, 150, 25 },
			{ "btnPlacerContreT", "Placer Contre T", 80, 75, 150, 25 },
			{ "btnPlacerSousMarin", "Placer Sous Marin", 80, 100, 150, 25 },
			{ "btnPlacerTorpilleur", "Placer Torpilleur", 80, 125, 150, 25 },
			{ "btnAnnuler", "Annuler", 80, 150, 150, 25 }, { "btnAide", "Aide", 80, 175, 150, 25 },
			{ "btnRecommencer", "Recommencer", 80, 200, 150, 25 }, };

	/**
	 * 
	 * @return nomButtons
	 */
	public Object[][] getNomButtons() {
		return nomButtons;
	}
}
