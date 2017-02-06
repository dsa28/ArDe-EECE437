
public class TABool extends TAObject {

	
	TAObject copyType()
	{
		return new TABool();
	}
	
	
	String type() {
		return "bool";
	}
	
	TABool(boolean a)
	{
		value = a;
	}
	
	TABool ()
	{
		value = false;
	}
	
	
	 boolean value;

}
