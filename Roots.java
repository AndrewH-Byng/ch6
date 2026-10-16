import java.util.Scanner;

public class Roots{
	
	public static double squareRoot (double r){
		double xo = r/2;
		double x1 = (xo + r/xo)/2;
		while (Math.abs(x1 - xo) >= 0.0001){
			xo = x1;
			x1 = (xo + r/ xo) / 2;
		}
			return x1; 
		}
	
		
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Give me a number: ");
		double a = in.nextDouble();
		System.out.println(squareRoot(a));
	}
}
		
		
