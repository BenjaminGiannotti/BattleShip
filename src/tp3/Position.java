/**
 * 
 */
package tp3;

/**
 * @author mensur
 *
 */
public class Position {
	
	private String lettre;
	private int chiffre;
	private boolean toucher;
	
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
	
	public boolean isToucher() {
		return toucher;
	}
	public void setToucher(boolean toucher) {
		this.toucher = toucher;
	}
	
	public String toString(){
		return "Lettre : " + this.getLettre() 
		+ " Chiffre : " + this.getChiffre() 
		+ " Toucher : " + this.isToucher() +  " ;";
	}
	
}
