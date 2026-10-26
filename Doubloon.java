import java.util.Scanner;
public class Doubloon{
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		String inputstring = in.nextLine();
		System.out.println(isDoubloon(inputstring));
	}
	public static boolean isDoubloon (String str){
		boolean ans = true;
		for (int i = 0; i < str.length(); i++){
			if (str.indexOf('str.charAt(i)',i+1) <= 0){
			ans = false;
		}
		return ans;
	}
	}
}
			
				
