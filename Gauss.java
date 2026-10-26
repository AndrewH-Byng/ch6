public class Gauss{
	public static void main(String[] args){
	double x = 2;
	System.out.println("e^" + -x*x + " is:    " + Math.exp(-x*x));
	System.out.println("e^" + -x*x + " estimate:   " + gauss(x,1000));
}
	
	public class double gauss(double x, double n){
		double firstterm = 1;
		double sum = 1;
		for (int i = 1; i < n; i++) {
			double newterm = firstterm * (-x*x/i);
			sum += newterm;
			firstterm = newterm;
		}
		return sum;
	}
}
			
		


