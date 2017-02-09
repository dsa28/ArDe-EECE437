
public class TAMinus extends TAInt{

	TAMinus(TAInt a) 
	{
		
			op1 = new TAInt(); //op1 = 0
			op2 = a;
				
	}
	
	TAMinus (TAInt a, TAInt b) //throws TAException
	{
		
	
		op1 = a;
		op2 = b;
		
				
	}
	
	
	void evaluate()
	{
		value = op1.value - op2.value;
	}
	
	
	TAInt op1,op2;
	
	
}
