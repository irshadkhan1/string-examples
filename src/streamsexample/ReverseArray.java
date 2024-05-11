package streamsexample;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {

	public static void fetchRevserseArray(int[] arr) {
		IntStream.range(0, arr.length/2).forEach(i->{
			int temp=arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1]= temp;
		});
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {3,6,4,5,8,9};
		fetchRevserseArray(number);
	}

}
