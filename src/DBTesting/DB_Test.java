package DBTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/";
		String driver="com.mysql.jdbc.Driver";
		String dbName="employeeportal";
		String username="root";
		String password="root";
		//connect db
		//fire queries
		//disconnect
		
	
			
	try {
		//Class.forName(driver).newInstance(); //create object of driver
		con=DriverManager.getConnection(url+dbName,username,password);
		System.out.println(con.isClosed());
		
		//****Statment interface**** and Queries***
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from employeeinfo");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"---" +rs.getString(2) +"--"+ rs.getString(3)+"--"+rs.getString(4));
		}
	//st.executeUpdate("INSERT into employeeinfo values ('Ramesh', 20,'csc',25)"); //insert udpate delete
	System.out.println("******************************");
	
	//*********Prepared statement*************
	PreparedStatement prst= con.prepareStatement("SELECT *from employeeinfo where dept=? and age=?");
	prst.setString(1, "MEC");
	prst.setInt(2, 28);
	rs=prst.executeQuery();
	
	
	while(rs.next())
	{
		System.out.println(rs.getString(1)+"---" +rs.getString(2) +"--" +rs.getString("dept")+"---" +rs.getString("age"));
	}
	
	}
	
	//**** callable statment interface for ***** stored procedures****
	catch (SQLException e) {
	
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	finally
	{
		if ((con!=null) && con.isClosed())
		{
			con.close();
		}
	}
	
	}

}
