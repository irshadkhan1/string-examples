package arraysexample;

import java.util.Arrays;
import java.util.OptionalDouble;

public class FindAverage {

	public static void main(String[] args) {
		// 
		int num[] = {1,2,3,5,6,7,8,23,25};
		double total = 0;
		for (int e :num) {
			total = total +e;
		}
		System.out.println(total);
		System.out.println("avg:" + (total/num.length));
		System.out.println();

		//Java 8 Stream
		OptionalDouble avg = Arrays.stream(num).average();
		System.out.println(avg.getAsDouble());
	}

}
