
public class TANot extends TABoolFunction {
	
	TANot(TABool a)
	{
		
		op = a;
		value = op.newInstance();
		opvalue = "not";
	}
	
	void listVal()
	{value.list();}
	
	TABool op;
	TABool value;
	
}
