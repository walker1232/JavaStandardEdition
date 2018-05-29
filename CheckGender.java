import java.util.Scanner;
public class CheckGender{
	public static void main(String[] args){
		System.out.println("Enter your ssn");
		Scanner scan = new Scanner(System.in);
		String ssn = scan.next();
		System.out.println("Enter your name");
		String name = scan.next();
		String message = "";
		String gender = "";
		char ch = ssn.charAt(7);
		switch(ch){
			case '1': case '3':
			gender = "man";
			message = name + " : " + ssn + " : " + gender; break;
			case '2': case '4':
			gender = "woman";
			message = name + " : " + ssn + " : " + gender; break;
			case '5': case '6':
			message = name + " : " + ssn + " : foreignal"; break;
			default:
			message = ssn + "retry"; break;
		}
		System.out.println(message);
	}
}