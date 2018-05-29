import java.util.Scanner;
public class RPSGame2{
	public static void main(String[] args){
		System.out.println("Arockpaperscissors");
		Scanner scan = new Scanner(System.in);
		String ap = scan.next();
		System.out.println("Brockpaperscissors");
		String bp = scan.next();
		String result = "draw";

		if((ap.equals("R") && bp.equals("S")) || (ap.equals("S") && bp.equals("P")) || (ap.equals("P") && bp.equals("R"))){
			result = "awin";
		}else if((ap.equals("R") && bp.equals("P")) || (ap.equals("S") && bp.equals("R")) || (ap.equals("P") && bp.equals("S"))){
			result = "alose";
		}else{}
		System.out.println("Rock Scissors Paper result :" + result);
	}
}