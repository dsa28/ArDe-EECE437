
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
	{op = a;}
	
	
	
	TACeiling (TANumeric a, String s)
	{op = a;
	name = s;}
	
	void evaluate()
	{
		//value.set(ceiling(op.value));
	}
	
	TANumeric op;
	int value;
	

}
