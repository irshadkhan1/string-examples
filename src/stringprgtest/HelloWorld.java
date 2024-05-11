package stringprgtest;

public class HelloWorld {

	public static void main(String[] args) {
		// print hello world without using semicolon
	// First Way	
		if(System.out.printf("Hello World" +"\n")==null) {
			
		}
		
		//Second Way
		if(System.out.append("Hello World" +"\n")==null) {
			
		}
		
		//Third Way
      for(int i= 0; i<1; System.out.print("Hello World") ) {
    	  i++;
      }
	}

}
