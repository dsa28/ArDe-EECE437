
public abstract class TANumericFunction extends TANumeric {

	/*
	 * TANumericFuncion, used to avoid repeating code
	 * and make modifying classes easier and faster
	 */
	void list()
	{
		if (name != null)
			System.out.println(name);
		else
		{
			System.out.println("(" + opvalue + " " );
			operands();
			
		}
	}
	
	abstract void operands();	
	
	
	
	String opvalue;
}
