
public class TAMultiply extends TANumeric {
	
	TAMultiply (TANumeric a, TANumeric b) throws TAException
	{
		
		if (a.type() != b.type())
	
		{
			System.err.println("Both arguments should be of same type");
			throw new TAException();
			}
		
	
			op1 = a;
			op2 = b;
			//value = op1.copyType();
		
				
	}
	
	String type()
	{
		return value.type();
	}
	
	TAObject op1,op2;
	TANumeric value;
}
