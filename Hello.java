import java.util.Scanner;
public class Hello{
	public static void main(String[] args){
		System.out.print("�̸� [  ]");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.print("�ȳ� " + name);
	}
}