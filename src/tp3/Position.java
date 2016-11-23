/**
 * 
 */
package tp3;

/**
 * @author mensur
 *
 */
public class Position {
	
	private char lettre;
	private int chiffre;
	private boolean toucher;
	
	public Position(char lettre, int chiffre, boolean toucher){
		this.lettre = lettre;
		this.chiffre = chiffre;
		this.toucher = toucher;
	}
	
	public char getLettre() {
		return lettre;
	}
	public void setLettre(char lettre) {
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
