
public class TALessThan extends TABoolFunction {

	TALessThan(TANumeric a, TANumeric b) throws TAException
	{
		

		op1 = a;
		op2 = b;
		
		
		//value = new TABool("newvalue");
		opvalue = "<";
	}
	
	void listVal()
	{
		op1.list();
		System.out.print(" ");
		op2.list();
	}
	
	void evaluate()
	{
		
	}
	
	
	TANumeric op1,op2;
	//TABool value;

}
