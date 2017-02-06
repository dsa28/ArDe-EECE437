
public class TACeiling extends TAOperator{
	
	TACeiling (TAObject a) throws TAException
	{
		if (a.type() == "bool")
		{
			System.err.println("Argument shouldn't be of type TABool");
			throw new TAException();
		}
		
		op = a;
		value = new TAInt();
		
	}
	
	TAObject op;
	//TAInt value;
	

}
