
public class TACeiling extends TAInt{
	
	void list()
	{
		if (name != null)
			System.out.print(name);
		else
			{System.out.print("(ceiling" + " " );
			op.list();
			System.out.print(")");
			}
	}
	
	TACeiling (TANumeric a) 
	{
		
		op = a;
		value = new TAInt();
		
	}
	
	TACeiling (TANumeric a, String s)
	{
		op = a;
		name = s;
		value = new TAInt();
		
	}
	
	TAObject op;
	TAInt value;
	

}
