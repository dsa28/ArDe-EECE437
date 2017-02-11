
public class TAAnd extends TABoolFunction {

	/*
	 * The AND operator is a binary operator 
	 * which takes as input two boolean values
	 * and outputs a boolean value
	 */
	
	TAAnd(TABool a, TABool b) 
	{
			op1 = a;
			op2 = b;
		
		
		
		opvalue = "&";
	}
	
	void evaluate()
	{
		value= op1.value&&op2.value;
	}
	
	void listVal()
	{op1.list();
	System.out.print(" ");
	op2.list();}
	
	
	TABool op1,op2;
	

}
