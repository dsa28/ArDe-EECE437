
public class TAInt extends TANumeric {

	
	TAObject copyType()
	{
		return new TAInt();
		
	}
	
	
	String type() {
		return "int";
	}

	
	TAInt(int a)
	{
		value = a;
	}
	
	
	//Default constructor
	TAInt()
	{
		value = 0;
	}
	
	
	int value;

}
