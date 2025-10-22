import java.util.Scanner;

public class Question1_Addition_Of_Two_No {

	public static void main(String [] args) {
		System.out.println("Addition Of Two Numbers");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int firstNum=sc.nextInt();
		System.out.println("Enter the Second number: ");
		int SecondNum=sc.nextInt();
		int result=firstNum+SecondNum;
		System.out.println("Addition of "+firstNum+ " and" +SecondNum+ " is: "+result);
	    sc.close();
	}
	
}
