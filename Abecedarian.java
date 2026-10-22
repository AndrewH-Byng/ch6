public class Abecedarian {
	public static boolean isAdecedarian (String a) {
		for (int ap = 0 ; ap <= a.length() -1; ap++) {
			if (a.charAt(ap) < a.charAt(ap+1)) {
			return true;
		}

	}
		return false;
}
}
			
