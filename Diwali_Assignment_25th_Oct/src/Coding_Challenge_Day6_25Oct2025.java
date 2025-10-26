import java.util.Scanner;

public class Coding_Challenge_Day6_25Oct2025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Entert the string for checking is it alphanumeric or not : ");
	    String str= sc.next();
		if(isAlphaNumeric(str)) {
			System.out.println("Yes "+str+" the string is alsplanumeric");
		}else {
			System.out.println("No "+str+" the string is not alsplanumeric");
		}
	  }
	}

	private static boolean isAlphaNumeric(String str) {

		for(int i=0; i<str.length();i++) {
			char ch= str.charAt(i);
		if(!((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z') ||(ch>='0' && ch<='9'))) {
			return false;
		}
			}
		return true;
		

}
}
