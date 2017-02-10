
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
	
	
	int evaluate(int a,int b)
	{	return 0;}
	double evaluate (double a, double b)
	{return 0.0;}
	
	TANumeric newInstance() {
		
		return value.newInstance();
	}

	
	String type() {
		return value.type();
	}

	TANumeric value;
	String opvalue;
}
