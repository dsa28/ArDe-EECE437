
public class TANot extends TABoolFunction {
	
	TANot(TABool a)
	{op = a;
	opvalue = "not";}
	
	void listVal()
	{op.list();}
	
	TABool op;
	
}
