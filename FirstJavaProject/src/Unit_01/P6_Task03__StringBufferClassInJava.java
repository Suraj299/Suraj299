package Unit_01;
/* 3 Ways:
  - StringBuffer()
  - StringBuffer(String str)
  - StringBuffer(int capacity)
 
 - StringBuffer is mutable unlike string
 
 */

public class P6_Task03__StringBufferClassInJava {
	
	public static void main(String[] args) {
		sb.append("Java");
		System.out.println(sb.charAt(0));
		
		//StringBuffer Class append() Method, now original string is changed
		System.out.println(sb);
		
		//StringBuffer insert() Method
		StringBuffer sb2 = new StringBuffer("Hello ");
		sb2.insert(1,"Java"); // now original string is changed
		System.out.println(sb2); // prints HJavaello
		
		//StringBuffer replace() Method
		StringBuffer sb3=new StringBuffer("Hello");	
		sb3.replace(1,3, "Java");
		System.out.println(sb3); // prints HJavalo
		
		
		// StringBuffer delete() Method
		StringBuffer sb4=new StringBuffer("Hello");
		sb4.delete(1, 3);
		System.out.println(sb4); //prints Hlo
		
		
	}

}
