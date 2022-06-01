package Unit_03;
import java.io.IOException;

public class Sample {
	
	public static void main(String[] args) {
		// If there is no exception still finally will be run and still there is exception finally will run.
		// If there is a exception in try block but there is no approciate catch block still finally will run.
		
	try {
		int a= 100/2;
		System.out.println(a);
		
	}catch (ArithmeticException e) {
		System.out.println(e.getMessage());
	}catch(Exception e) {
		System.out.println(e);
	}
	
	finally {
		System.out.println("Done!!!");
	}
}

}
