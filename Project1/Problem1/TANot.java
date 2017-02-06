
public class TANot extends TAOperator {
	
	TANot (TAObject a) throws TAException
	{
		if (a.type() != "bool")
		{
			System.err.println("Argument should be of type TABool");
			throw new TAException();
		}
		op = a;
		value = new TABool();
		
	}
	
	TAObject op;
	
}
