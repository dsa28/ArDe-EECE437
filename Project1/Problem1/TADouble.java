
public class TADouble extends TAObject implements TADoubleValue {

	public double value() {
		
		return value;
	}
	
	
	void list()
	{System.out.print(name);}
	
	
	void set(double d)
	{value = d;}
	
	

	String type() {
		
		return "double";
	}

	void evaluate()
	{}
	
	
	TADouble(String s,double a)
	{
		name = s;
		value = a;
	}
	
	TADouble(String s)
	{
		value = 0.0;
		name = s;
	}
	
	
	
	double value;



	
	
}
