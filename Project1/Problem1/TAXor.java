
public class TAXor extends TABool {
	
	
	TAXor(TABool a, TABool b) 
	{
		
			op1 = a;
			op2 = b;
			
			value = new TABool();
	}
	
	TABool op1, op2;
	TABool value;
}
