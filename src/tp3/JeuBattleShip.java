/**
 * 
 */
package tp3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
 * @author mensur
 *
 */
public class JeuBattleShip extends JFrame {

	private static final String BUTTON_NAVIRE = "BUTTON_NAVIRE";
	private static final String TABLEAU_JOUEUR = "TABLEAU_JOUEUR";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JeuBattleShip jeuBattleShip = new JeuBattleShip();
		jeuBattleShip.setSize(1200, 700);
		jeuBattleShip.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jeuBattleShip.setVisible(true);
		/*
		 * JFrame jFrame = new JFrame();
		 * 
		 * jFrame.setSize(1200, 700); jFrame.setTitle("Battle ship");
		 * jFrame.setLayout(null); jFrame.setLocationRelativeTo(null);
		 * jFrame.setResizable(false);
		 * 
		 * // Le jPanel pour le jtable de l'adversaire JPanel jPanelTable = new
		 * JPanel(); jPanelTable.setBounds(400, 70, 450, 200);
		 * 
		 * String[] columnNames = { "", "A", "B", "C", "D", "E", "F", "G", "H",
		 * "I", "J" }; Object[][] data = { { "1", "", "", "", "", "", "", "",
		 * "", "", "" }, { "2", "", "", "", "", "", "", "", "", "", "" }, { "3",
		 * "", "", "", "", "", "", "", "", "", "" }, { "4", "", "", "", "", "",
		 * "", "", "", "", "" }, { "5", "", "", "", "", "", "", "", "", "", ""
		 * }, { "6", "", "", "", "", "", "", "", "", "", "" }, { "7", "", "",
		 * "", "", "", "", "", "", "", "" }, { "8", "", "", "", "", "", "", "",
		 * "", "", "" }, { "9", "", "", "", "", "", "", "", "", "", "" }, {
		 * "10", "", "", "", "", "", "", "", "", "", "" }, };
		 * 
		 * final JTable jTableAdvesaire = new JTable(data, columnNames) { public
		 * boolean isCellEditable(int row, int column) { return false; } };
		 * JScrollPane tableContainer = new JScrollPane(jTableAdvesaire);
		 * jPanelTable.add(tableContainer, BorderLayout.CENTER);
		 * jFrame.getContentPane().add(jPanelTable);
		 * 
		 * JLabel labelAdveersaire = new JLabel(); labelAdveersaire.setText(
		 * "Grille de l'adversaire"); labelAdveersaire.setBounds(565, 25, 150,
		 * 25); // labelAdveersaire.setVisible(true);
		 * jFrame.add(labelAdveersaire);
		 * 
		 * JLabel labelMoi = new JLabel(); labelMoi.setText("Ma grille");
		 * labelMoi.setBounds(600, 300, 150, 25); //
		 * labelAdveersaire.setVisible(true); jFrame.add(labelMoi);
		 * 
		 * JLabel labelCinqDernierTireAdversaire = new JLabel();
		 * labelCinqDernierTireAdversaire.setText("5 derniers tirs");
		 * labelCinqDernierTireAdversaire.setBounds(1000, 25, 150, 25);
		 * jFrame.add(labelCinqDernierTireAdversaire);
		 * 
		 * JLabel labelCinqDernierTireMoi = new JLabel();
		 * labelCinqDernierTireMoi.setText("5 derniers tirs");
		 * labelCinqDernierTireMoi.setBounds(1000, 300, 150, 25);
		 * jFrame.add(labelCinqDernierTireMoi); /* // button 1 JeuButton
		 * btnPlacerPA = new JeuButton();
		 * jFrame.add(btnPlacerPA.jeuButton("btnPlacerPA", "Placer P-A", 80, 25,
		 * 150, 25));
		 * 
		 * // button 2 JeuButton btnPlacerCroiseur = new JeuButton();
		 * jFrame.add(btnPlacerCroiseur.jeuButton("btnPlacerCroiseur",
		 * "Placer Croiseur", 80, 50, 150, 25));
		 * 
		 * // button 3 JeuButton btnPlacerContreT = new JeuButton();
		 * jFrame.add(btnPlacerContreT.jeuButton("btnPlacerContreT",
		 * "Placer Contre T", 80, 75, 150, 25));
		 * 
		 * // button 4 JeuButton btnPlacerSousMarin = new JeuButton();
		 * jFrame.add(btnPlacerSousMarin.jeuButton("btnPlacerSousMarin",
		 * "Placer Sous Marin", 80, 100, 150, 25));
		 * 
		 * // button 5 JeuButton btnPlacerTorpilleur = new JeuButton();
		 * jFrame.add(btnPlacerTorpilleur.jeuButton("btnPlacerTorpilleur",
		 * "Placer Torpilleur", 80, 125, 150, 25));
		 * 
		 * // button 6 JeuButton btnAnnuler = new JeuButton();
		 * jFrame.add(btnAnnuler.jeuButton("btnAnnuler", "Annuler", 80, 150,
		 * 150, 25));
		 * 
		 * // button 7 JeuButton btnAide = new JeuButton();
		 * jFrame.add(btnAide.jeuButton("btnAide", "Aide", 80, 175, 150, 25));
		 * 
		 * // button 8 JeuButton btnRecommencer = new JeuButton();
		 * jFrame.add(btnRecommencer.jeuButton("btnRecommencer", "Recommencer",
		 * 80, 200, 150, 25));
		 *//*
			 * jFrame.setVisible(true);
			 * 
			 * jTableAdvesaire.addMouseListener(new MouseAdapter() { public void
			 * mouseClicked(MouseEvent e) { if (e.getClickCount() == 1) { JTable
			 * target = (JTable) e.getSource(); int row =
			 * target.getSelectedRow(); int column = target.getSelectedColumn();
			 * String columnHeader = (String)
			 * jTableAdvesaire.getColumnModel().getColumn(column).getHeaderValue
			 * ();
			 * 
			 * // afficher la position System.out.println("La position est : " +
			 * columnHeader + " " + (row + 1)); jTableAdvesaire.setValueAt("+",
			 * row, column); } } });
			 * 
			 * 
			 * /* jTableAdvesaire.addMouseMotionListener(new
			 * MouseMotionAdapter() { public void mouseMoved(MouseEvent e) { int
			 * row = jTableAdvesaire.rowAtPoint(e.getPoint());
			 * 
			 * int column = jTableAdvesaire.columnAtPoint(e.getPoint());
			 * 
			 * 
			 * 
			 * } });
			 */
	}

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

		JSplitPane gameSplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT, grillePanelAdverssaire, grillePanelJoueur);
		gameSplit.setResizeWeight(0.5);
		JSplitPane tireSplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT, tireAdversaire, tireJoueur);
		tireSplit.setResizeWeight(0.5);

		mainPanel.add(buttonsPanel, BorderLayout.WEST);
		mainPanel.add(gameSplit, BorderLayout.CENTER);
		mainPanel.add(tireSplit, BorderLayout.EAST);
		mainPanel.add(information, BorderLayout.SOUTH);

		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(mainPanel, BorderLayout.CENTER);
		pack();
		// resetState();
	}

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

	public JPanel buildTirePanel() {
		JPanel panel = new JPanel();
		JLabel header = new JLabel("5 derniers tirs : ");

		panel.add(header);

		return panel;
	}

	public JPanel buildGrillePanel(String headerPanel) {
		JPanel panel = new JPanel();
		JLabel headerLabel = new JLabel(headerPanel, SwingConstants.CENTER);

		// panel.setLayout(new GridLayout(2, 1));
		panel.add(headerLabel);

		String[] columnNames = { "", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };

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
		jTable.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 1) {
					JTable target = (JTable) e.getSource();
					int row = target.getSelectedRow();
					int column = target.getSelectedColumn();
					String columnHeader = (String) jTable.getColumnModel().getColumn(column).getHeaderValue();

					// afficher la position
					System.out.println("La position est : " + columnHeader + " " + (row + 1));
					jTable.setValueAt("+", row, column);
				}
			}
		});
		return panel;
	}

	private JButton buildButtonNavireAction(String nom, String text, int nbCase) {
		JeuButton button = new JeuButton(nom, text, nbCase);
		button.putClientProperty(BUTTON_NAVIRE, nbCase);
		button.addActionListener(navireListner);
		return button;
	}

	private final ActionListener navireListner = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JComponent source = (JComponent) e.getSource();
			Integer code = (Integer) source.getClientProperty(BUTTON_NAVIRE);
			
			operatorButtonPressed(code);
		}
	};

	public void operatorButtonPressed(int nbCase) {
		System.out.println("Nombre de case de ce navire : " + nbCase);
	}
}
