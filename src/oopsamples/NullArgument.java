package oopsamples;

public class NullArgument {
	//pass the null argument and check whose method call 
	// method overloading
	public static void test(Object o) {
		System.out.println(" this is object");
	}
	public static void test(String s) {
		System.out.println(" this is string");
	}
	public static void main(String[] args) {
		test(null);

	}

}
