import java.sql.*;
public class mysql
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
st.execute("create table laptops(sno int,name varchar(20))");
System.out.println("table is created succesfully");
st=con.createStatement();
st.execute("alter table laptops add id int");
System.out.println("created succesfully");
st.execute("alter table laptops add brand varchar(20)");
System.out.println("row created succesfully");
st.execute("alter table laptops add cost int");
st.execute("insert into laptops values(1,'mahendra',1011123,'DELL',45000)");
st.execute("select sno,name,id,brand from laptops");
st.execute("insert into laptops values(2,'seenu',1011124,'HP',55000)");
st.execute("insert into laptops values(3,'sai',1011125,'lenovo',50000)");
st.execute("alter table laptops drop id");
//st.execute("delete from laptops where sno=2");
//st.execute("drop table laptops");
st.close();
con.close();
}
}