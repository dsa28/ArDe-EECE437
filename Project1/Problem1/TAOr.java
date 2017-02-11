
public class TAOr<T extends TABoolValue> extends TABoolFunction implements TABoolValue {

	public boolean value()
	{
		return value;
	}
	
	TAOr(T a, T b) 
	{
		
			
		op1 = a;
		op2 = b;
		
		opvalue = "||";
	}
	
	void listVal()
	{
		//op1.list();
		System.out.print(" ");
		//op2.list();
	}
	
	T op1, op2;

	@Override
	void evaluate() {
		// TODO Auto-generated method stub
		
	}

}
