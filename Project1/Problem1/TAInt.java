
public class TAInt extends TANumeric implements Comparable<TAInt> {

	public int compareTo(TAInt o) {
		
		return new Integer(value).compareTo(o.value);
	}
	
	
	void set (int i)
	{value = i;	}
	
	void list()
	{
		if (name!=null)
			System.out.print(name);
		else
			System.out.print(value);
			
	}
	
	void evaluate()
	{
		
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
