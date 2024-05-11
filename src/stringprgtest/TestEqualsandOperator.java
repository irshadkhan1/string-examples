package stringprgtest;

public class TestEqualsandOperator {

	public static void main(String[] args) {
		String s1 = new String("Khan");
		String s2 = new String("Khan");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		StringBuffer s3 = new StringBuffer("Irshad");
		StringBuffer s4 =new StringBuffer("Irshad");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}

}
