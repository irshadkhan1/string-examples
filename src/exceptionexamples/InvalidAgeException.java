package exceptionexamples;

import java.util.Scanner;

public class InvalidAgeException extends Exception{
	
	
		public InvalidAgeException(String msg) {
			System.out.println(msg);
		}	
	
	
	
		public static void main(String[] args) {
			System.out.println("Enter age");
				Scanner sc = new Scanner(System.in);
				int age =sc.nextInt();
					try {
					if(age>18) {
						System.out.println("valid to vote");
					}
					else {
						
						throw new InvalidAgeException("not valid to vote");
					}
					}catch(InvalidAgeException e) {
						System.out.println("excep  occured :"+ e);
				}
				}
		}
	



