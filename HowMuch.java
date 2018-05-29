import java.util.Scanner;
public class HowMuch{
	public static void main(String[] args){
		System.out.println("How Much?");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println(num1 + "Won.");
		System.out.println("How Many");
		int num2 = scan.nextInt();
		System.out.println(num2 + "EA");
		int sum = num1 * num2;
		System.out.println("Sum Price " + sum + "Won.");
		System.out.println("Expensive DC please");
		System.out.println("DC?");
		int dc = scan.nextInt();
		String message = "";
		if(dc >= 10){
			message = "No.";
		}else{
			message = sum - (sum / dc) + "Won.";
		}
		System.out.println(message);
	}
}