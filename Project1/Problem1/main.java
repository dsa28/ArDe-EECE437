
public class main {

	public static void main (String[] args) throws TAException {

		TAInt x = new TAInt("x");
		TADouble d = new TADouble("d");
		TACeiling y = new TACeiling(d);
		TABool b = new TABool("b");
		TALessThan t1 = new TALessThan(x,y);
		TAAnd t2 = new TAAnd(b,t1);
		t2.list();
		x.set(5);
		d.set(2.3);
		b.set(true);
		
		TAMinus t3 = new TAMinus(x);
	    // t3 = new TAMinus(d,x);
		//t1 = new TALessThan(x,d);
	}

}
