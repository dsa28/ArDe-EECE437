
public class TANumericFunction extends TANumeric {

	/*
	 * TANumericFuncion, used to avoid repeating code
	 * and make modifying classes easier and faster
	 */
	
	TANumeric newInstance() {
		return value.newInstance();
	}

	
	String type() {
		return value.type();
	}

	TANumeric value;
}
