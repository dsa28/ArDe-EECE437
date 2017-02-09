
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
	{op = a;}
	
	TAFloor (TANumeric a, String s)
	{
		op = a;
		name = s;
	
	}
	
	
	
	TAObject op;
	int value;
}
