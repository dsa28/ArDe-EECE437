
public class TAEqual extends TABoolFunction implements TABoolValue {
	
	public boolean value()
	{
		return value;
	}
	
	TAEqual(TABool a, TABool b)
	{
		op1 = a;
		op2 = b;
	}
	
	TAEqual(TANumeric a, TANumeric b) 
	{
		
		
			op1 = a;
			op2 = b;
		
			opvalue = "=";
	}
	
	void listVal()
	{
		op1.list();
		System.out.print(" ");
		op2.list();
	}
	
	
	TAObject op1, op2;


	@Override
	void evaluate() {
		// TODO Auto-generated method stub
		
	}
	
}
