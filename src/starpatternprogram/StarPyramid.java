package starpatternprogram;

public class StarPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=4; i++) {
			//for space print to take for loop
			for (int j=3; j>=i; j--) {
				System.out.print(" ");
				
			}
			for(int k= 1; k<=i ; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}


	}

}
