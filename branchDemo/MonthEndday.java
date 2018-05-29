import java.util.Scanner;
public class MonthEndday{
	public static void main(String[] args){
		System.out.println("Enter Month");
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		int day = 0;
		String message = "";
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			message = month + "month" + day + "day"; break;
			case 2:
			day = 28;
			message = month + "month" + day + "day"; break;
			default:
			day = 31;
			message = month + "month" + day + "day"; break;
		}
		System.out.println(message);
	}
}