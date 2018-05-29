import java.util.Scanner;
public class Calc03{
	public static void main(String[] args){
		System.out.println("Enter Number1");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println("Enter Opcode");
		String opcode = scan.next();
		System.out.println("Enter Number2");
		int num2 = scan.nextInt();
		int num3 = 0;
		if(opcode.equals("+")){
			num3 = num1 + num2;
		}else if(opcode.equals("-")){
			num3 = num1 - num2;
		}else if(opcode.equals("*")){
			num3 = num1 * num2;
		}else if(opcode.equals("/")){
			num3 = num1 / num2;
		}else if(opcode.equals("%")){
			num3 = num1 % num2;
		}else{
			System.out.println("fail");
		}
		System.out.println(num1 + opcode + num2 + " = " + num3);
	}
}