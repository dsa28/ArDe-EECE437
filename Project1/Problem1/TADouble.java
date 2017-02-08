
public class TADouble extends TANumeric {

	TANumeric newInstance()
	{
		return new TADouble();
	}
	

	String type() {
		
		return "double";
	}

	TADouble(double a)
	{
		value = a;
	}
	
	TADouble()
	{
		value = 0.0;
	}
	
	
	double value;
	
}
