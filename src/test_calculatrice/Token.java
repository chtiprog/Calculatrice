package test_calculatrice;


/**
 * Object Token
 * @author mabelle
 *
 */
public class Token {
	private char kind ; // type saisi : operateurs, nombres...
	private double value ; // valeurs des nombres saisis
	
	public Token(){
		this.kind = ' ';
		this.value = 0;
	}
	
	/**
	 * Constructeur avec un paramètre de type char
	 * @param ch : kind
	 */
	public Token(char ch){
		this.kind = ch;
		this.value = 0;
	}
	
	/**
	 * Constructeur avec 2 paramètres, type char et double
	 * @param ch : kind
	 * @param val : value
	 */
	public Token(char ch, double val){
		this.kind = ch;
		this.value = val;
	}

	public char getKind() {
		return this.kind;
	}

	public double getValue() {
		return this.value;
	}
	
} // FIN CLASSE TOKEN
