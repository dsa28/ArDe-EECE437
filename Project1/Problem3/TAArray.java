import java.util.ArrayList;

class TAArray extends TAObject implements TAValue
{

	String type() {
		return "array";
	}

	
	public void list() {
		//print all elements
	}

	public void evaluate() {
		
	}
	
	TAArray(String a, int type, int size)
	{
		name = a;
		this.size = size;
		//arr = new TAArrayInt(size); 
		
	}
	
	<T extends TAIntValue>TAArray (String a, int type, T size)
	{
		this(a,type,size.value());
	}
	
	TAArray(String a, double type, int size)
	{
		name = a;
		this.size = size;
		//arr = new TAArrayInt(size); 
		
	}
	
	<T extends TAIntValue>TAArray (String a,double type, T size)
	{
		this(a,type,size.value());
	}
	
	TAArray(String a, boolean type, int size)
	{
		name = a;
		this.size = size;
		//arr = new TAArrayInt(size); 
		
	}
	
	<T extends TAIntValue>TAArray (String a, boolean type, T size)
	{
		this(a,type,size.value());
	}
	
	
	
	
	int size;
	TAArray arr;
	
}