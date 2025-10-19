import java.util.Scanner;

public class Day1CodingChallenge_LengthOfLogestString {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of strings: ");
	        int n = sc.nextInt();

	        String[] arr = new String[n];
	        System.out.println("Enter the strings:");
	        
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.next(); 
	        }

	        int maxLenString = 0;

	        for (String str : arr) {
	            if (str.length() > maxLenString) {
	                maxLenString = str.length();
	            }
	        }

	        System.out.println("The length of the longest string is: " + maxLenString);

	        sc.close();
	    
	}

}
