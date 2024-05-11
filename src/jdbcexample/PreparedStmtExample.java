package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStmtExample {
	
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		  
		Connection con=DriverManager
				.getConnection("jdbc:mysql://localhost:3306/microservices","root","root");  
		  
	//	PreparedStatement stmt=con.prepareStatement("insert into empls values(?,?,?)");  
	//	stmt.setInt(1,4);//1 specifies the first parameter in the query  
	//	stmt.setString(2,"Shyam"); 
	//	stmt.setInt(3,3000); 
		
		  // update the row 
	//	int i=stmt.executeUpdate();  
	//	System.out.println(i+" records inserted"); 
	//	PreparedStatement stmt1=con.prepareStatement("update  empls set name=? , salary=? where id=?"); 
	//	stmt1.setInt(1,5);
	//	stmt1.setString(2,"Sonoo");//1 specifies the first parameter in the query i.e. name  
	//	stmt1.setString(3,"5000");  
	//	int i1=stmt1.executeUpdate();  
	//	System.out.println(i1+" records updated");  
		
		//delete the row from table
	//	PreparedStatement stmt3=con.prepareStatement("delete from emp where id=?");  
	//	stmt3.setInt(1,101);  
		  
	//	int i=stmt3.executeUpdate();  
	//	System.out.println(i+" records deleted");  
		
		//get the data from database
		PreparedStatement stmt2=con.prepareStatement("select * from empls");  
		ResultSet rs=stmt2.executeQuery();  
		while(rs.next()){  
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));  
		}  
		  
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		
		  
		}  

}
