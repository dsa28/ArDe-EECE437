public abstract class TABoolFunction extends TAObject  {

	
String type()
{
	return "bool";
}
	
void list()
	{
		if (name!=null)
			System.out.print(name);
		else
			{System.out.print("(" + opvalue + " " );
			//listVal();
			System.out.print(")");}
	}
	
	
	//abstract void listVal();
	
	
	
	
	String opvalue;
	boolean value;
	//TABool value;
}