import java.util.Scanner;

public class FindGreaterNum {
public static void main(String[] args) {
	System.out.println("======== Q3 Take three numbers from user and print the greatest number======");
	int num1,num2,num3;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter three Numbers");
	num1=sc.nextInt();
	num2=sc.nextInt();
	num3=sc.nextInt();
	if(num1>num2&&num1>num3)
	{
		System.out.print(num1+" Is Greater");
	}
	else if(num2>num3)
	{
		System.out.println(num2+" Is Greater");
		
	}
	else
	{
		System.out.println(num3+" Is Greater");
	}
}
}
