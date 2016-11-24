package tp3;

/**
 * Pile a chainage dynamique (maillon)
 *
 * @author math
 */
public class PileDynamique {

    //ATTRIBUTS
    private Maillon tete;

    /**
     * Constructeur
     *
     * @param maillon
     */
    public PileDynamique(Position unePosition) {
        this.tete = new Maillon(unePosition);
    }

    /**
     *
     * @return
     */
    public boolean estVide() {
        return this.tete == null;
    }

    /**
     *
     * @param value
     */
    public void empile(Position position) {
        Maillon maillon = new Maillon(position);
        maillon.setNext(tete);
        tete = maillon;
    }

    /**
     *
     * @return
     */
    public Position depile() {
        Maillon maillonDeRetour = this.tete;
        this.tete = this.tete.getNext();
        return maillonDeRetour.getUnePosition();
    }
}