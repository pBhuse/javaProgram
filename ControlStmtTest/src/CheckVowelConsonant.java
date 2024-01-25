import java.util.Scanner;

public class CheckVowelConsonant 
{
public static void main(String[] args)
{
	System.out.println("======== Q1 To check Vowel or Consonant using Switch Case=======");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the character");
	//String st=sc.next();
	//char chr = sc.next().toCharArray()[0];//The toCharArray() method of the String class converts the current String to a character array.
	//char ch= Character.toUpperCase(chr);//toUpperCase(char ch) method of Character class 
	char chr=sc.next().charAt(0);
	char ch= Character.toUpperCase(chr);
	switch (ch) {
	case 'A':
		System.out.println(" It is vowel");
		
		break;
	case 'E':
		System.out.println("It is vowel");
		
		break;
	case 'I':
		System.out.println(" It is vowel");
		
		break;
	case 'O':
		System.out.println(" It is vowel");
		
		break;
	case 'U':
		System.out.println("It is vowel");
		
		break;
	default:
		System.out.println(ch+"is Consonant");
	}
}
}
