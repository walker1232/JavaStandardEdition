import java.util.Scanner;
public class Calc002{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number1");
		int num1 = scan.nextInt();
		System.out.println("Enter OPCODE");
		System.out.println("if plus then Enter 1");
		System.out.println("if Minus then Enter 2");
		System.out.println("if Multi then Enter 3");
		System.out.println("if Divid then Enter 4");
		System.out.println("if Mudular then Enter 5");
		int opcode = scan.nextInt();
		String opcode2 = null;
		System.out.println("Enter Number2");
		int num2 = scan.nextInt();
		int num3 = 0;
		if(opcode == 1){
			num3 = num1 + num2;
			opcode2 = "+";
		}else if(opcode == 2){
			num3 = num1 - num2;
			opcode2 = "-";
		}else if(opcode == 3){
			num3 = num1 * num2;
			opcode2 = "*";
		}else if(opcode == 4){
			num3 = num1 / num2;
			opcode2 = "/";
		}else{
			num3 = num1 % num2;
			opcode2 = "%";
		}
		System.out.println(num1 + opcode2 + num2 + " = " + num3);
	}
}