
public class TAInt extends TANumeric implements TAIntValue {

	public int value()
	{
		return value;
	}
	
	
	void set (int i)
	{value = i;	}
	
	void list()
	{System.out.print(name);}
	
	void evaluate()
	{
	
	}
	
	
	
	String type() {
		return "int";
	}

	
	TAInt(String s,int a)
	{
		name = s;
		value = a;
	}
	
	
	//Default constructor
	TAInt(String s)
	{
		value = 0;
		name = s;
	}
	

	
	int value;

	
	

}
