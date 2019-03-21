package Controller;

import java.awt.GridBagLayout;
import javax.swing.JFrame;

import View.MainFrame;
import View.PolynomialPanel;

public class DisplayController {
	private MainFrame mainFrame;
	private PolynomialPanel polynomialPanel;
	
	public void showMainFrame() {
		mainFrame = new MainFrame();
		mainFrame.setTitle("Sistem de procesare Polinoame");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(600, 600);
		mainFrame.setVisible(true);
		mainFrame.setLayout(new GridBagLayout());	
	}
	
	public void showPolynomialPanel() {
	    mainFrame.getContentPane().removeAll();
	    mainFrame.revalidate();
	    polynomialPanel = new PolynomialPanel();
	    mainFrame.add(polynomialPanel);
	    mainFrame.pack();  
	}
		
	public MainFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	public PolynomialPanel getPolynomialPanel() {
		return polynomialPanel;
	}

	public void setPolynomialPanel(PolynomialPanel polynomialPanel) {
		this.polynomialPanel = polynomialPanel;
	}
	
}
