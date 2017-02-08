
public class TAFloor extends TAInt{
	
	void list()
	{
		if (name != null)
			System.out.print(name);
		else
			{System.out.print("(floor" + " " );
			op.list();
			System.out.print(")");
			}
	}
	
	
	TAFloor (TANumeric a) 
	{
		
		 op = a;
		value = new TAInt();
		
	}
	
	TAFloor (TANumeric a, String s)
	{
		op = a;
		name = s;
		value = new TAInt();
	}
	
	
	
	TAObject op;
	TAInt value;
}
