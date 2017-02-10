
public class TADouble extends TANumeric implements TADoubleValue {

	public double value() {
		
		return value;
	}
	
	
	void list()
	{
		if (name!=null)
			System.out.print(name);
		else
			System.out.print(value);
			
	}
	
	void set(double d)
	{value = d;}
	
	
	TANumeric newInstance()
	{
		return new TADouble();
	}
	

	String type() {
		
		return "double";
	}

	void evaluate()
	{}
	
	
	TADouble(double a)
	{
		value = a;
	}
	
	TADouble(String s)
	{
		value = 0.0;
		name = s;
	}
	
	 TADouble()
	{
		value = 0.0;
	}
	
	
	
	double value;



	
	
}
