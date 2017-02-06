
public class TAMoreThan extends TAOperator {
	
	
	TAMoreThan(TAObject a, TAObject b) throws TAException
	{
		if (a.type() != b.type())
		{
		System.err.println("Both arguments should be of same type");
		throw new TAException();
		}
	
	if (a.type() == "bool")
	{
		System.err.println("Arguments should not be of type TABool");
		throw new TAException();
	}

			op1 = a;
			op2 = b;
		
		
		value = new TABool();
	}
	
	TAObject op1, op2;
	
}
