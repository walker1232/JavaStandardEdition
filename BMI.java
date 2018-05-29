import java.util.Scanner;
public class BMI{
	public static void main(String[] args){
		System.out.println("Enter High");
		Scanner scan = new Scanner(System.in);
		double high = scan.nextDouble();
		System.out.println("Enter Weight");
		double weight = scan.nextDouble();
		high = high / 100;
		double result = weight/(high*high);
		String message = "";
		if(result < 18.5){
			message = "low";
		}else if(result >= 18.5 && result < 23){
			message = "normal";
		}else if(result >= 23 && result < 25){
			message = "before fat";
		}else if(result >= 25 && result < 30){
			message = "first fat";
		}else if(result >= 30 && result < 35){
			message = "second fat";
		}else{
			message = "thrid fat";
		}
		System.out.println(message + " : " + result);
	}
}