package Assignments_DataTypes_Scanner;
import java.util.Scanner;
public class AssignmentOfDatatypeAndScannerClass 
{
public static void main(String[] args)
{
	System.out.println("======================Step 1====================");
	System.out.println("Q1.Add the correct data type for the following variables:");
	int myNum=9;
	float myFloatNum=8.99f;
	char myLetter='A';
	boolean myBool=false;
	String myText="Hello World";
	System.out.println(" Integer value="+myNum);
	System.out.println(" Float Value="+myFloatNum);
	System.out.print(" Character value="+myLetter);
	System.out.println(" Boolean value="+myBool);
	System.out.println(" String value="+myText);
	System.out.println("step2.====Q2.Read two integer numbers and display the Sum");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Two Integer Value");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Sum="+(a+b));
System.out.println("Step 3.....Read two floating point numbers and display the subtraction");
System.out.println("Enter Two Float Value");

float c=sc.nextFloat();
float d=sc.nextFloat();
System.out.println("Step 4.....Sum of Two Floating Numbers :"+(c+d));
System.out.println("Enter Integer Value");

int num1=sc.nextInt();
int num2=sc.nextInt();
System.out.println("Step 5......product of Two Integer value :"+(num1*num2));
System.out.println("Enter Integer Value");

int num3=sc.nextInt();
int num4=sc.nextInt();
System.out.println("Step 6...... Read two integer numbers and display the Sum Division:"+(num3%num4));

	}
	
}
