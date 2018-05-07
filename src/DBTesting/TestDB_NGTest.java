package DBTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDB_NGTest {
	Connection con=null;
	PreparedStatement prst=null;
	ResultSet rs=null;
	String url="jdbc:mysql://localhost:3306/";
	String driver="com.mysql.jdbc.Driver";
	String dbName="employeeportal";
	String username="root";
	String password="root";

	@BeforeTest
	public void Connect()
	{
		try{
	//Class.forName(driver).newInstance(); //create object of driver from java 1.6 this statement not required
	con=DriverManager.getConnection(url+dbName,username,password);
	System.out.println(con.isClosed());	
		}
		catch (Exception e)
		{
			System.out.println("Could not establish connection");
			e.printStackTrace();
			//Assert.fail("could not establish connection");
			throw new SkipException("could not establish connection");
		}
	}
			
	@AfterTest
	public void disconnect()
	{
		
		try{
			if (rs!=null)
			
				rs.close();
			if (prst!=null)
				prst.close();
			if ((con!=null) && (!con.isClosed()))
				con.close();
			
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		}
	
  @Test
  public void testDB() {

    try
	{
	PreparedStatement prst= con.prepareStatement("SELECT *from employeeinfo where dept=? and age=?");
	prst.setString(1, "MEC");
	prst.setInt(2, 28);
	rs=prst.executeQuery();
	
	
	while(rs.next())
	{
		System.out.println(rs.getString(1)+"---" +rs.getString(2) +"--" +rs.getString("dept")+"---" +rs.getString("age"));
	}
	}
	catch(Exception e)
	{
		System.out.println("Error in query");
		e.printStackTrace();
		Assert.fail(e.getMessage());
	}

  }
  
}
