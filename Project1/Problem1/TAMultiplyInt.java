public class TAMultiplyInt<T extends TAIntValue> extends TAMultiply implements TAIntValue {

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
		 value = op1.value()*op2.value();	
		
	 }
	 
	public int value()
	{
		return value;
	}
	
	
	void operands()
	{
		System.out.println(op1.value() + " " + op2.value());
	}
	
	
	
	
	

	
	 TAMultiplyInt(T a, T b)
	{
		op1 = a;
		op2 = b;
		
	}
	 
	 TAMultiplyInt (T a, T b, String s)
	 {
		 this(a,b);
		 name = s;
	 }
	
	 
	
	 
	 
	T op1, op2;
	int value;
	
	
	
	
}