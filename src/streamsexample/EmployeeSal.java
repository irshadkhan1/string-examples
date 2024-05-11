package streamsexample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeSal {
	
	private String name;
	private Double salary;
	private Date joiningDate;
	private String gender;

	
	
	public EmployeeSal(String name, Double salary, Date joiningDate, String gender) {
		
		this.name = name;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "EmployeeSal [name=" + name + ", salary=" + salary + ", joiningDate=" 
	+ joiningDate + ", gender="
				+ gender + "]";
	}


	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new  SimpleDateFormat ("dd-MM-yyyy");
       Date joiningDateRam = dateFormat.parse("01-01-2000");
       Date joiningDateSita = dateFormat.parse("01-02-1997");
       Date joiningDateVishnu = dateFormat.parse("10-05-1990");
       Date joiningDateMahesh = dateFormat.parse("16-03-2003");
       
       List<EmployeeSal> emp = Arrays.asList(new EmployeeSal("Ram",50000.0,joiningDateRam,"M"),
    		   new EmployeeSal("Sita",40000.0,joiningDateSita,"F"),
    		   new EmployeeSal("Vishnu",20000.0,joiningDateVishnu,"M"),
    		   new EmployeeSal("Mahesh",90000.0,joiningDateMahesh,"M")
    		   
    		   );
       
   EmployeeSal maxSal = emp.stream()
		   .max((x,y)->Double.compare(x.getSalary(), y.getSalary()))
		   .get();
       
   System.out.println(maxSal);
   
   //================================================
   //find second highest salary
   EmployeeSal secondHighSal = emp.stream().sorted((a,b)->Double.compare(b.getSalary(), a.getSalary()))
		   .skip(1)
		   .findFirst()
		   .get();
           System.out.println(secondHighSal);
           //=======================================================
           //second approach by using Optional
       Optional<EmployeeSal> secondHighestSal = emp.stream()
    		   .sorted((a,b)->Double.compare(b.getSalary(), a.getSalary()))
        		   .skip(1)
        		   .findFirst();
       secondHighestSal.ifPresent(System.out::println);
     //========================================================================   		   
          //by joining date find older employee
       Optional<EmployeeSal> olderEmp = emp.stream()
    		   .min((a,b)->a.getJoiningDate().compareTo(b.getJoiningDate()));
       olderEmp.ifPresent(System.out::println);
       
       //Count the Employee based on the gender
   Map<String,Long> empCount=  emp.stream()
		   .collect(Collectors.groupingBy(EmployeeSal::getGender,Collectors.counting()));
   System.out.println(empCount);
       }

}
