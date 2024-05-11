package oopsamples;

class B   {
	
	void show () {
		System.out.println("this is B");
	}

                            
}
public class InheritenceTest01 extends B{

	void show () {
		System.out.println("this is A");
		super.show();
	}
	
	public static void main(String args[]) {
	//	InheritenceTest01 i = new InheritenceTest01();
	//	i.show();
		
	//	B b = new B();
	//	b.show();
		 
		
	}

}

