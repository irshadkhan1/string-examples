package stringprgtest;

public class CountOuccrrenceBY {
	
	public static long getCharCount(String str,char c) {
		return str.chars().filter(e ->(char)e ==c).count();
	}

	public static void main(String[] args) {
		// Count Ouccerrence of character by java 8
		
		String  str = "Java Code Running";
	
		System.out.println(getCharCount(str,'n'));

	}

}
