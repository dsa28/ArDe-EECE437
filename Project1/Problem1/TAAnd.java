
public class TAAnd<T extends TABoolValue> extends TABoolFunction implements TABoolValue {

 /*
	 * The AND operator is a binary operator 
	 * which takes as input two boolean values
	 * and outputs a boolean value
	 */
	
	public boolean value()
	{
		return value;
	}
	
	TAAnd(T a, T b) 
	{
			op1 = a;
			op2 = b;
		
		
		
		opvalue = "&";
	}
	
	void evaluate()
	{
		value= op1.value() && op2.value();
	}
	
	void listVal()
	{//op1.list();
	System.out.print(" ");
	//op2.list();
	}
	
	
	T op1,op2;


		

}
