import java.util.Scanner;
public class Abecedarian {
	
public static void main (String [] args){
	Scanner in = new Scanner (System.in);
	String inputstring = in.nextLine();
	System.out.println(isAbecedarian(inputstring));
}
public static boolean isAbecedarian (String a) {
	boolean ans = true;
		for (int ap = 0 ; ap < a.length() -1; ap++) {
			if (a.charAt(ap) > a.charAt(ap+1)) {
			ans = false;
		}
	}
		return ans;
}
}
			
