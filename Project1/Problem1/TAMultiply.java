
public class TAMultiply extends TAInt {
	
	TAMultiply (TAInt a, TAInt b)
	{
			op1 = a;
			op2 = b;		
				
	}
	
	void evaluate()
	{
		value = op1.value*op2.value;
	}
	
	
	TAInt op1,op2;
	
}
