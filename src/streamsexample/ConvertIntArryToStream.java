package streamsexample;

import java.util.Arrays;
import java.util.List;

public class ConvertIntArryToStream {

	public static void main(String[] args) {
		int[] arr = {10,5,4,20,5,15};
	  Arrays.stream(arr).filter(a ->a%2==0).forEach(System.out::println);
	  System.out.println("-----------");
	  
	  Arrays.stream(arr).filter(a ->a%2!=0).forEach(System.out::println);
	  Arrays.stream(arr);
	  
	}

}
