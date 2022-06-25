package Academy;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class database {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port="3306";
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/Qadbt", "Root1", "Root");
		
		   //    "jdbc:mysql://"+host+":"+port+"/databasename";
		
		 //    "jdbc:mysql://"+localhost+":"+3306+"/Qadbt";
		Statement s=conn.createStatement();
		ResultSet rs=s.executeQuery("select * from EmployeeInfo where name='ram'");
		

		while(rs.next())
		{
			System.out.println(rs.getString("location"));
			System.out.println(rs.getInt("age"));
		}
		
		

	}

}
