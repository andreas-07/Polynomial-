package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Polinom {
	@SuppressWarnings("unused")
	private String[] monoame;
	List<Monom> polinom = new ArrayList<Monom>();
	
	public Polinom() {}
	
	public Polinom(String[] monoame)
	{ 
		this.setMonoame(monoame);
		
		for(int i = 0; i < monoame.length; i++) {
			System.out.println(monoame[i]);
			polinom.add(new Monom(monoame[i]));
		}
	}
	
	public String afisarePolinom() {
		String polinomStr = new String(" ");
		for(int i = 0; i < polinom.size(); i++) {
			if(polinom.get(i).getCoeficient() < 0) 
				polinomStr += polinom.get(i).getMonom();
			else {
				if (i == 0) 
					polinomStr += polinom.get(i).getMonom();
				else
					polinomStr += " + " + polinom.get(i).getMonom();
			}
		}
		return polinomStr;
	}
	
	public Polinom add(Polinom a) {
		Polinom res = new Polinom();
		int i = 0, j = 0;
		while(i < this.polinom.size() && j < a.polinom.size()) {
			if(this.polinom.get(i).getPutere() == a.polinom.get(j).getPutere()) {
				Monom m = new Monom(this.polinom.get(i).getCoeficient(), this.polinom.get(i).getPutere());
				Monom m1 = new Monom(a.polinom.get(j).getCoeficient(), a.polinom.get(j).getPutere());
				//System.out.println(m1.getCoeficient());
				if(m.getCoeficient() < 0 || m1.getCoeficient() < 0) {
					Monom r = new Monom(m1.getCoeficient() + m.getCoeficient(), m.getPutere());
					res.polinom.add(r);
				}
				else {
				m = this.polinom.get(i).addition(a.polinom.get(j));
				if(m.getCoeficient() != 0)
					res.polinom.add(m);}
				i++;
				j++;}
			else if(this.polinom.get(i).getPutere() < a.polinom.get(j).getPutere()) {
				res.polinom.add(this.polinom.get(i));
				i++;}
			else {
				res.polinom.add(a.polinom.get(j));
				j++;}
		}
		while(i < this.polinom.size()) {
			res.polinom.add(this.polinom.get(i));
			i++;}
		while(j < a.polinom.size()) {
			res.polinom.add(a.polinom.get(j));
			j++;}
		return res;
	}		
	
	public Polinom sub(Polinom a) {
		Polinom res = new Polinom();
		int i = 0, j = 0;
		while(i < this.polinom.size() && j < a.polinom.size()) {
			if(this.polinom.get(i).getPutere() == a.polinom.get(j).getPutere()) {
				Monom m = this.polinom.get(i).substraction(a.polinom.get(j));
				if(m.getCoeficient() != 0)
					res.polinom.add(m);
				i++;
				j++;}
			else if(this.polinom.get(i).getPutere() < a.polinom.get(j).getPutere()) {
				res.polinom.add(this.polinom.get(i));
				i++;}
			else {
				res.polinom.add(a.polinom.get(j));
				j++;}
		}
		while(i < this.polinom.size()) {
			res.polinom.add(this.polinom.get(i));
			i++;}
		while(j < a.polinom.size()) {
			res.polinom.add(a.polinom.get(j));
			j++;}
		return res;
	}		
	
	public Polinom mul(Polinom a) {
		Polinom res = new Polinom();
		for(int i = 0; i <this.polinom.size(); i++) 
		{
			Monom x = this.polinom.get(i);
			for(int j = 0; j < a.polinom.size(); j++) 
			{
				Monom y = a.polinom.get(j);
				Monom z = x.multiplication(y);
				res.polinom.add(z);
			}
		}
		res.sortMultiplicationResult();
		return res;
	}
	
	public void sortMultiplicationResult() {
		for(int i = 0; i < polinom.size(); i++) 
		{
			int putere = polinom.get(i).getPutere();
			for(int j = i + 1; j < polinom.size(); j++) 
			{
				int temp_putere = polinom.get(j).getPutere();
				if(putere == temp_putere) {
					polinom.get(i).addCoeficient(polinom.get(j).getCoeficient());
					this.polinom.remove(j);
				}
			}
		}
		Collections.sort(this.polinom, Monom.comparatorPutere());
	}
	
	public void drv() {
		for(int i = 0; i < this.polinom.size(); i++)
			this.polinom.get(i).deriveaza();
	}
	
	public void intg() {
		for(int i = 0; i < this.polinom.size(); i++)
			this.polinom.get(i).integreaza();
	}
	
	public void setMonoame(String[] monoame) {
		this.monoame = monoame;
	}

}