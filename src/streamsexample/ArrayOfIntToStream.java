package streamsexample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArrayOfIntToStream {
	
	//find second smallest num
	public static void fetchIntStream(int[] arr) {

int sortedNum =Arrays.stream(arr).distinct().sorted().skip(1).findFirst()
	.orElseThrow(()-> new IllegalArgumentException(" Arrays does not have second smallest num"));
	System.out.println("Second Smallest NUmber :"+sortedNum);
	
	
	}
	public static void main(String[] args) {
		int[] number = {3,6,4,5,8,6};
		fetchIntStream(number);
		
	}

}
