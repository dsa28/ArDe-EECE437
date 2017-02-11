
public class TABool extends TAObject {

	void list()
	{System.out.print(name);	}
	
	void set(boolean bool)
	{value=bool;}
	
	String type() {
		return "bool";
	}
	
	
	void evaluate()
	{}
	
	void pritnState()
	{
		System.out.println(value);
	}
	
	
	TABool(String s,boolean a)
	{
		name = s;
		value = a;
	}
	
	TABool (String s)
	{
		value = false;
		name = s;
	}
	
	
	
	
	 boolean value;
	 

}
