
public class SwitchStatement {
	public static void main(String[] args) {
		char c='A';
		switch (c) {
		case 'A':
			System.out.println("Entered character is vowel and it is A");
			break;
		case 'E':
			System.out.println("Entered character is vowel and it is E");
			break;
		case 'I':
			System.out.println("Entered character is vowel and it is I");
			break;
		case 'O':
			System.out.println("Entered character is vowel and it is O");
			break;
		case 'U':
			System.out.println("Entered character is vowel and it is U");
			break;
		default:
			System.out.println("Entered character is not vowel");
			break;
		}
	}
}
