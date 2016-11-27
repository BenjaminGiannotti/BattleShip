package tp3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 * 
 * Classe Main qui génère tout au niveau du framework. Elle contient les
 * boutons, les tableaux, le mouseEvent et l'actionListener.
 * 
 * @author Mensur Rasic & Benjamin Giannotti
 * @version Automne 2016
 */

public class JeuBattleShip extends JFrame {
	private static final String BUTTON_NAVIRE = "BUTTON_NAVIRE";
	private static final String TABLEAU_JOUEUR = "TABLEAU_JOUEUR";

	/**
	 * Crée un nouveau frame
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		JeuBattleShip jeuBattleShip = new JeuBattleShip();
		jeuBattleShip.setSize(1200, 700);
		jeuBattleShip.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jeuBattleShip.setVisible(true);
	}

	/**
	 * Constructeur du jeu battleship qui crée tout ce qui est à l'intérieur du
	 * frame, les grilles de chacun des joueurs, les emplacements, les
	 * dimentions, le textArea.
	 */
	public JeuBattleShip() {
		super("Battleship");

		JPanel mainPanel = new JPanel(new BorderLayout());
		JPanel buttonsPanel = buildButtonsPanel();
		JPanel grillePanelAdverssaire = buildGrillePanel("Grille de l'adversaire");
		JPanel grillePanelJoueur = buildGrillePanel("Ma grille");
		JPanel tireAdversaire = buildTirePanel();
		JPanel tireJoueur = buildTirePanel();
		JTextArea information = new JTextArea("Information sur le jeu\n");
		information.setEditable(false);
		information.setBorder(new EmptyBorder(10, 10, 0, 10));

		// La séparation des deux grilles
		JSplitPane gameSplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT, grillePanelAdverssaire, grillePanelJoueur);
		gameSplit.setResizeWeight(0.5);
		JSplitPane tireSplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT, tireAdversaire, tireJoueur);
		tireSplit.setResizeWeight(0.5);

		// Les emplacement des panels
		mainPanel.add(buttonsPanel, BorderLayout.WEST);
		mainPanel.add(gameSplit, BorderLayout.CENTER);
		mainPanel.add(tireSplit, BorderLayout.EAST);
		mainPanel.add(information, BorderLayout.SOUTH);

		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(mainPanel, BorderLayout.CENTER);
		pack();
	}

	/**
	 * 
	 * @return Le panel des boutons à gauche
	 */
	public JPanel buildButtonsPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		panel.add(buildButtonNavireAction("btnPA", "Placer P-A", 5));
		panel.add(buildButtonNavireAction("btnCroiseur", "Placer Croiseur", 4));
		panel.add(buildButtonNavireAction("btnContreT", "Placer Contre T", 3));
		panel.add(buildButtonNavireAction("btnSousMarin", "Placer Sous Marin", 3));
		panel.add(buildButtonNavireAction("btnTorpilleur", "Placer Torpilleur", 2));

		return panel;
	}

	/**
	 * 
	 * @return Le panel des 5 derniers tirs et son en-tête
	 */
	public JPanel buildTirePanel() {
		JPanel panel = new JPanel();
		JLabel header = new JLabel("5 derniers tirs : ");

		panel.add(header);

		return panel;
	}

	/**
	 * Méthode pour la création des deux grilles, mouseAdapter et mouseEvent
	 * 
	 * @param headerPanel
	 *            en-tête de la grille
	 * @return false si la grille est modifiable
	 */
	public JPanel buildGrillePanel(String headerPanel) {
		JPanel panel = new JPanel();
		JLabel headerLabel = new JLabel(headerPanel, SwingConstants.CENTER);
		panel.add(headerLabel);

		Object[] columnNames = { ' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };

		Object[][] data = { { "1", "", "", "", "", "", "", "", "", "", "" },
				{ "2", "", "", "", "", "", "", "", "", "", "" }, { "3", "", "", "", "", "", "", "", "", "", "" },
				{ "4", "", "", "", "", "", "", "", "", "", "" }, { "5", "", "", "", "", "", "", "", "", "", "" },
				{ "6", "", "", "", "", "", "", "", "", "", "" }, { "7", "", "", "", "", "", "", "", "", "", "" },
				{ "8", "", "", "", "", "", "", "", "", "", "" }, { "9", "", "", "", "", "", "", "", "", "", "" },
				{ "10", "", "", "", "", "", "", "", "", "", "" }, };

		final JTable jTable = new JTable(data, columnNames) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		JScrollPane tableContainer = new JScrollPane(jTable);
		panel.add(tableContainer);
		/*
		 * Pour initialiser un mouseAdapter dans les grilles et pour initialiser
		 * les deux extrémitées des navires.
		 */
		jTable.addMouseListener(new MouseAdapter() {
			int clickCounter = 0;
			Position premierePosition;
			Position secondPosition;
			Navire unNavire;

			/*
			 * Initialisation du mouseEvent. Ca prend
			 */
			public void mouseClicked(MouseEvent e) {
				JTable target = (JTable) e.getSource();
				int row = target.getSelectedRow();
				int column = target.getSelectedColumn();
				char columnHeader = ((String) jTable.getColumnModel().getColumn(column).getHeaderValue()).charAt(0);
				Position unePosition;
				unNavire = new Navire("test", 5);

				if (clickCounter == 0) {
					// La premiere position du bateau
					premierePosition = new Position(columnHeader, row + 1, false);

					// Afficher la premiere position du bateau
					System.out.println("Premiere position : " + premierePosition.toString());

					// Mettre un + dans la case
					jTable.setValueAt("+", row, column);

					unNavire.ajouterNavire(premierePosition);

					// Augmenter le compteur du click
					clickCounter++;
				} else if (clickCounter == 1) {
					// La seconde position du bateau
					secondPosition = new Position(columnHeader, row + 1, false);

					jTable.setValueAt("+", row, column);
					// Afficher la seconde position du bateau
					System.out.println("Second position : " + secondPosition.toString());

					if (premierePosition.getLettre() == secondPosition.getLettre()) {

						for (int i = 0; i < 3; i++) {
							if (premierePosition.getChiffre() < secondPosition.getChiffre()) {
								unePosition = new Position(premierePosition.getLettre(),
										premierePosition.getChiffre() + i, false);
								jTable.setValueAt("+", unePosition.getChiffre(), column);
							} else {
								unePosition = new Position(premierePosition.getLettre(),
										secondPosition.getChiffre() + i, false);
								jTable.setValueAt("+", unePosition.getChiffre(), column);
							}
							unNavire.ajouterNavire(unePosition);
						}

					} else if (premierePosition.getChiffre() == secondPosition.getChiffre()) {

						for (int i = 0; i < 3; i++) {
							if (premierePosition.getLettre() < secondPosition.getLettre()) {

								columnHeader = ((String) jTable.getColumnModel().getColumn(column - i).getHeaderValue())
										.charAt(0);
								unePosition = new Position(columnHeader, premierePosition.getChiffre(), false);
								jTable.setValueAt("+", row, column - i);
							} else {
								columnHeader = ((String) jTable.getColumnModel().getColumn(column + i).getHeaderValue())
										.charAt(0);
								unePosition = new Position(columnHeader, premierePosition.getChiffre(), false);
								jTable.setValueAt("+", row, column + i);
							}
							unNavire.ajouterNavire(unePosition);
						}

					} else {
						System.out.println("Votre bateau n'est pas aligner verticalement ou horizontallement");
					}
					for (int i = 0; i < unNavire.listePosition.getSize(); i++) {
						try {
							System.out.println(
									"----------------------------\n" + unNavire.listePosition.get(i).toString());
						} catch (Exception e1) {
							e1.printStackTrace();
						}

					}
					clickCounter--;
				}
			}
		});
		return panel;
	}

	/**
	 * Méthode pour la création des boutons, le nombre de cases que doit avoir
	 * les navires associés aux boutons et son action
	 * 
	 * @param nom
	 *            du bouton
	 * @param text
	 *            écrit sur le bouton
	 * @param nbCase
	 *            nombre de cases que le bateau doit avoir
	 * @return button
	 */
	private JButton buildButtonNavireAction(String nom, String text, int nbCase) {
		JeuButton button = new JeuButton(nom, text, nbCase);
		button.putClientProperty(BUTTON_NAVIRE, nbCase);
		button.addActionListener(navireListener);
		return button;
	}

	/**
	 * Action de chaque boutons lorsqu'ils sont cliqués
	 */
	private final ActionListener navireListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JComponent source = (JComponent) e.getSource();
			Integer code = (Integer) source.getClientProperty(BUTTON_NAVIRE);

			// source.setEnabled(false);

			operatorButtonPressed(code);
		}
	};

	/**
	 * Affichage du nombre de case que le navire doit avoir lorsque son bouton
	 * est cliqué
	 * 
	 * @param nbCase
	 *            du navire
	 */
	public void operatorButtonPressed(int nbCase) {
		System.out.println("Nombre de case de ce navire : " + nbCase);
	}
}
