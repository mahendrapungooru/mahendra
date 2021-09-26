import java.util.*;
class one
{
	public void airtel()
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
class two extends one
{
	public void mytel()
	{
	Scanner s0=new Scanner(System.in);
	System.out.println("Enter your option:");
	int option=s0.nextInt();
switch(option)
	{
	case 1:
		System.out.println("please wait");
	Scanner s1=new Scanner(System.in);
System.out.println("Enter your mobile number:");
	long cc=s1.nextLong();
	
System.out.println("Packages:");
		System.out.println("package 1");
		System.out.println("		Amount 200");
		System.out.println("		Validity 30 days");
		System.out.println("		Data 3GB/day");
		System.out.println("package 2");
		System.out.println("		Amount 300");
		System.out.println("		Validity 30 days");
		System.out.println("		Data 6GB/day");
		System.out.println("Enter the appropriate package number to proceed further");
		int y=s1.nextInt();
		System.out.println("Enter debit card/credit card number:");
		String card=s1.next();
		System.out.println("Enter Expiry date:");
		String date=s1.next();
		System.out.println("Enter CVV number:");
		String cvv=s1.next();
		System.out.println("		Congratulations..your recharge is successful..");
		System.out.println("Enter option 9 to go back to main options");
		System.out.println("Enter 0 to exit");
		break;
	default:
		System.out.println("enter proper val");
		System.out.println("Enter option 9 to go back to main options");
		System.out.println("Enter 0 to exit");
		break;
	}
System.out.println("enter your option:");
int i1=s0.nextInt();
}
}
class four extends one
{
	public void demo2()
	{
	Scanner s3=new Scanner(System.in);
	System.out.println("enter your option:");
	int ss=s3.nextInt();

		Scanner s4=new Scanner(System.in);
		System.out.println("Enter Postpaid number:");
		String no=s4.next();
System.out.println("Bill due amount is 600 INR");
System.out.println("Enter payment details:");
System.out.println("Enter debit card/credit card number:");
		String card=s4.next();
		System.out.println("Enter Expiry date:");
		String date=s4.next();
		System.out.println("Enter CVV number:");
		String cvv=s4.next();
		System.out.println("		Congratulations..your emount is successfully paid..");
		System.out.println("Enter option 9 to go back to main options");
		System.out.println("Enter 0 to exit");
		int a1=s4.nextInt();
}
}
class five extends one
{
public void demo3()
{
Scanner s3=new Scanner(System.in);
System.out.println("enter your option:");
int i2=s3.nextInt();
System.out.println("Enter option 6 to convert prepaid to post");
System.out.println("Enter option 7 to convert post to prepaid");
int i3=s3.nextInt();
System.out.println("Congrats!!your request is received. \n You new SIM will be delivered within 2 days to your address");
System.out.println("Enter option 9 to go back to main options");
System.out.println("Enter 0 to exit");
int a2=s3.nextInt();
}
}
class six extends one
{
	public void demo4()
	{
Scanner s5=new Scanner(System.in);
System.out.println("enter your option:");
int i4=s5.nextInt();
switch(i4)
{
	case 4:
System.out.println("please wait...");
System.out.println("Balance:");
System.out.println("SMS:20");
System.out.println("Talk Time:Unlimited");
System.out.println("Data :759 MB");
System.out.println("Validity:15 Days");
System.out.println("Enter 9 to back to main menu");
System.out.println("enter 0 to exit");
	break;
default:System.out.println("not valid....");
	break;
}
int a3=s5.nextInt();
}
}
class seven extends one
{
	public void demo5()
	{
Scanner s6=new Scanner(System.in);
System.out.println("enter your option:");
int i5=s6.nextInt();
System.out.println("enter your mobile no:");
long i6=s6.nextLong();
System.out.println("name:xxxxxxxx");
System.out.println("adress:xxxxxx");
System.out.println("Enter 9 to back to main menu");
System.out.println("enter 0 to exit");
int a4=s6.nextInt();
}
}
class ten
{
	public void demo6()
	{
Scanner s7=new Scanner(System.in);
System.out.println("enter your option:");
int i6=s7.nextInt();
System.out.println("thank you visit agin");
}
}
public class miniproject
{
	public static void main(String[] args)
	{
	
			one oo=new one();
			oo.airtel();
			two tt=new two();
			tt.mytel();
			tt.airtel();
			four ff=new four();
			ff.demo2();
			ff.airtel();
			five fi=new five();
			fi.demo3();
			fi.airtel();
			six ss=new six();
			ss.demo4();
			ss.airtel();
			seven se=new seven();
			se.demo5();
			se.airtel();
			ten te=new ten();
			te.demo6();		
}
}			