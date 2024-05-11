package stringprgtest;

import java.util.stream.IntStream;

public class NumberPrint02 {

public	static void printNum(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}

	public static void main(String[] args) {
		// Number print without loop
		//using java stream forEach() method
		printNum(1);
		
	IntStream.range(1, 101).forEach(e -> System.out.println(e));

	}

}
