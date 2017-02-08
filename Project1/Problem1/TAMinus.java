
public class TAMinus extends TANumeric {

	TAMinus(TANumeric a) 
	{
		
			//op1 = 0 and is of the type of op2
			//op1 = op2.copyType();
			op2 = a;
			//value = op2.copyType();
		
	}
	
	TAMinus (TANumeric a, TANumeric b) throws TAException
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
	
	TANumeric op1,op2;
	TANumeric value;
}
