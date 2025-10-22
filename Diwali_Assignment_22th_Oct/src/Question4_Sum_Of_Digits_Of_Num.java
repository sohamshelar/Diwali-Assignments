import java.util.Scanner;

public class Question4_Sum_Of_Digits_Of_Num {

	public static void main(String[] args) {
		System.out.println("Sum OF digits of the numbers");
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int sum=0;
		int rem=0;
		
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		System.out.println("Sum of all digits of numbers is: "+sum);
	}
	}

}
