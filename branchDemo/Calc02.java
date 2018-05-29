import java.util.Scanner;
public class Calc02{
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
		System.out.println("Enter Number2");
		int num2 = scan.nextInt();

		if(opcode == 1){
			System.out.println(num1 + "+" + num2 + " = " + (num1 + num2));
		}else if(opcode == 2){
			System.out.println(num1 + "-" + num2 + " = " + (num1 - num2));
		}else if(opcode == 3){
			System.out.println(num1 + "*" + num2 + " = " + (num1 * num2));
		}else if(opcode == 4){
			System.out.println(num1 + "/" + num2 + " = " + (num1 / num2));
		}else{
			System.out.println(num1 + "%" + num2 + " = " + (num1 % num2));
		}

		/*if(opcode == "+"){
				System.out.println(num1 + opcode + num2 + " = " + (num1 + num2));
				}else if(opcode == "-"){
					System.out.println(num1 + opcode + num2 + " = " + (num1 - num2));
				}else if(opcode == "*"){
					System.out.println(num1 + opcode + num2 + " = " + (num1 * num2));
				}else if(opcode == "/"){
					System.out.println(num1 + opcode + num2 + " = " + (num1 / num2));
				}else{
					System.out.println(num1 + opcode + num2 + " = " + (num1 % num2));
				} */
			

		
		/*
		int num3 = num1 + num2;
		int num4 = num1 - num2;
		int num5 = num1 * num2;
		int num6 = num1 / num2;
		int num7 = num1 % num2;

		System.out.println(num1 + " + " + num2 + " = " + num3);
		System.out.println(num1 + " - " + num2 + " = " + num4);
		System.out.println(num1 + " * " + num2 + " = " + num5);
		System.out.println(num1 + " / " + num2 + " = " + num6);
		System.out.println(num1 + " % " + num2 + " = " + num7); */

		/*System.out.println("µÎ ¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä:");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.println("num1°ú num2ÀÇ ÇÕ : " + (num1 + num2));
		System.out.println("num1°ú num2ÀÇ Â÷ : " + (num1 - num2));
		System.out.println("num1°ú num2ÀÇ °ö : " + (num1 * num2));
		System.out.println("num1°ú num2ÀÇ ³ª´°¼À : " + (num1 / num2)); */
	}
}