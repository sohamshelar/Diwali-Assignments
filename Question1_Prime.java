import java.util.Scanner;

public class Que1_isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        boolean isprime = true;

        if (n <= 1) {
            System.out.println("Enter a number greater than 1");
            sc.close();
            return; 
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }

        if (isprime) {
            System.out.println("Yes, the number is prime");
        } else {
            System.out.println("No, the number is not prime");
        }

        sc.close();
    }
}
