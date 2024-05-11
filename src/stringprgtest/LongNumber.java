package stringprgtest;

public class LongNumber {

	public static void main(String[] args) {
		long longNumWithoutL = 1000*60*60*24*365;
		System.out.println(longNumWithoutL);
		// without using L the output is 1471228928 this output is incorrect
		// because max limit 32 bit integer is 2147483647
		//if u used long then You will get correct output is 31536000000
		long longNumWithL = 1000*60*60*24*365L;
		System.out.println(longNumWithL);
	}

}
