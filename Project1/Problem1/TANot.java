
public class TANot<T extends TABoolValue> extends TABoolFunction implements TABoolValue {
	
	public void evaluate() {
		op.evaluate();
		value = !(op.value());
		
	}
	
	public boolean value()
	{return value;}
	
	TANot(T a)
	{op = a;
	opvalue = "not";}
	
	public void list()
	{
		if (name!= null)
			System.out.println(name);
		else
		{
			System.out.print("(not ");
			op.list();
			System.out.print(")");
			}
				
	}
	
	T op;

	
	
	
}
