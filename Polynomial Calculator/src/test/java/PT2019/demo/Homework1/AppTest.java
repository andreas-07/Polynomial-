package PT2019.demo.Homework1;

import Model.Polinom;
import junit.framework.TestCase;

public class AppTest extends TestCase
{
	public Polinom a = new Polinom();
	public Polinom b = new Polinom();
	
	String polinom1 = new String("1x^2 + 3x^1 + 3x^0");
	String polinom2 = new String("2x^2 -2x^1 + 1x^0");
	
	public Polinom createPolinom(String str) {
    	String buff1;
		String buff = (str.contains("-")) ? str.replace("-", "+-") : str;
		buff1 = (buff.charAt(0) == '+') ? buff.substring(1) : buff;
		String[] r = buff1.split("\\+");
		Polinom res = new Polinom(r);
		return res;
    }
	
    public AppTest( String testName )
    {
        super( testName );
    }
    
    public void setUp() {
    	a = createPolinom(polinom1);
    	
    	b = createPolinom(polinom2);
    }
    
    public void testAdd() {
    	String pres = new String("3x^2 + 1x^1 + 4x^0");
    	Polinom resAux = createPolinom(pres);
    	Polinom res = a.add(b);
    	assertTrue(res.afisarePolinom().equals(resAux.afisarePolinom()));
    }    
    
    public void testSub() {
    	String pres = new String("1x^2 -5x^1 -2x^0");
    	Polinom resAux = createPolinom(pres);
    	Polinom res = a.sub(b);
    	assertTrue(res.afisarePolinom().equals(resAux.afisarePolinom()));
    }
    
    public void testMul() {
    	String pres = new String(" 3x^0-3x^1 + 1x^2 + 4x^3 + 2x^4");
    	Polinom resAux = createPolinom(pres);
    	Polinom res = a.mul(b);
    	assertTrue(res.afisarePolinom().equals(resAux.afisarePolinom()));
    }
    
    public void testDrv() {
    	String pres = new String(" 2x^1 + 3x^0 + 0x^0");
    	Polinom resAux = createPolinom(pres);
    	String res = new String(" 2x^1 + 3x^0 + 0x^0");
    	Polinom res1= createPolinom(res);
    	assertTrue(resAux.afisarePolinom().equals(res1.afisarePolinom()));
    }
    
    public void testIntg() {
    	String pres = new String(" 0.33333334x^3 + 1.5x^2 + 3.0x^1");
    	Polinom resAux = createPolinom(pres);
    	String res = new String(" 0.33333334x^3 + 1.5x^2 + 3.0x^1");
    	Polinom res1= createPolinom(res);
    	assertTrue(resAux.afisarePolinom().equals(res1.afisarePolinom()));
    }
    
    public void tearDown(){
    	 a = new Polinom();
    	 b = new Polinom();
    	 System.out.println("tearDown: a: " + a.afisarePolinom() + ", b: " + b.afisarePolinom());
    	 }
}
