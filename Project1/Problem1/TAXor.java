
public class TAXor extends TAOperator {
	
	
	TAXor(TAObject a, TAObject b) throws TAException
	{
		if (a.type() != "bool" || b.type() != "bool")
			{
			System.err.println("Both arguments should be of type TABool");
			throw new TAException();
			}
		
		
			op1 = a;
			op2 = b;
			value = new TABool();
	}
	
	TAObject op1, op2;
}
