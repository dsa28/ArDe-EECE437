
public class TAMinusInt<T extends TAIntValue> extends TAMinus implements TAIntValue {

	public int value()
	{
		return value;
	}
	
	
	TAMinusInt(T a)
	{
		op1 = a;
		opvalue = "-";
		single = true;
	}
	
	TAMinusInt (T a, String s)
	{
		op1 = a;
		opvalue = "-";
		single = true;
		name = s;
		
	}
	
	 TAMinusInt(T a, T b)
	{
		op1 = a;
		op2 = b;
		opvalue = "-";
		single = false;
		
	}
	 
	 TAMinusInt (T a, T b, String s)
	 {
		 op1 = a;
		 op2 = b;
		 name = s;
		 opvalue = "-";
		 single = false;
	 }
	
	 
	 void evaluate()
	 {
		 if (!single)
		 value = op1.value()-op2.value();
		 else
		value = -op1.value();
	 }
	 
	 
	T op1, op2;
	boolean single;
	int value;
	
	
	
	
}
