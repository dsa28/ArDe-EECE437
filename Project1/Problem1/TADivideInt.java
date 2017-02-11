public class TADivideInt<T extends TAIntValue> extends TADivide implements TAIntValue {

	void printState()
	{
		System.out.print(value);
	}
	
	
	String type()
	{
		return "int";
	}
	
	 void evaluate()
	 {
		 value = op1.value()/op2.value();	
		
	 }
	 
	public int value()
	{
		return value;
	}
	
	
	void operands()
	{
		System.out.println(op1.value() + " " + op2.value());
	}
	
	
	
	
	

	
	 TADivideInt(T a, T b)
	{
		op1 = a;
		op2 = b;
		
	}
	 
	 TADivideInt (T a, T b, String s)
	 {
		 this(a,b);
		 name = s;
	 }
	
	 
	
	 
	 
	T op1, op2;
	int value;
	
	
	
	
}