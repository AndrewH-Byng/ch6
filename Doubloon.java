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
		char letter = str.charAt(i);
			if (letterCount (str,letter)%2 != 0 || letterCount(str,letter) < 2) {
				return false;
			}
		}
		return true;
	}
	public static int letterCount(String s, char a){
		int sum = 0;
		for (int i = 0; i < s.length(); i++){
			char letter = s.charAt(i);
			if (letter == a) sum++;
		}
		return sum;
	}
	}

