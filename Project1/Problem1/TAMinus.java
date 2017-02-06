
public class TAMinus extends TAOperator {

	TAMinus(TAObject a) throws TAException
	{
		if (a.type() == "bool")
			{
			System.err.println("Argument should not be of type TABool");
			throw new TAException();
			}
		
		else 
		{
			//op1 = 0 and is of the type of op2
			op1 = op2.copyType();
			op2 = a;
			value = op2.copyType();
		}
	}
	
	TAMinus (TAObject a, TAObject b) throws TAException
	{
		if (a.type() != b.type())
	{
	System.err.println("Both arguments should be of same type");
	throw new TAException();
	}


		if (a.type() == "bool"){
	System.err.println("Arguments should not be of type TABool");
	throw new TAException();
	}
	
		op1 = a;
		op2 = b;
		value = op1.copyType();
		
				
	}
	
	TAObject op1,op2;
	
}
