import java.util.Scanner;
class Userinputs
{
public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first value");
	int value1=sc.nextInt();
	System.out.println("enter second number");
	int value2=sc.nextInt();
	Calculation.Add(value1,value2);
	Calculation.sub(value1,value2);
	Calculation.multi(value1,value2);
	Calculation.div(value1,value2);
	
	
}
}