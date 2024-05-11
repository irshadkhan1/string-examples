package simpleprogram;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
	 int sum = 0 ,a,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		temp =num;
		while(num>0) {
		a =	num%10;
		sum = sum +(a*a*a);
		num = num/10;
		}
    if(temp == sum) {
    	System.out.println("this is armstrong number");
    }else {
    	System.out.println("this is not a armstrong number");
    }
	}

}
