
public class main {

	public static void main (String[] args) throws TAException {

		TAInt x = new TAInt("x");
		TADouble d = new TADouble("d");
		TACeiling y = new TACeiling(d);
		TABool b = new TABool("b");
		//TALessThan t1 = new TALessThan(x,y);
		//TAAnd t2 = new TAAnd(b,t1);
		//t2.list();
		x.set(5);
		d.set(2.3);
		b.set(true);
		TAPlusInt t5 = new TAPlusInt (x,y);
		
		TAMinus t3 = new TAMinusInt(y,t5);
		

	    t3.evaluate();
	    t3.printState();
		//t1 = new TALessThan(x,d);
	}

}
