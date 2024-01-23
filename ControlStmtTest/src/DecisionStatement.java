import java.util.Scanner;

public class DecisionStatement {
public static void main(String[] args) {
	System.out.println("hello welcome to Java Control Statement");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Age :");
	int age=sc.nextInt();
	if(age>=18 && age<=30)
	{
		System.out.println("You are Eligible for votting");
		System.out.println("Your are Young");
	}
	else if(age>30)
	{
		System.out.println("You are eligible for votting ");
		System.out.println("Yor are Adult");

	}
	else
	{
		System.out.println("Your are not eligible for votting");
	}
}
}
