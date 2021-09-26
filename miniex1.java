import java.util.*;
public class miniex1
{
	public static void main(String args[])
	{
		a obj=new a();
		obj.demo();
		one oo=new one();
		oo.airtel();	
		three th=new three();
		th.show();
		th.demo();
		four ff=new four();
		ff.end();
}
}
class a
{
	public void demo()
	{
System.out.println("Welcome to Mytel :");
System.out.println("Enter option 1 for mobile recharge");
System.out.println("Enter option 2 for pay bills");
System.out.println("Enter option 3 to convert prepaid to postpaid / postpaid to prepaid");
System.out.println("Enter option 4 to know the balance");
System.out.println("Enter option 5 for profile details");
System.out.println("Enter 0 to exit ");
}
}
class one extends a
{
	public void airtel()
	{
	Scanner a=new Scanner(System.in);
	System.out.println("Enter your option:");
	int option=a.nextInt();
switch(option)
{
	case 4:
System.out.println("Enter your mobile number:");
long mobile=a.nextLong();
System.out.println("please wait...");
System.out.println("Balance:");
System.out.println("SMS:20");
System.out.println("Talk Time:Unlimited");
System.out.println("Data :1.2 GB");
System.out.println("Validity:15 Days");
System.out.println("Enter 9 to back to main menu");
System.out.println("Enter 0 to exit ");
	break;
default:System.out.println("not valid....");
	break;
}
}
}
class three extends a
{
	public void show()
	{
System.out.println("enter your option:");
Scanner s=new Scanner(System.in);
int i=s.nextInt();
switch(i)
{
	case 9:
		System.out.println("please wait");
		break;
	default:
		System.out.println("you entered in correct option");
		three th=new three();
			th.show();
		break;
}
}
}
class four
{
	public void end()
	{
System.out.println("enter your option:");
Scanner x=new Scanner(System.in);
int j=x.nextInt();
switch(j)
{
	case 0:
		System.out.println("Thank you visit again");
		break;
	default:
		System.out.println("not valid...\n closing app");
}
}
}