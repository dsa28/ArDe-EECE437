class TAArrayInt extends TAArray
{
	
	int size()
	{
		return size;
	}
	
	public void list()
	{
		System.out.print("[");
		for (int i =0; i < size-1; i++)
			System.out.print(values[i] + " ");
		System.out.print(values[size-1] +"]");
	}
	
	TAArrayInt(int size)
	{
		values = new int[size];
		this.size = size;
	}
	
	
	int[] values;
	int size;
}