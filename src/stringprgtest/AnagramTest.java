package stringprgtest;
import java.util.Arrays;

import java.util.Scanner;
public class AnagramTest {

	    
	 public static boolean isAnagram(char[] first, char[] second) {
	        //checking length of first string is not equal to second string then return false
	        if(first.length!=second.length) {
	            return false;
	        }
	        
 //check character in first string is not equal to character in second string then  return false
	        for(int i=0;i<first.length;i++) {
	            if(first[i]!=second[i]) {
	                return false;
	            }
	        }
	        
	        // return true when all characters in both strings are same 
	        
	        return true;
	    }
	    
	    
	    public static void main(String args[])  {
	        
	        Scanner sc=new Scanner(System.in);
	        
	        System.out.println("Enter first String:");
	        
	        //input first string
	        String first_string=sc.nextLine().toLowerCase();;
	        
	        System.out.println("Enter second String:");
	        
	        //input second string
	        String second_string=sc.nextLine().toLowerCase();
	        
	    
	        //convert first string into char array
	        char[] first_array=first_string.toCharArray();
	        
	        //convert second string into char array
	        char[] second_array=second_string.toCharArray();
	        
	        //sort first array
	        Arrays.sort(first_array);
	        
	        //sort second array
	        Arrays.sort(second_array);
	        
	        //calling isAnagram  boolean function 
	        if(isAnagram(first_array,second_array)) {
	            System.out.println("Two Strings are Anagrams");
	        }else {
	            System.out.println("Two Strings are not Anagrams");
	        }    
	        
	    }
	}
	
	

