import java.util.Scanner;

public class CodingChallenge_Day2_20_Oct_25 {

	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
	     int rev=0;
	     
		while(n!=0) {

			rev=rev*10+n%10;
			
			n=n/10;
		
	     }
		System.out.println("The Reverse number of " +temp+" without leading zeros is :"+rev);
		
		sc.close();
		

	}

}
