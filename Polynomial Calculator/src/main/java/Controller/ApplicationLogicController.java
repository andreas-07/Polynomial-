package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import Model.Polinom;

public class ApplicationLogicController {

	private DisplayController displayController;	
	
	public ApplicationLogicController() {
		
		  //show GUI
		  displayController = new DisplayController();
		  displayMainFrame();
		  displayPolyPanel();
	}

	private void displayMainFrame() {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				displayController.showMainFrame();
    	}
    });
	}
	
	private void displayPolyPanel() {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				displayController.showPolynomialPanel();
				enterButtonPolyActionListener();
				enter2ButtonPolyActionListener();
				exitButtonPolyActionListener();
				plusButtonPolyActionListener();
				minusButtonPolyActionListener();
				divButtonPolyActionListener();
				mulButtonPolyActionListener();
				intP1ButtonPolyActionListener();
				intP2ButtonPolyActionListener();
				drvP1ButtonPolyActionListener();
				drvP2ButtonPolyActionListener();			 
			}
		});
	}
	
	private void enterButtonPolyActionListener() {
		displayController.getPolynomialPanel().enterButtonActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				displayController.getPolynomialPanel().getPolinom1().setText(" ");
			
			}
		});			
	}
	
	private void exitButtonPolyActionListener() {
		displayController.getPolynomialPanel().exitButtonActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayController.getMainFrame().dispose();
			}
		});			
	}
	
	private void enter2ButtonPolyActionListener() {
		displayController.getPolynomialPanel().enter2ButtonActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				displayController.getPolynomialPanel().getPolinom2().setText(" ");
				
			}
		});
	}
	
	private void plusButtonPolyActionListener() {
		displayController.getPolynomialPanel().plusButtonActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String polinom1 = displayController.getPolynomialPanel().getPolinom1().getText();
				String polinom2 = displayController.getPolynomialPanel().getPolinom2().getText();
				
				String buff1;
				String buff = (polinom1.contains("-")) ? polinom1.replace("-", "+-") : polinom1;
				buff1 = (buff.charAt(0) == '+') ? buff.substring(1) : buff;
				String[] p1 = buff1.split("\\+");
				
				String buff3;
				String buff2 = (polinom2.contains("-")) ? polinom2.replace("-", "+-") : polinom2;
				buff3 = (buff2.charAt(0) == '+') ? buff2.substring(1) : buff2;
				String[] p2 = buff3.split("\\+");
				
				Polinom a = new Polinom(p1);
				Polinom b = new Polinom(p2);
				Polinom res = a.add(b);
				
				displayController.getPolynomialPanel().getPlusTF().setText(res.afisarePolinom());
			}
		
		});
	}
	
	private void minusButtonPolyActionListener() {
		displayController.getPolynomialPanel().minusButtonActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String polinom1 = displayController.getPolynomialPanel().getPolinom1().getText();
				String polinom2 = displayController.getPolynomialPanel().getPolinom2().getText();
				
				String buff1;
				String buff = (polinom1.contains("-")) ? polinom1.replace("-", "+-") : polinom1;
				buff1 = (buff.charAt(0) == '+') ? buff.substring(1) : buff;
				String[] p1 = buff1.split("\\+");
				
				String buff3;
				String buff2 = (polinom2.contains("-")) ? polinom2.replace("-", "+-") : polinom2;
				buff3 = (buff2.charAt(0) == '+') ? buff2.substring(1) : buff2;
				String[] p2 = buff3.split("\\+");
				
				Polinom a = new Polinom(p1);
				Polinom b = new Polinom(p2);
				Polinom res = b.sub(a);
				
				displayController.getPolynomialPanel().getMinusTF().setText(res.afisarePolinom());
			}
		});
	}
	
	private void divButtonPolyActionListener() {
		displayController.getPolynomialPanel().divButtonActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
	
	private void mulButtonPolyActionListener() {
		displayController.getPolynomialPanel().mulButtonActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String polinom1 = displayController.getPolynomialPanel().getPolinom1().getText();
				String polinom2 = displayController.getPolynomialPanel().getPolinom2().getText();
				
				String buff1;
				String buff = (polinom1.contains("-")) ? polinom1.replace("-", "+-") : polinom1;
				buff1 = (buff.charAt(0) == '+') ? buff.substring(1) : buff;
				String[] p1 = buff1.split("\\+");
				
				String buff3;
				String buff2 = (polinom2.contains("-")) ? polinom2.replace("-", "+-") : polinom2;
				buff3 = (buff2.charAt(0) == '+') ? buff2.substring(1) : buff2;
				String[] p2 = buff3.split("\\+");
				
				Polinom a = new Polinom(p1);
				Polinom b = new Polinom(p2);
				Polinom res = a.mul(b);
				
				displayController.getPolynomialPanel().getMulTF().setText(res.afisarePolinom());
			}
		});
	}
	
	private void intP1ButtonPolyActionListener() {
		displayController.getPolynomialPanel().intP1ButtonActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String polinom1 = displayController.getPolynomialPanel().getPolinom1().getText();
				
				String buff1;
				String buff = (polinom1.contains("-")) ? polinom1.replace("-", "+-") : polinom1;
				buff1 = (buff.charAt(0) == '+') ? buff.substring(1) : buff;
				String[] p1 = buff1.split("\\+");
				
				Polinom a = new Polinom(p1);
				a.intg();
				
				displayController.getPolynomialPanel().getPolinom1().setText(a.afisarePolinom());
			}
		});
	}
	
	private void intP2ButtonPolyActionListener() {
		displayController.getPolynomialPanel().intP2ButtonActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String polinom2 = displayController.getPolynomialPanel().getPolinom2().getText();
				
				String buff1;
				String buff = (polinom2.contains("-")) ? polinom2.replace("-", "+-") : polinom2;
				buff1 = (buff.charAt(0) == '+') ? buff.substring(1) : buff;
				String[] p2 = buff1.split("\\+");
				
				Polinom a = new Polinom(p2);
				a.intg();
				
				displayController.getPolynomialPanel().getPolinom2().setText(a.afisarePolinom());
				
			}
		});
	}
	
	private void drvP1ButtonPolyActionListener() {
		displayController.getPolynomialPanel().drvP1ButtonActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String polinom1 = displayController.getPolynomialPanel().getPolinom1().getText();
				
				String buff1;
				String buff = (polinom1.contains("-")) ? polinom1.replace("-", "+-") : polinom1;
				buff1 = (buff.charAt(0) == '+') ? buff.substring(1) : buff;
				String[] p1 = buff1.split("\\+");
				
				Polinom a = new Polinom(p1);
				a.drv();
				
				displayController.getPolynomialPanel().getPolinom1().setText(a.afisarePolinom());
			}
		});
	}
	
	private void drvP2ButtonPolyActionListener() {
		displayController.getPolynomialPanel().drvP2ButtonActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String polinom2 = displayController.getPolynomialPanel().getPolinom2().getText();
				
				String buff1;
				String buff = (polinom2.contains("-")) ? polinom2.replace("-", "+-") : polinom2;
				buff1 = (buff.charAt(0) == '+') ? buff.substring(1) : buff;
				String[] p2 = buff1.split("\\+");
				
				Polinom a = new Polinom(p2);
				a.drv();
				
				displayController.getPolynomialPanel().getPolinom2().setText(a.afisarePolinom());
				
			}
		});
	}
}
