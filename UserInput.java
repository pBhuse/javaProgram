import java.util.*;
class UserInput
{  
public static void main(String args[])
{
	int value1,value2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First value");
	value1=sc.nextInt();
	System.out.println("Enter Second Value");
	value2=sc.nextInt();
	Add(value1,value2);
	sub(value1,value2);
	multi(value1,value2);
	div(value1,value2);
	
}
public static void Add(int value1,int value2)
{
	int value3=value1+value2;
	System.out.println("Addition="+value3);
}
public static void sub(int value1,int value2)
{
	int result=value1-value2;
	System.out.println("Substraction="+result);
}
public static void multi(int value1,int value2)
{
	int result1=value1*value2;
	System.out.println("multiplication="+result1);
}
public static void  div(int value1,int value2)
{
	int result2=value1/value2;
	System.out.println("Division="+result2);
}
}