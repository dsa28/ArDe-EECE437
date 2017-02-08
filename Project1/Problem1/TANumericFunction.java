
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
		}
	}
	
	
	
	TANumeric newInstance() {
		/*
		 * Function newInstance is used to generate
		 * a new instance of the type of the TANumeric
		 */
		
		return value.newInstance();
	}

	
	String type() {
		return value.type();
	}

	TANumeric value;
	String opvalue;
}
