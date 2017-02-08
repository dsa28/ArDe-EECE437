
public class TABool extends TAObject {

	void list()
	{
		if (name!=null)
			System.out.print(name);
		else
			System.out.print(value);
			
	}
	
	void set(boolean bool)
	{value=bool;}
	
	String type() {
		return "bool";
	}
	
	TABool newInstance()
	{return new TABool();}
	
	void evaluate()
	{
		
	}
	
	void pritnState()
	{
		System.out.println(value);
	}
	
	
	TABool(boolean a)
	{
		value = a;
	}
	
	TABool (String s)
	{
		value = false;
		name = s;
	}
	
	 TABool()
	{
		value = false;
	}
	
	
	 boolean value;
	 

}
