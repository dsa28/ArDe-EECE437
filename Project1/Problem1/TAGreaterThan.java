public class TAGreaterThan extends TABoolFunction implements TABoolValue {
	public boolean value()
	
	{
		return value;
	}
	
	TAGreaterThan(TANumeric a, TANumeric b) 
	{
		
	
		op1 = a;
		op2 = b;
		
		
		//value = new TABool();
		opvalue = ">";
	}
	
	
	void listVal()
	{
		op1.list();
		System.out.print(" ");
		op2.list();
	}
	
	TAObject op1,op2;
	//TABool value;

	@Override
	void evaluate() {
		// TODO Auto-generated method stub
		
	}

}
