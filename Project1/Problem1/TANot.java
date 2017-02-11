
public class TANot<T extends TABoolValue> extends TABoolFunction implements TABoolValue {
	
	
	public boolean value()
	{
		return value;
	}
	
	TANot(T a)
	{op = a;
	opvalue = "not";}
	
	void listVal(){}
	//{op.list();}
	
	T op;

	@Override
	void evaluate() {
		// TODO Auto-generated method stub
		
	}
	
}
