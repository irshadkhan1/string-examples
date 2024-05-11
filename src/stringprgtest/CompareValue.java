package stringprgtest;

public class CompareValue {

	public static void main(String[] args) {
		// Compare Two Integer Value using '==' operator
		//Integer Caching 
		//-128 to 127(in between the range the value are equal but the out of rang value are not equal )
		//
		Integer a = 128;
		Integer b= 127;
		if(a==b) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Both are not equal");
		}

	}

}
