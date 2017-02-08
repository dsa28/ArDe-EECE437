
public class TAOr extends TABoolFunction {

	TAOr(TABool a, TABool b) 
	{
		
			
		op1 = a;
		op2 = b;
		
		//value = new TABool();
		opvalue = "||";
	}
	
	void listVal()
	{
		op1.list();
		System.out.print(" ");
		op2.list();
	}
	
	TABool op1, op2;
	//TABool value;
}
