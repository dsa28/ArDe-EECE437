
public class TAInt extends TANumeric {

	
	void set (int i)
	{value = i;	}
	
	void list()
	{
		if (name!=null)
			System.out.print(name);
		else
			System.out.print(value);
			
	}
	
	
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
	TAInt(String s)
	{
		value = 0;
		name = s;
	}
	
	TAInt()
	{
		value = 0;
	}
	
	int value;

}
