public class Binary{
public static void main(String[] args) {
	System.out.print(toBinary(32));
}
public static String toBinary(int n) {
    String bin = "";
    while (n != 0) {
        int remainder = n % 2;
        n = n / 2;
        bin = remainder + bin;
    }
    return bin;
}
}
