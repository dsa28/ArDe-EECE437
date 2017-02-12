
public class TAXor<T extends TABoolValue> extends TABoolFunction implements TABoolValue {
	
	
	public void evaluate() {
		op1.evaluate();
		op2.evaluate();
		value = (op1.value()||op2.value()) && !(op1.value()&&op2.value());
		
	}
	
	public boolean value()
	{return value;}
	
	TAXor(T a, T b) 
	{
		
			op1 = a;
			op2 = b;
			
			opvalue = "xor";
	}
	
	
	public void list()
	{
		if (name!= null)
			System.out.println(name);
		else
		{
			System.out.print("(= ");
			op1.list();
			System.out.print(" ");
			op2.list();
			System.out.print(")");
			}
				
	}
	
	
	T op1, op2;


	
	
	
}
