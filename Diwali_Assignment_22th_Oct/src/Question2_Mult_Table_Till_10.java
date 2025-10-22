import java.util.Scanner;

public class Question2_Mult_Table_Till_10 {

	public static void main(String[] args) {

		System.out.println("Printing the table on the basis of the given number ");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number for witch you want to print table: ");
		int num=sc.nextInt();
		int mul=1;
		for(int i=1; i<=10;i++) {
			mul=i*num;
			System.out.println(+num+" X "+i+" = "+mul);
		}
       sc.close();

	}

}
