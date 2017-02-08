
public class TADivide extends TANumericFunction {
	
	TADivide(TANumeric a, TANumeric b) throws TAException
	{
		
		if (a.type() != b.type())
		{
		System.err.println("Both arguments should be of same type");
		throw new TAException();
		}
	
	
			op1 = a;
			op2 = b;
			//value = op1;
				
	}
	
	
	String type() {
		
		return value.type();
	}
	
	TANumeric op1,op2;
	TANumeric value;
}
