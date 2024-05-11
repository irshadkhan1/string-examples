package stringprgtest;

class Test{
	
	//if  u write a variable is final , the final varrable load compile first , static block output not get
	// the output we will get is 100 only
	// if we remove final the out we get static block first and after 100 as well  
	//public static final int x = 100;
	public static  int x = 100;
	static {
		System.out.println("this is static block");
	}
	
}

public class StaticBlockTest {

	public static void main(String[] args) {
		
System.out.println(Test.x);
	}

}
