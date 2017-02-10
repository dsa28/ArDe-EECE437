
public class TAMinusDouble<T extends TADoubleValue> extends TAMinus implements TADoubleValue {
	
	
		public double value()
		{
			return value;
		}
		
		TAMinusDouble(T a)
		{
			op1 = a;
			opvalue = "-";
			single = true;
		}
		
		TAMinusDouble (T a, String s)
		{
			op1 = a;
			opvalue = "-";
			single = true;
			name = s;
			
		}
		
		 TAMinusDouble(T a, T b)
		{
			op1 = a;
			op2 = b;
			opvalue = "-";
			single = false;
			
		}
		 
		 TAMinusDouble(T a, T b, String s)
		 {
			 op1 = a;
			 op2 = b;
			 name = s;
			 opvalue = "-";
			 single = false;
		 }
		
		 
		 void evaluate()
		 {
			 if (!single)
			 value = op1.value()-op2.value();
			 else
			 value = -op1.value();
		 }
		 
		 
		T op1, op2;
		boolean single;
		double value;
		
		


}
