import java.util.Scanner;

public class Question3_Palindrome {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int temp=n;
     int rev=0;
	while(n>0) {
		rev=rev*10+n%10;
		n=n/10;
	}
	if(rev==temp) {
	System.out.println("Yes the number is palendrome: ");
	}
	else {
	System.out.println("No the number is Not palendrome: ");
	sc.close();
	}
}

}
