import java.sql.*;
public class mysqldbconnect
{
	public static void main(String arr[])throws SQLException,ClassNotFoundException
	{
		Statement st;
		Connection con;

	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("driver loaded and registered");
con=DriverManager.getConnection("jdbc:mysql://localhost/sql1","root","Mahi@12345");
	System.out.println("connection is established");
st=con.createStatement();
st.execute("create table data(sno int,name varchar(20))");
System.out.println("table is created succesfully");
st=con.createStatement();

st.close();
con.close();
}
}
