/**
 * 
 */
package tp3;

/**
 * @author mensur
 *
 */
public class Maillon {

    //ATTRIBUTS
	private String lettre;
    private int chiffre;
    private boolean toucher;
    private Maillon next;

    /**
     * Constructeur
     *
     * @param valeur
     */
    public Maillon(String lettre, int chiffre, boolean toucher) {
    	this.lettre = lettre;
    	this.chiffre = chiffre;
    	this.toucher = toucher;
    }

   
    public boolean isToucher() {
		return toucher;
	}


	public void setViser(boolean toucher) {
		this.toucher = toucher;
	}


	public String getLettre() {
		return lettre;
	}


	public void setLettre(String lettre) {
		this.lettre = lettre;
	}


	public int getChiffre() {
		return chiffre;
	}


	public void setChiffre(int chiffre) {
		this.chiffre = chiffre;
	}


	/**
     *
     * @return
     */
    public Maillon getNext() {
        return next;
    }

    /**
     *
     * @param next
     */
    public void setNext(Maillon next) {
        this.next = next;
    }

}