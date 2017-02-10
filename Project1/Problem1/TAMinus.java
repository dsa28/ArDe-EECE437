
public class TAMinus extends TANumericFunction {


	
	
	/*TAMinus(a)
	{
		op1 = a;
		opvalue = "-";
		single = true;
	}
	
	TAMinus (E a, String s)
	{
		op1 = a;
		opvalue = "-";
		single = true;
		name = s;
		
	}
	*/
	
	protected TAMinus()
	{
		
	}
	
	
	
	
	<E extends TAIntValue> TAMinus(E a)
	{
		operation = new TAMinusInt(a);
	}
	
	<E extends TADoubleValue> TAMinus(E a)
	{
		operation = new TAMinusDouble(a);
	}
	
	
	
	
	<E extends TAIntValue> TAMinus(E a, String s)
	{
		operation = new TAMinusInt(a,s);
	}
	
	<E extends TADoubleValue> TAMinus(E a, String s)
	{
		operation = new TAMinusDouble(a,s);
	}
	
	
	
	
	 <E extends TAIntValue> TAMinus(E a, E b)
	{
		operation = new TAMinusInt(a,b);
	}
	 
	 <E extends TADoubleValue> TAMinus (E a, E b)
	 {
		 operation = new TAMinusDouble(a,b);
	 }
	 
	 
	 
	 
	 
	 <E extends TAIntValue> TAMinus (E a, E b, String s)
	 {
		 operation = new TAMinusInt(a,b,s);
	}
	
	 <E extends TADoubleValue> TAMinus (E a, E b, String s)
	 {
		 operation = new TAMinusDouble(a,b,s);
	}
	 
	 
	 
	 
	 void evaluate()
	 {
		operation.evaluate();
	 }
	 
	 
	
	boolean single;
	TAMinus operation;
	

	
	
}
