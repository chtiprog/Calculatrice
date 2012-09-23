import java.util.ArrayList;

/**
 * @author mabelle
 * Object Lecture qui permet de prendre des inputs et de les transformer en liste de Token
 */
public class Lecture {
	private String entree; // La saisie clavier
	private char[] car;
	private String temp;   // variable temporaire pour les double
	private double nbre;
	private ArrayList<Token> listTok = new ArrayList<Token>();

	/**
	 * Constructeur avec un parametre
	 * @param saisie
	 * Initialise entree, car et temp.
	 */
	public Lecture(String saisie){
		this.entree = saisie ;
		this.car = this.entree.toCharArray();
		this.temp = "";
	}
	
	/**
	 * Méthode get()
	 * @return listTok, un ArrayList de Token
	 */
	public ArrayList<Token> get(){
		int i = 0;
		while (i != car.length){
			
			switch (car[i]){
			case'+': case'-': case'/': case'*': case'(': case')': case'=':
			{
				nbre = Double.parseDouble(temp);
				temp = "";

				listTok.add(new Token('8', nbre));

				listTok.add(new Token(car[i]));
				break;
				
			} // fin du cas op
				
			case'.': case'0': case'1': case'2': case'3': case'4':
			case'5': case'6': case'7': case'8': case'9':
			{
				temp += car[i];
				break;
				
			} // fin du case numéros
			default:
				System.out.println("Mauvais Token");
			} // fin du switch
			++i;
		} // fin boucle while
		return listTok;
	} // fin méthode get()
	

} //FIN DE LA CLASSE LECTURE
