package stringprgtest;

public class DividedByZero {

	public static void main(String[] args) {
		
	//	System.out.println(5/0);    //Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println(5.0/0);  //Infinity
		System.out.println(5.0f/0); //Infinity
		System.out.println(0.0/0);  //NaN (Not a Number)
		System.out.println(0.0/0.0); //NaN
		System.out.println(12.3/0.0); //Infinity
       
	}

}
