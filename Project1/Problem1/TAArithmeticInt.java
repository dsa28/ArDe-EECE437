public class TAArithmeticInt extends TAInt {
	
	TAArithmeticInt (TAInt a, TAInt b)
	{
			op1 = a;
			op2 = b;		
				
	}
	
	void evaluate()
	{
		value = operator.evaluate(op1.value,op2.value);
	}
	
	
	TAInt op1,op2;
	TANumericFunction operator;
}
