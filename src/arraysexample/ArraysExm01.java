package arraysexample;

public class ArraysExm01 {

	public static void main(String[] args) {
	
		int inputArray[] = {10,30, 25,350,100,550,5,20};
		int firstLargestNum=0;
		int secondLargestNum=0;
		for(int i=0; i<inputArray.length;i++) {
			if(firstLargestNum<inputArray[i]) {
				secondLargestNum = firstLargestNum;
				firstLargestNum=inputArray[i];
			}
			else if(secondLargestNum<inputArray[i]){
				secondLargestNum=inputArray[i];
			}
		}
		System.out.println("First largest Num :" +firstLargestNum + "  Second Largest Num :"+secondLargestNum);

	}

}
