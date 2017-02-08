
public class TAEqual extends TABoolFunction {
	
	
	TAEqual(TAObject a, TAObject b) throws TAException
	{
		if (a.type() != b.type())
		{
			System.err.println("Both arguments should be of the same type");
			throw new TAException();
		}
		
			op1 = a;
			op2 = b;
		
		
		value = new TABool();
		opvalue = "==";
	}
	
	void listVal()
	{
		op1.list();
		System.out.print(" ");
		op2.list();
	}
	
	
	TAObject op1, op2;
	TABool value;
}
