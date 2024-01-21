import java.util.Scanner;
class Operators
{
	public static void main(String args[])
	{
		Operators ob=new Operators();
		ob.arithmeticOperator();
		ob.assignmentOperator();
		ob.autoIncrementOperator();
		ob.autoDecrementOperator();
		ob.logicalOperator();
		ob.comparisonOperators();
		ob.bitwiseOperator();
		ob.ternaryOperator();
	}
	void arithmeticOperator()
	{
		System.out.println("==================Arithmetic Operators===========");
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("First Number is-"+a);
        System.out.println("Enter Second  Number");
		b=sc.nextInt();
		System.out.println("Second Number is-"+b);

		int res=a+b;
		System.out.println("Addition="+res);
		
		int res1=a-b;
		System.out.println("substraction="+res1); 
		
		int res2=a*b;
		System.out.println("Multiplication="+res2);
		
		int res3=a/b;
		
		System.out.println("Division="+res3);
		int res4=a%b;
		
		System.out.println("modulus="+res4);
	}
	void assignmentOperator()
	{
	 System.out.println("==================Assignment Operators===========");
		int num1=10;
		System.out.println("value1= "+num1);
		int num2=30;
		System.out.println("value2= "+num2);

		num2+=num1;//i.e num2=num2+num1;
		
		System.out.println("value after += :"+num2);
		System.out.println();
		 num2-=num1;//i.e num2=num2-num1  we use here updated value
	    System.out.println("value after -= :"+num2);//output is 40-10=30;
		System.out.println();
		 num2*=num1;
	    System.out.println("value after *= :"+num2);//output is 30*10=300;
		 num2/=num1;
		System.out.println();
	    System.out.println("value after /= :"+num2);//output is 300/10=30;

	}
	void autoIncrementOperator()
	{
		System.out.println("==============Pre-Increment Operator===================");
		int n=10;
		System.out.println(" Before increment operator value is-"+n+",After increment operator value is:"+(++n));
	    System.out.println();
	    System.out.println("==============Post-Increment Operator===================");
		int n1=20;
		System.out.println(" Before increment operator value is-"+n1+",After increment operator value is:"+(n1++));
         
	}
		void autoDecrementOperator()
		{
		System.out.println("==============Pre-Decrement Operator===================");
        int n=10;
		System.out.println(" Before Decrement operator value is-"+n+",After Decrement operator value is:"+(--n));
	    System.out.println();
	    System.out.println("==============Post-Decrement Operator===================");
		int n1=20;
		System.out.println(" Before Decrement operator value is-"+n1+",After Decrement operator value is:"+(n1--));
         
		}

	void logicalOperator()
	{
		System.out.println("================ Logical operators ==============");
		System.out.println();
		System.out.println(" Implement Logical && operator(5 > 3) && (2 > 3)");
		boolean result1 = (5 > 3) && (2 > 3);
		System.out.println(" result1="+result1);
		System.out.println(" Implement Logical || operator(5 > 3) || (2 > 3)");
        boolean result2 =(5>3)||(2>3);
		System.out.println(" result2="+result2);
		System.out.println(" Logical not Operator (!result1) ");
		boolean result3=!result1;
		System.out.println(" result3="+result3);

	}
	void comparisonOperators()
	{
		System.out.println("============= comparison Operators ================");
		int a=10;
		int b=5;
		System.out.println(" num1="+a);
		System.out.println(" num2="+b);
		boolean re=(a==b);
		System.out.println(" Comparison Operator(==) "+re);
		boolean re1=(a>=b);
		System.out.println(" Comparison Operator(>=) "+re1);
		boolean re2=(a<=b);
		System.out.println(" Comparison Operator(>=) "+re2);
		boolean re3=(a>b);
	    System.out.println(" Comparison Operator(>) "+re3);
		boolean re4=(a<b);
        System.out.println(" Comparison Operator(<) "+re4);
		boolean re5=(a!=b);
		System.out.println(" Comparison Operator(!=) "+re5);

		
	}
	void bitwiseOperator()
	{
	System.out.println("============= Bitwise Operators ================");
       int a=10;
	   System.out.println(" value 1="+a);
	   int b=20;
	   System.out.println(" value 2="+b);

	   int c=(a&b);
	   System.out.println(" Bitwise and operator");
	   System.out.println(" Result-"+c);
	   System.out.println(" Bitwise or operator");
      int d=(a|b);
	  System.out.println(" Result-"+d);
	  System.out.println(" Bitwise left-shift(a<<2) operator");
      int e=(a<<2);
	  System.out.println(" Result-"+e);
	  System.out.println(" Bitwise right-shift(a>>2) operator");
      int f=(a>>2);
	  System.out.println(" Result"+f);
	}
	void ternaryOperator()
	{    System.out.println("============== Ternary Operator ===========");
	    int m=10;
		String result=(m%2==0)?" Number is Even":" Number is Odd";
		System.out.println(result);
	}
	
}