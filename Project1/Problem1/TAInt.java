
public class TAInt extends TANumeric {

	
	TANumeric newInstance()
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
