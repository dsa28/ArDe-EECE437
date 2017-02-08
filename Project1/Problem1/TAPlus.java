
public class TAPlus extends TANumericFunction {

	TAPlus (TANumeric a, TANumeric b)
	{
		if (a.type() != b.type())
			{
			System.err.println("Both arguments should be of same type");
	
			}
		
		
			op1 = a;
			op2 = b;
			//value = op1.copyType();
		
				
	}
	
	String type()
	{
		return value.type();
	}
	

	
	TANumeric op1,op2;
	TANumeric value;
}
