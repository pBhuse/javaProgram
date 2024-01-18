import java.util.*;
class DataTypeDemo
{
public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
 //Scanner scan= new Scanner(System.in);
int myNum=9;
System.out.println("Integer value="+myNum);
float myFloatNum=8.99f;
System.out.println("Float Value="+myFloatNum);
 char myLetter='A';
System.out.println("Character value="+myLetter);
boolean myBool=false;
System.out.println(" Boolean value= "+myBool);
String  myText="Hello World";
System.out.println("String value="+myText);
System.out.println(".........Addition of Two Integer value.........");
System.out.println("Enter the Two Integer value");
int value1=sc.nextInt();
int value2=sc.nextInt();
System.out.println("Addition="+(value1+value2));
System.out.println(".........subtraction of Two floating point numbers .........");
float value3=sc.nextFloat();
float value4=sc.nextFloat();
System.out.println("subtraction="+(value3-value4));
System.out.println(".........product of Two Integer numbers .........");
int value5=sc.nextInt();
int value6=sc.nextInt();
System.out.println("product of Two Integer value="+(value5*value6));
System.out.println(".........sum division of Two Integer numbers .........");
int value7=sc.nextInt();
int value8=sc.nextInt();
System.out.println("Sum Division="+(value7%value8));


}
}