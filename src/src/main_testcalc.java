
import java.util.Scanner;

/**
 * TP CALCULATRICE Site du zéro
 * @author mabelle
 *
 */
public class main_testcalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("Saisissez une opération, en terminant par '='. Tapez 'exit' pour sortir.");
			String saisie = sc.nextLine();
			if ( saisie.equals("exit") ) {
				System.out.println("Merci d'avoir utilisé cette calculatrice !");
				break;
			}
			try{
				Calcul calculatrice = new Calcul(saisie); // Object permettant d'effectuer des calculs
				System.out.println("Le résultat est : " + calculatrice.resultat());
			}
			catch(java.lang.IndexOutOfBoundsException err){
				System.out.println("Vous avez oublié le signe = ");
			} // fin du catch
		} // fin du while infini	

	} // FIN DU MAIN

} //FIN DE LA CLASSE
