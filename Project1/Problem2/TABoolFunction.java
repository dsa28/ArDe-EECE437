public abstract class TABoolFunction extends TABool {

	TABoolFunction(String s) {
		super(s);
	}


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
	//TABool value;
}