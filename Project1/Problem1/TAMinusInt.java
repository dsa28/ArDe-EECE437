
public class TAMinusInt<T extends TAIntValue> extends TAMinus implements TAIntValue {

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
		 if (!single)
		 value = op1.value()-op2.value();
		 else
		value = -op1.value();
	 }
	 
	public int value()
	{
		return value;
	}
	
	
	void operands()
	{
		
		System.out.println(op1.value());
		if (!single)
			System.out.println(" " + op2.value());
	}
	
	
	
	
	
	TAMinusInt(T a)
	{
		op1 = a;
		single = true;
	}
	
	TAMinusInt (T a, String s)
	{
		this(a);
		name = s;
		
	}
	
	 TAMinusInt(T a, T b)
	{
		op1 = a;
		op2 = b;
		single = false;
		
	}
	 
	 TAMinusInt (T a, T b, String s)
	 {
		 this(a,b);
		 name = s;
	 }
	
	 
	
	 
	 
	T op1, op2;
	int value;
	
	
	
	
}
