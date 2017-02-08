
public class TANot extends TABoolFunction {
	
	TANot(TABool a)
	{
		
		op = a;
		//value = op.newInstance();
		opvalue = "not";
	}
	
	void listVal()
	{op.list();}
	
	TABool op;
	//TABool value;
	
}
