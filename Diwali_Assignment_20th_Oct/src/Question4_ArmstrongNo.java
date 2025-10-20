import java.util.Scanner;

public class Question4_ArmstrongNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
	     int Num=0;
	     int rem=0;
		while(n>0) {
			rem=n%10;
			Num=Num+rem*rem*rem;
			n=n/10;
		}
		if(Num==n) {
		System.out.println("Yes the number is Armstrong: ");
		}
		else {
		System.out.println("No the number is Not Armstrong: ");
		sc.close();
		

	}

}
}
