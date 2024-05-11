package stringprgtest;

public class CheckAnagram {

	public static void main(String[] args) {

		System.out.println(isAnagram("aab","baa"));

	}

	private static boolean isAnagram(String string1, String string2) {
		
		int count[] = new int[256];
		for(int i=0; i<string1.length(); i++) {
			count[string1.charAt(i)]++;
			count[string2.charAt(i)]--;
		}
		for (int i=0;i<count.length;i++) {
			if(count[i]!=0 || string1.length()!=string2.length()) {
			
				
				return false;
			
			}
		}
		return true;
	}

}
