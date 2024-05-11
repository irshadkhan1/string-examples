package streamsexample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InTwoArrayFindCommonElement {

	public static void fetchCommonelement(int[] arr1,int[] arr2) {
		
	List<Integer>	matchElement = Arrays.stream(arr1)
			.filter(number->Arrays.stream(arr2).anyMatch(x->x==number)).boxed()
		    .collect(Collectors.toList());
	System.out.println(matchElement);
	}
	public static void main(String[] args) {
		int[] array1= {1,2,3,4,5,6};
      int[]  array2= {4,6,2,8,9};
      fetchCommonelement(array1,array2);
	}

}
