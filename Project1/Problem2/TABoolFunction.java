public abstract class TABoolFunction extends TABool {

	void list()
	{
		if (name!=null)
			System.out.print(name);
		else
			{System.out.print("(" + opvalue + " " );
			listVal();
			System.out.print(")");}
	}
	
	abstract void listVal();
	
	
	String opvalue;
}