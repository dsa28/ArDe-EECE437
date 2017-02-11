public class TAPlusDouble<T extends TADoubleValue> extends TAPlus implements TADoubleValue {

	void printState()
	{
		System.out.print(value);
	}
	
	String type()
	{
		return "double";
	}
	
	 void evaluate()
	 {
		 value = op1.value()+op2.value();	
	 }
	 
	public double value()
	{
		return value;
	}
	
	
	void operands()
	{
		System.out.println(op1.value() + " " + op2.value());
	}
	
	
	
	
	
	
	 TAPlusDouble(T a, T b)
	{
		op1 = a;
		op2 = b;
		
	}
	 
	 TAPlusDouble (T a, T b, String s)
	 {
		 this(a,b);
		 name = s;
	 }
	
	 
	
	 
	 
	T op1, op2;
	double value;
	
	
	
	
}