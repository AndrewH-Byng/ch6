import java.util.Scanner;

	public class PPAP{
		public static void main (String[]args){
		Scanner in = new Scanner (System.in);
		String object1 = in.nextLine();
		String object2 = in.nextLine();
		System.out.println(ppap(object1,object2));
	}
		public static String ppap (String a, String b){
			String lowercaseb = b.substring(0,1);
			String ans1 = "I have a " + a + ", I have a " + b + ".";
			String ans2 = "Uh! " + lowercaseb.toUpperCase() + b.substring(1) + " " + a + ".";
			return ans1 + " "  + ans2;
		}
	}
		
