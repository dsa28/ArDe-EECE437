
public class main {

	public static void main (String[] args) throws TAException {

		TAInt x = new TAInt();
		TADouble d = new TADouble();
		TACeiling y = new TACeiling(d);
		TABool b = new TABool();
		TALessThan t1 = new TALessThan(x,y);
		TAAnd t2 = new TAAnd(b,t1);
		
		TAMinus t3 = new TAMinus(x);
		t3 = new TAMinus(y,x);
		//t1 = new TALessThan(x,d);
	}

}
