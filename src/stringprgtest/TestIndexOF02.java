package stringprgtest;

public class TestIndexOF02 {

	public static void main(String[] args) {
		String st ="thatisstringprogram";
		
		int count=0;
		int startfrom =0;
		for(;;) {
			int index = st.indexOf('m', startfrom);
			if(index>0) {
				count = count +1;
				startfrom = index+1;
			}
			else {
				break;
			}
		}
		System.out.println("The 'm' character has come "+ count + " times");  
	}

}
