import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FenetreCalc extends JFrame {

	private Interaction inter = new Interaction(this); // Passe au contructeur Interface une référence à elle-même
	// CREATION DES BOUTONS
			JButton bouton1 = new JButton("1");
			JButton bouton2 = new JButton("2");
			JButton bouton3 = new JButton("3");
			JButton bouton4 = new JButton("4");
			JButton bouton5 = new JButton("5");
			JButton bouton6 = new JButton("6");
			JButton bouton7 = new JButton("7");
			JButton bouton8 = new JButton("8");
			JButton bouton9 = new JButton("9");
			JButton bouton0 = new JButton("0");
			JButton boutonPt = new JButton(".");
			JButton boutonEgal = new JButton("=");
			JButton boutonReset = new JButton("C");
			JButton boutonAd = new JButton("+");
			JButton boutonSo = new JButton("-");
			JButton boutonMu = new JButton("*");
			JButton boutonDi = new JButton("/");
			// CREATION DU LABEL POUR L'AFFICHAGE DU RESULTAT
			JLabel text = new JLabel("Bienvenu");
	
	public FenetreCalc(){
		
		this.setTitle("Calculatrice");
//		this.setSize(200, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		boutonReset.setBackground(Color.red); // Colorer le bouton reset en rouge
		
		// TRAVAIL SUR LE LABEL
		Font police = new Font("Arial", Font.PLAIN, 20);
		text.setFont(police);
		text.setHorizontalAlignment(JLabel.RIGHT); // aligner l'affichage à droite
		text.setVerticalAlignment(JLabel.CENTER); // aligner horizontalement l'affichage au centre
		text.setPreferredSize(new Dimension(260,40)); // Changer la taille du Label
		
		// POSITION DES BOUTONS ET DU LABEL
				// Panneau pour le label
		JPanel panText = new JPanel();
		panText.setBackground(Color.WHITE);
		panText.setBorder(BorderFactory.createLineBorder(Color.darkGray)); // Ajoute une bordure au cadre du text
		panText.setPreferredSize(new Dimension(270,60)); // Taille du panneau du Label, un peu plus grand
		panText.add(text);
		
				// Panneau pour les boutons numéros
		JPanel panB1 = new JPanel();
		panB1.setPreferredSize(new Dimension(190,210));
		panB1.setLayout(new GridLayout(4,3,3,3));
		panB1.add(bouton1);
		panB1.add(bouton2);
		panB1.add(bouton3);
		panB1.add(bouton4);
		panB1.add(bouton5);
		panB1.add(bouton6);
		panB1.add(bouton7);
		panB1.add(bouton8);
		panB1.add(bouton9);
		panB1.add(bouton0);
		panB1.add(boutonPt);
		panB1.add(boutonEgal);
		
				// Panneau pour les boutons opérateurs
		JPanel panBOp = new JPanel();
		panBOp.setPreferredSize(new Dimension(60,210));
		panBOp.setLayout(new GridLayout(5,1,3,3));
		panBOp.add(boutonReset);
		panBOp.add(boutonAd);
		panBOp.add(boutonSo);
		panBOp.add(boutonMu);
		panBOp.add(boutonDi);
		
		
		// AJOUTS DES PANNEAUX AU PANNEAU PRINCIPAL
		JPanel panPrincipal = new JPanel();
		panPrincipal.setLayout(new BorderLayout());
		panPrincipal.add(panText, BorderLayout.NORTH);
		panPrincipal.add(panB1, BorderLayout.CENTER);
		panPrincipal.add(panBOp, BorderLayout.EAST);

		
		
		this.setContentPane(panPrincipal);
		
		this.pack();
		this.setVisible(true);
		
		// AJOUT DES ECOUTEURS DE TYPE INTERACTION
		bouton1.addActionListener(inter);
		bouton2.addActionListener(inter);
		bouton3.addActionListener(inter);
		bouton4.addActionListener(inter);
		bouton5.addActionListener(inter);
		bouton6.addActionListener(inter);
		bouton7.addActionListener(inter);
		bouton8.addActionListener(inter);
		bouton9.addActionListener(inter);
		bouton0.addActionListener(inter);
		boutonPt.addActionListener(inter);
		boutonEgal.addActionListener(inter);
		boutonReset.addActionListener(inter);
		boutonAd.addActionListener(inter);
		boutonSo.addActionListener(inter);
		boutonMu.addActionListener(inter);
		boutonDi.addActionListener(inter);
		
	} // fin constructeur défaut
	
	
} // FIN CLASSE FENETRECALC
