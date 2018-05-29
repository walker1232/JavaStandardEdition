import java.util.Scanner;
public class GradeReport2{
	public static void main(String[] args){
		System.out.println("What's your name?");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("kok grade?");
		int kok = scan.nextInt();
		System.out.println("Eng grade?");
		int eng = scan.nextInt();
		System.out.println("math grade?");
		int math = scan.nextInt();
		int average = (kok + eng + math) / 3 /10;
		String grade = "";
		switch(average){
			case 9: grade = "A"; break;
			case 8: grade = "B"; break;
			case 7: grade = "C"; break;
			case 6: grade = "D"; break;
			case 5: grade = "E"; break;
			default: grade = "F"; break;
		}
		System.out.println(name + "[aver] " + average + "[gra] " + grade);
	}
}