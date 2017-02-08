
public class TAMultiply extends TANumericFunction {
	
	TAMultiply (TANumeric a, TANumeric b) throws TAException
	{
		
		if (a.type() != b.type())
	
		{
			System.err.println("Both arguments should be of same type");
			throw new TAException();
			}
		
	
			op1 = a;
			op2 = b;
			value = op1.newInstance();
		
				
	}
	
	
	
	TANumeric op1,op2;
	
}
