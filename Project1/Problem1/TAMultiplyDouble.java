public class TAMultiplyDouble<T extends TADoubleValue> extends TAMultiply implements TADoubleValue {

	String type()
	{
		return "double";
	}
	
	 void evaluate()
	 {
		
		 value = op1.value()*op2.value();	
	 }
	 
	public double value()
	{
		return value;
	}
	
	
	void operands()
	{
		System.out.println(op1.value() + " " + op2.value());
	}
	
	
	
	
	
	
	 TAMultiplyDouble(T a, T b)
	{
		op1 = a;
		op2 = b;
		
	}
	 
	 TAMultiplyDouble (T a, T b, String s)
	 {
		 this(a,b);
		 name = s;
	 }
	
	 
	
	 
	 
	T op1, op2;
	double value;
	
	
	
	
}