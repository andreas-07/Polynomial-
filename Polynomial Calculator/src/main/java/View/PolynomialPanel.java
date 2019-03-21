package View;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PolynomialPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel selectLabel;
	private JButton exitButton;
	private JButton enterButton;
	private JButton enter2Button;
	private JButton plusButton;
	private JButton minusButton;
	private JButton divButton;
	private JButton mulButton;
	private JButton integreazaP1Button;
	private JButton deriveazaP1Button;
	private JButton integreazaP2Button;
	private JButton deriveazaP2Button;
	private JTextField polinom1;
	private JTextField polinom2;
	private JTextField plusTF;
	private JTextField minusTF;
	private JTextField divTF;
	private JTextField mulTF;
	private GridBagConstraints constraints;
	
	public PolynomialPanel() {
		setLayout(new GridBagLayout());
		
		selectLabel = new JLabel("Introduceti polinoamele:");
		enterButton = 	new JButton("Enter");
		integreazaP1Button = 	new JButton("Int");
		deriveazaP1Button =  	new JButton("Drv");
		integreazaP2Button = 	new JButton("Int");
		deriveazaP2Button =   	new JButton("Drv");
		enter2Button = 	new JButton("Enter");
		exitButton = 	new JButton("Exit");
		plusButton = 	new JButton("+");
		minusButton = 	new JButton("-");
		divButton = 	new JButton("/");
		mulButton = 	new JButton("*");
		polinom1 = new JTextField("Polinom 1");
		polinom2 = new JTextField("Polinom 2");
		plusTF =   new JTextField("Rezultat adunare");
		minusTF =  new JTextField("Rezultat scadere");
		divTF =    new JTextField("Rezultat impartire");
		mulTF =    new JTextField("Rezultat inmultire");
		
		constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.insets = new Insets(25, 25, 15, 5);
		constraints.weightx = 0;
		constraints.weighty = 0;
		
		enterButton.setPreferredSize(new Dimension(65, 25));
		enter2Button.setPreferredSize(new Dimension(65, 25));
		integreazaP1Button.setPreferredSize(new Dimension(60, 25));
		deriveazaP1Button.setPreferredSize(new Dimension(60, 25)); 
		integreazaP2Button.setPreferredSize(new Dimension(60, 25)); 
		deriveazaP2Button.setPreferredSize(new Dimension(60, 25)); 
		polinom1.setPreferredSize(new Dimension(300, 25));
		polinom2.setPreferredSize(new Dimension(300, 25));
		plusTF.setPreferredSize(new Dimension(300, 25));
		minusTF.setPreferredSize(new Dimension(300, 25));
		divTF.setPreferredSize(new Dimension(300, 25));
		mulTF.setPreferredSize(new Dimension(300, 25));
		exitButton.setPreferredSize(new Dimension(65, 25));
		plusButton.setPreferredSize(new Dimension(45, 25));
		minusButton.setPreferredSize(new Dimension(45, 25));
		divButton.setPreferredSize(new Dimension(45, 25));
		mulButton.setPreferredSize(new Dimension(45, 25));
		
		constraints.insets = new Insets(5, 10, 10, 10);
		add(selectLabel, constraints);
		constraints.gridy = 1;
		add(polinom1, constraints);
		constraints.gridy = 1;
		constraints.gridx++;
		add(enterButton, constraints);
		constraints.gridx++;
		add(integreazaP1Button, constraints);
		constraints.gridx++;
		add(deriveazaP1Button, constraints);
		constraints.gridy = 2;
		constraints.gridx = 0;
		add(polinom2, constraints);
		constraints.gridx++;
		add(enter2Button, constraints);
		constraints.gridx++;
		add(integreazaP2Button, constraints);
		constraints.gridx++;
		add(deriveazaP2Button, constraints);

		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		constraints.anchor = GridBagConstraints.CENTER;
		
		constraints.gridy = 4;
		constraints.gridx = 1;
		add(plusButton, constraints);
		constraints.gridy = 5;
		constraints.gridx = 1;
		add(minusButton, constraints);
		constraints.gridy = 6;
		constraints.gridx = 1;
		add(divButton, constraints);	
		constraints.gridy = 7;
		constraints.gridx = 1;
		add(mulButton, constraints);
		constraints.gridy = 7;
		constraints.gridx = 3;
		add(exitButton, constraints);
		
		constraints.gridy = 4;
		constraints.gridx = 0;
		add(plusTF, constraints);
		constraints.gridy = 5;
		constraints.gridx = 0;
		add(minusTF, constraints);
		constraints.gridy = 6;
		constraints.gridx = 0;
		add(divTF, constraints);	
		constraints.gridy = 7;
		constraints.gridx = 0;
		add(mulTF, constraints);
		
	}
	
	public void enterButtonActionListener(ActionListener actionListener) {
		enterButton.addActionListener(actionListener);
	}
	
	public void enter2ButtonActionListener(ActionListener actionListener) {
		enter2Button.addActionListener(actionListener);
	}
	
	public void exitButtonActionListener(ActionListener actionListener) {
		exitButton.addActionListener(actionListener);
	}

	public void plusButtonActionListener(ActionListener actionListener) {
		plusButton.addActionListener(actionListener);
	}
	
	public void minusButtonActionListener(ActionListener actionListener) {
		minusButton.addActionListener(actionListener);
	}
	
	public void divButtonActionListener(ActionListener actionListener) {
		divButton.addActionListener(actionListener);
	}
	
	public void mulButtonActionListener(ActionListener actionListener) {
		mulButton.addActionListener(actionListener);
	}
	
	public void intP1ButtonActionListener(ActionListener actionListener) {
		integreazaP1Button.addActionListener(actionListener);
	}
	
	public void drvP1ButtonActionListener(ActionListener actionListener) {
		deriveazaP1Button.addActionListener(actionListener);
	}
	
	public void intP2ButtonActionListener(ActionListener actionListener) {
		integreazaP2Button.addActionListener(actionListener);
	}
	
	public void drvP2ButtonActionListener(ActionListener actionListener) {
		deriveazaP2Button.addActionListener(actionListener);
	}
	
	public void plusKeyListener(KeyListener keyListener) {
		plusTF.addKeyListener(keyListener);
	}
	
	public void minusKeyListener(KeyListener keyListener) {
		minusTF.addKeyListener(keyListener);
	}
	
	public void divKeyListener(KeyListener keyListener) {
		divTF.addKeyListener(keyListener);
	}
	
	public void mulKeyListener(KeyListener keyListener) {
		mulTF.addKeyListener(keyListener);
	}
	
	public JTextField getPolinom1() {
		return polinom1;
	}

	public void setPolinom1(JTextField polinom1) {
		this.polinom1 = polinom1;
	}

	public JTextField getPolinom2() {
		return polinom2;
	}

	public void setPolinom2(JTextField polinom2) {
		this.polinom2 = polinom2;
	}

	public JTextField getPlusTF() {
		return plusTF;
	}

	public void setPlusTF(JTextField plusTF) {
		this.plusTF = plusTF;
	}

	public JTextField getMinusTF() {
		return minusTF;
	}

	public void setMinusTF(JTextField minusTF) {
		this.minusTF = minusTF;
	}

	public JTextField getDivTF() {
		return divTF;
	}

	public void setDivTF(JTextField divTF) {
		this.divTF = divTF;
	}

	public JTextField getMulTF() {
		return mulTF;
	}

	public void setMulTF(JTextField mulTF) {
		this.mulTF = mulTF;
	}
	
}
