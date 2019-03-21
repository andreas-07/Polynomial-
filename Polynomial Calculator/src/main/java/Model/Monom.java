package Model;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Monom {
	private float coeficient;
	private int putere;
	@SuppressWarnings("unused")
	private String monom;
	
	public Monom() {}
	
	public Monom(String monom){
		if(validare(monom) == 1)
			this.monom = monom;
	}
	
	public Monom(float coeficient, int putere) {
		this.putere = putere;
		this.coeficient = coeficient;
	}
	
	public Monom(float coeficient) {
		this.coeficient = coeficient;
	}
	
	public int validare(String monom){
		Pattern p = Pattern.compile("(-?\\b\\d+)[xX]\\^(-?\\d+\\b)");
		Matcher m = p.matcher(monom);
		while(m.find()) 
		{
			if (Integer.parseInt(m.group(2)) < 0){
				throw new Error("Exponent negativ!");
			}
			else {
				this.coeficient = Float.parseFloat(m.group(1));
				this.putere = Integer.parseInt(m.group(2));
			}
		}
		return 1;
	}
	
	public String getMonom() {
		if (this.coeficient == 0)
			return 0 + "";
		else if (this.putere == 0)
			return this.coeficient + "";
		else if (this.putere == 1)
			return this.coeficient + "x";
		else
			return (this.coeficient + "x^" + this.putere);
	}	

	public Monom addition(Monom a) {
		Monom res = new Monom();
		if (a.putere == this.putere) {
			res = new Monom(a.coeficient + this.coeficient, a.putere);
		}
		return res;
	}
	
	public Monom substraction(Monom a) {
		Monom res = new Monom();
		if (a.putere == this.putere) {
			res = new Monom(a.coeficient - this.coeficient, a.putere);
		}
		return res;
	}
	
	public Monom multiplication(Monom a) {
		Monom res = new Monom();
		float coef = this.coeficient*a.coeficient;
		int powr = this.getPutere() + a.getPutere();
		res = new Monom(coef, powr);
		return res;
	}
	
	public Monom division(Monom a) {
		Monom res = new Monom();
		float coef = this.coeficient/a.coeficient;
		int powr = this.getPutere() - a.getPutere();
		res = new Monom(coef, powr);
		return res;
	}
	
	public void deriveaza() {
		if(this.putere != 0) {
			this.coeficient = this.coeficient * this.putere;
			this.putere = this.putere - 1;
		}
		else if (this.putere == 0){
			this.coeficient = 0;
		}
	}
	
	public void integreaza() {
		this.putere++;
		this.coeficient = this.coeficient / this.putere;
	}
	
	public void addCoeficient(float x) {
		this.coeficient += x;
	}
	
	public void afisareMonom() {
		System.out.println("Coeficient:" + this.coeficient + "\n" + "Putere:" + this.putere);
	}
	
	public static Comparator<Monom> comparatorPutere() {   
		Comparator<Monom> comp = new Comparator<Monom>(){
		    public int compare(Monom s1, Monom s2) {
		    	return Integer.compare(s1.putere, s2.putere);
		    }        
		};
		return comp;
	}  
	
	public float getCoeficient() {
		return this.coeficient;
	}
	
	public int getPutere() {
		return this.putere;
	}
	
	public void setCoeficient(float coeficient) {
		this.coeficient = coeficient;
	}

	public void setPutere(int putere) {
		this.putere = putere;
	}
}