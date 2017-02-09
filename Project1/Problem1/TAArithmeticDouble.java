public class TAArithmeticDouble extends TADouble {
	
	TAArithmeticDouble (TADouble a, TADouble b)
	{
			op1 = a;
			op2 = b;		
				
	}
	
	void evaluate()
	{
		value = operator.evaluate(op1.value,op2.value);
	}
	
	
	TADouble op1,op2;
	TANumericFunction operator;
}
