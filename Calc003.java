import java.util.Scanner;
public class Calc003{
	public static void main(String[] args){
		System.out.println("Enter Number1");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println("Enter Opcode");
		String opcode = scan.next();
		System.out.println("Enter Number2");
		int num2 = scan.nextInt();
		int num3 = 0;
		String message = "";
		switch(opcode){
			case "+": num3 = num1 + num2; break;
			case "-": num3 = num1 - num2; break;
			case "*": num3 = num1 * num2; break;
			case "/": num3 = num1 / num2; break;
			case "%": num3 = num1 % num2; break;
			default: message = "fail"; break;
		}
		if(!message.equals("fail")){
			message = num1 + opcode + num2 + " = " + num3;
		}
		System.out.println(message);
	}
}