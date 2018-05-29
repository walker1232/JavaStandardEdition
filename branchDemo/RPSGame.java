import java.util.Scanner;
public class RPSGame{
	public static void main(String[] args){
		System.out.println("Arockpaperscissors");
		Scanner scan = new Scanner(System.in);
		String ap = scan.next();
		System.out.println("Brockpaperscissors");
		String bp = scan.next();
		String result = "";
		String draw = "draw";
		String win = "apwin";
		String lose = "aplose";
		if(
			(ap.equals("R") && bp.equals("R"))
			 ||
			 (ap.equals("P") && bp.equals("P"))
			 ||
			 (ap.equals("S") && bp.equals("S"))
			 ){
			result = draw;
		}else if(ap.equals("R") && bp.equals("S")){
			result = win;
		}else if(ap.equals("R") && bp.equals("P")){
			result = lose;
		}else if(ap.equals("S") && bp.equals("R")){
			result = lose;
		}else if(ap.equals("S") && bp.equals("P")){
			result = win;
		}else if(ap.equals("P") && bp.equals("R")){
			result = win;
		}else{
			result = lose;
		}
		System.out.println("rockpaperscissors result : " + result);
	}
}