import java.util.Scanner;
public class GradeReport{
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
		int average = (kok + eng + math) / 3;
		String grade = "";
		if(average >= 90){
			grade = "A";
		}else if(average >= 80){
			grade = "B";
		}else if(average >= 70){
			grade = "C";
		}else if(average >= 60){
			grade = "D";
		}else if(average >= 50){
			grade = "E";
		}else{
			grade = "F";
		}
		System.out.println(name + "[aver] " + average + "[gra] " + grade);
	}
}