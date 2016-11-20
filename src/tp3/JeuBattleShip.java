/**
 * 
 */
package tp3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 * @author mensur
 *
 */
public class JeuBattleShip {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(1200, 700);
		jFrame.setTitle("Battle ship");
		jFrame.setLayout(null);
		jFrame.setLocationRelativeTo(null);
		jFrame.setResizable(false);

		// Le jPanel pour le jtable de l'adversaire
		JPanel jPanelTable = new JPanel();
		jPanelTable.setBounds(400, 70, 450, 200);

		String[] columnNames = { "", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
		Object[][] data = { 
				{ "1", "", "", "", "", "", "", "", "", "", ""}, 
				{ "2", "", "", "", "", "", "", "", "", "", ""}, 
				{ "3", "", "", "", "", "", "", "", "", "", ""}, 
				{ "4", "", "", "", "", "", "", "", "", "", ""}, 
				{ "5", "", "", "", "", "", "", "", "", "", ""}, 
				{ "6", "", "", "", "", "", "", "", "", "", ""}, 
				{ "7", "", "", "", "", "", "", "", "", "", ""}, 
				{ "8", "", "", "", "", "", "", "", "", "", ""}, 
				{ "9", "", "", "", "", "", "", "", "", "", ""}, 
				{ "10", "", "", "", "", "", "", "", "", "", ""}, 
			};
		
		JTable jTableAdvesaire = new JTable(data, columnNames);
		JScrollPane tableContainer = new JScrollPane(jTableAdvesaire);
		jPanelTable.add(tableContainer, BorderLayout.CENTER);
		jFrame.getContentPane().add(jPanelTable);

		JLabel labelAdveersaire = new JLabel();
		labelAdveersaire.setText("Grille de l'adversaire");
		labelAdveersaire.setBounds(565, 25, 150, 25);
		// labelAdveersaire.setVisible(true);
		jFrame.add(labelAdveersaire);

		JLabel labelMoi = new JLabel();
		labelMoi.setText("Ma grille");
		labelMoi.setBounds(600, 300, 150, 25);
		// labelAdveersaire.setVisible(true);
		jFrame.add(labelMoi);

		JLabel labelCinqDernierTireAdversaire = new JLabel();
		labelCinqDernierTireAdversaire.setText("5 derniers tirs");
		labelCinqDernierTireAdversaire.setBounds(1000, 25, 150, 25);
		jFrame.add(labelCinqDernierTireAdversaire);

		JLabel labelCinqDernierTireMoi = new JLabel();
		labelCinqDernierTireMoi.setText("5 derniers tirs");
		labelCinqDernierTireMoi.setBounds(1000, 300, 150, 25);
		jFrame.add(labelCinqDernierTireMoi);
		
		
		// button 1
		JeuButton btnPlacerPA = new JeuButton();
		jFrame.add(btnPlacerPA.jeuButton("btnPlacerPA", "Placer P-A", 80, 25, 150, 25));

		// button 2
		JeuButton btnPlacerCroiseur = new JeuButton();
		jFrame.add(btnPlacerCroiseur.jeuButton("btnPlacerCroiseur", "Placer Croiseur", 80, 50, 150, 25));

		// button 3
		JeuButton btnPlacerContreT = new JeuButton();
		jFrame.add(btnPlacerContreT.jeuButton("btnPlacerContreT", "Placer Contre T", 80, 75, 150, 25));

		// button 4
		JeuButton btnPlacerSousMarin = new JeuButton();
		jFrame.add(btnPlacerSousMarin.jeuButton("btnPlacerSousMarin", "Placer Sous Marin", 80, 100, 150, 25));

		// button 5
		JeuButton btnPlacerTorpilleur = new JeuButton();
		jFrame.add(btnPlacerTorpilleur.jeuButton("btnPlacerTorpilleur", "Placer Torpilleur", 80, 125, 150, 25));

		// button 6
		JeuButton btnAnnuler = new JeuButton();
		jFrame.add(btnAnnuler.jeuButton("btnAnnuler", "Annuler", 80, 150, 150, 25));

		// button 7
		JeuButton btnAide = new JeuButton();
		jFrame.add(btnAide.jeuButton("btnAide", "Aide", 80, 175, 150, 25));

		// button 8
		JeuButton btnRecommencer = new JeuButton();
		jFrame.add(btnRecommencer.jeuButton("btnRecommencer", "Recommencer", 80, 200, 150, 25));

		jFrame.setVisible(true);
		
	}

}
