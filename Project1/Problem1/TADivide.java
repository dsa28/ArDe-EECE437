
public class TADivide extends TANumericFunction{

	void printState()
	{
		operation.printState();
	}
	
	String type()
	{
		return operation.type();
		
	}
	
	
	void evaluate()
		 {
			operation.evaluate();
		 }
		 
	void operands()
	{
		operation.operands();
	}
	
	
	
	

	
	protected TADivide()
	{
		opvalue = "/";
	}
	
	
	
	
	
	//two arguemnts
	 <E extends TAIntValue> TADivide(E a, E b)
	{
		operation = new TADivideInt(a,b);
	}
	 
	 <E extends TADoubleValue> TADivide(E a, E b)
	 {
		 operation = new TADivideDouble(a,b);
	 }
	 
	 
	 
	 
	 //two arguments and a name
	 <E extends TAIntValue> TADivide(E a, E b, String s)
	 {
		 operation = new TADivideInt(a,b,s);
	}
	
	 <E extends TADoubleValue> TADivide (E a, E b, String s)
	 {
		 operation = new TADivideDouble(a,b,s);
	}
	 
	 
	 
	
	private TADivide operation;
	
	
	
	
}
	

