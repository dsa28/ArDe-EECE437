
public class TANot extends TABool {
	
	TANot (TABool a)
	{
		
		op = a;
		value = new TABool();
		
	}
	
	TABool op;
	TABool value;
	
}
