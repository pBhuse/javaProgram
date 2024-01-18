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
	//Addition class object
	//Addition ob=new Addition();
	Addition.Add(value1,value2);
	//Substraction class object
	//Substraction ob1=new Substraction();
	Substraction.Sub(value1,value2);
	//Multiplication class object
	//Multiplication ob2=new Multiplication();
	Multiplication.mul(value1,value2);
	//Division ob3=new Division();
	Division.div(value1,value2);
}


}