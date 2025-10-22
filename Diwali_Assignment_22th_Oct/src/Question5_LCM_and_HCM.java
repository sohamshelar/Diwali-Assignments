import java.util.Scanner;

public class Question5_LCM_and_HCM {

	public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  while(true) {
	  System.out.println("Entert the two numbers for which you want to calculate HCF and LCM: ");
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  int HCF=Question5_LCM_and_HCM.GCD(a,b);
	  int LCM =a*b/HCF ;
	  System.out.println("HCF (GCD) of " + a + " and " + b + " is: " + HCF);
      System.out.println("LCM of " + a + " and " + b + " is: " + LCM);
	}
	}
	public static int GCD(int a, int b) {
		int GCD = 1;
		for(int i=1;i<Math.min(a, b);i++) {
			if(a%i==0 && b%i==0) {
			 GCD=i;
			}
		}
		return GCD;

	}

}
