
public class TAInt extends TAObject {

	
	TAObject copyType()
	{
		return new TAInt();
		
	}
	
	
	String type() {
		return "int";
	}

	
	/*void list() {
		
	}*/
	
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
