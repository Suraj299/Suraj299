package Unit_01;

public class P4_Task02_WrapperClassesinJava {
	
}
	public static void main(String[] args) {
		
		// Converting int into Integer
		int a = 30;
		
		String s =  "" + a + "";
		
		Integer i = Integer.valueOf(a); // converting int into Integer explicitly
		Integer j = a; // autoboxing, now compiler will write Integer .valueOf(a) internally
		
		System.out.println(a + " " + i + " " +j);
		
		// a.toString () can not be done to a is int not object
		
		//Autoboxing: Converting primitives into into objects
		byte b=10;
		Byte byteobj=b;
		
		System.out.println(byteobj);
		
		//Unboxing: Coverting Objects to Primitives
		byte bytevalue=byteobj;
		System.out.println(bytevalue);
		
	}

}
