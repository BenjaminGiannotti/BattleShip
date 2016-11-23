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
	private Position unePosition;
    private Maillon next;

    /**
     * Constructeur
     *
     * @param valeur
     */
    public Maillon(Position p) {
    	this.unePosition = p;
    }
    
	public Position getUnePosition() {
		return unePosition;
	}

	public void setUnePosition(Position unePosition) {
		this.unePosition = unePosition;
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
    
    public String toString(){
    	return unePosition.toString();
    }

}