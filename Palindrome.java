public class Palindrome {
public static void main(String[] args){
	isPalindrome("taco.cat");
}

public static boolean isPalindrome (String text) {
    text = removeNonLetters(text);
    text = text.toLowerCase();
    for (int i = 0; i < text.length()/2; i++) {
        if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
            return false;
        }
    }
    return true;
}
 
public static String removeNonLetters (String text) {
    String nonLetters = "!@#$%^&*()_-+=/?.>,<\\|[{}]~`;:\"| ";
    String newStr = "";
    for (int i = 0; i < text.length(); i++) {
        String currentChar = text.substring(i, i+1);
        if (!nonLetters.contains(currentChar)) {
            newStr += currentChar;
        }
    }
    return newStr;
}
}
