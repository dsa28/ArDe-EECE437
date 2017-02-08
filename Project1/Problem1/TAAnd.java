
public class TAAnd extends TABool {

	/*
	 * The AND operator is a binary operator 
	 * which takes as input two boolean values
	 * and outputs a boolean value
	 */
	
	TAAnd(TABool a, TABool b) 
	{
		
			op1 = a;
			op2 = b;
		
		
		value = new TABool();
	}
	
	TABool op1,op2;
	TABool value;

}
