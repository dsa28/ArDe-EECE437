
public class TAEqual extends TABoolFunction {
	
	TAEqual(TABool a, TABool b)
	{
		op1 = a;
		op2 = b;
	}
	
	TAEqual(TANumeric a, TANumeric b) throws TAException
	{
		if (a.type() != b.type())
		{
			System.err.println("Both arguments should be of the same type");
			throw new TAException();
		}
		
			op1 = a;
			op2 = b;
		
			opvalue = "=";
	}
	
	void listVal()
	{
		op1.list();
		System.out.print(" ");
		op2.list();
	}
	
	
	TAObject op1, op2;
	
}
