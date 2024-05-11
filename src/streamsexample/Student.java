package streamsexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

	private String name;
	private int rollNum;
	private int marks;
	private int age;
	
	public Student(String name, int rollNum, int marks, int age) {
		
		this.name = name;
		this.rollNum = rollNum;
		this.marks = marks;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getRollNum() {
		return rollNum;
	}

	public int getMarks() {
		return marks;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNum=" + rollNum + ","
				+ " marks=" + marks + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		
		 Student	 s1 = new  Student("Tom", 112, 90, 20);
		 Student	 s2 = new  Student("Lisa", 102, 95, 23);
		 Student	 s3 = new  Student("Mat", 115, 80, 30);
		 Student	 s4 = new  Student("Jam", 105, 100, 25);
		 Student	 s5 = new  Student("Kan", 111, 70, 19);
		
		List<Student> st = new ArrayList<Student>();
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);
		for(Student s:st) {
			//System.out.println(s);
		}
	st.stream().filter(e -> e.getMarks()>90)
	.forEach(e ->System.out.println(e.getName()+" : "+ e.getMarks()));
	
	//name who got highest marks
	int hm =  st.stream().map(e-> e.getMarks()).max(Integer::compare).get();
	System.out.println("Highest marks: "+hm);
	st.stream().filter(e -> e.getMarks()==hm).
	forEach(e->System.out.println(e));
	
	  //find second highest marks
	   Student secondHighMarks = st.stream().sorted((a,b)->Double.compare(b.getMarks(), a.getMarks()))
			   .skip(1)
			   .findFirst()
			   .get();
	           System.out.println(secondHighMarks);
	
	}
	
}
