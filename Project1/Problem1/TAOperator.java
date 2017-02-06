
public class TAOperator extends TAObject {

	String type()
	{
		return value.type();
	}
	
	TAObject copyType()
	{
		return value.copyType();
	}

	TAObject value;
}
