package test_calculatrice;
import test_calculatrice.Lecture;
import test_calculatrice.Token;

import java.util.ArrayList;

/**
 * 
 * @author mabelle
 * Création d'un object Calcul qui permettra d'effectuer les calculs des opérations saisies en paramètres
 * TODO :
 * Erreur/exception division par zéro
 */
public class Calcul {
	private Lecture text;
	private ArrayList<Token> tok = new ArrayList<Token>();
	private ArrayList<Token> listAtt = new ArrayList<Token>();
	private double result = 0;

	/**
	 * Constructeur avec un paramètre String
	 * @param saisie : input
	 */
	public Calcul(String saisie){
		text = new Lecture(saisie);
		tok = text.get();
	}

	/**
	 * Méthode qui effectue des calculs
	 * @return result : le résultat de l'opération saisie en paramètre du constructeur
	 */
	public double resultat(){

			// Création d'une liste d'attente listAtt seulement avec des '+' et des '-' :
			for (int i = 0 ; i < tok.size() ; ++i){


				if(tok.get(i).getKind() == '*'){
					listAtt.add(new Token('8', ( tok.get(i-1).getValue() * tok.get(i+1).getValue() ) ) );
				}
				else if(tok.get(i).getKind() == '/'){
					listAtt.add(new Token('8', ( tok.get(i-1).getValue() / tok.get(i+1).getValue() ) ) );
				}
				else if(tok.get(i).getKind() == '+' || tok.get(i).getKind() == '-' ){

					if ( tok.get(i+2).getKind() == '='){
						listAtt.add(new Token('8', tok.get(i-1).getValue()) ); listAtt.add(new Token(tok.get(i).getKind()));
						listAtt.add(new Token('8', tok.get(i+1).getValue()));
					}
					else if ( (i >= 3
							&& tok.get(i-2).getKind() != '*' && tok.get(i-2).getKind() != '/') || i < 3){
						listAtt.add(new Token('8', tok.get(i-1).getValue()) ); listAtt.add(new Token(tok.get(i).getKind()));
					}

					else listAtt.add(new Token(tok.get(i).getKind()));

				} 
			}// fin du for

			// Effectue les calculs de base (+, -) à partir de la nouvelle liste d'attente listAtt
			for(int j = 0 ; j < listAtt.size(); ++j){
				switch (listAtt.get(j).getKind()){
				case'+':
					if (j < 3)
						this.result += listAtt.get(j-1).getValue() + listAtt.get(j+1).getValue();
					else
						this.result += listAtt.get(j+1).getValue();
					break;
				case'-':
					if (j < 3)
						this.result += listAtt.get(j-1).getValue() - listAtt.get(j+1).getValue();
					else
						this.result -= listAtt.get(j+1).getValue();
					break;
				} // fin du switch
				if (listAtt.size() == 1) this.result = listAtt.get(j).getValue(); // Si la liste ne contient qu'un élément, ex opération saisie : 2*5=
			} // fin du for

	return this.result;
} // fin méthode resultat.


} // FIN DE LA CLASSE CALCUL

