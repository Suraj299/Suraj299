package Unit_01;

public class P6_Task02_StringInJava {
	
	public static void main(String[] args) {
		
		StringInJava obj = new StringInJava();
		obj.StringDefiniton();
		obj.charAndString();
	}

}

class StringInJava {
	
	void StringDefiniton() {
		
		String s = "Hello There!";
		String s1 = new String("jhgiof");
		
		System.out.println(s);
		
		// Get length of a String
		System.out.println(s.length());
		
		// loop through a string!
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		String first = "Suraj";
		String second = "Bora";
		
		//Add two strings
		String third = first + second;
		System.out.println(third);
		
		//compare two strings;
		boolean result1 = first.equals(second);
		System.out.println(result1);
		
		/* Java Strings are Immutable
		 *  In Java, the JVM maintains a string pool to store all of its strings inside the memory.
		 *  The string pool helps in reusing the strings.
		 	- If the string already exists, the new string is jot created.
		 	- Instead the new reference, example points to the already existed string (Java)
		 	- If the string doesn't exist, the new string (Java is created)
		 	 */
		
		String fourth = "Suraj ";
		String fifth = new String("Bora!");
		
	}
	/*
	 * Character Arrays are mutable but are not
	 * 
	 */
	void charAndString() {
		
		char[] ch = {'H','e','l','l','o', ' ', 'T','h','e','r','e', '!' };
		char[] ch2 = { '!', '!'};
		
		System.out.println(ch);
		
		for (int i = 0; i < ch.length; i++); {
			System.out.println(ch[i]);
			
		}
		
		String s1 = new String(ch);
		System.out.println(s1);
		
		// Character Arrays are mutable but Strings are not!
		ch[0] = 'h';
		// s1.charAt(0) = 'h';
		
		/*
		 * Join Two Java Strings - +' can be used to appended strings together to form a
		 * new string - but not possible in char array
	 */
		
		s1 = s1 + 'a'; // s1 is new object with new memory
		// ch = ch + ch2;
		
		// String to char array
		String s2 = "GEEKS";
		char[] ch4 = s2.toCharArray();
		
		
		
		// char array to String
		char[] a2 = {'S', 'U','R' };
		String s3 = new String(a2);
		
	}
	
}
