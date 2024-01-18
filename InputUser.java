import java.util.Scanner;
class InputUser
{

public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
	int value1,value2;
	System.out.println("Enter first Number");
	value1=sc.nextInt();
	System.out.println("Enter Second Number");
	value2=sc.nextInt();
	Addition ob=new Addition();
	Addition.Add(value1,value2);
	Substraction.Sub(value1,value2);
	Multiplication.mul(value1,value2);
	Division.div(value1,value2);
}


}