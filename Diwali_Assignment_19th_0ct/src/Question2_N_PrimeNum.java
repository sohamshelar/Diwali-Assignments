import java.util.Scanner;

public class Question2_N_PrimeNum {
	
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		boolean isprime=true;
		if(n<1) {
			System.out.println("Ente the number greter than 1");
		}
		System.out.println("Prime numbers till "+n+" Are :");
		for(int i=2;i<=n;i++) {
			for(int j=2; i%j!=0;j++) {
			
				System.out.println(+i);
				break;
		   
		}
	}

	}
	}


