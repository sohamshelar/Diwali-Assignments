import java.util.Scanner;

public class Question3_Number_Pattern {

    public static void main(String[] args) {

        System.out.println("Printing Number Pattern As per Choice");

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
        	System.out.println("\n1. Triangle\n2. Pyramid\n3. Reverse Triangle\n4. Reverse Pyramid");
        	System.out.println("Enter the choice as per given list :");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                switch (choice) {
                    case 1 -> Triangle(sc);
                    case 2 -> Pyramid(sc);
                    case 3 -> ReverseTriangle(sc); 
                    case 4 -> ReversePyramid(sc); 
                    default -> System.out.println("Enter a valid choice as per the list given above.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); 
            }
        }
    }

    public static void Triangle(Scanner sc) {
        System.out.print("Enter the number of rows for Triangle: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Pyramid(Scanner sc) {
        System.out.print("Enter the number of rows for Pyramid: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
           
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void ReverseTriangle(Scanner sc) {
        System.out.print("Enter the number of rows for Reverse Triangle: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void ReversePyramid(Scanner sc) {
        System.out.print("Enter the number of rows for Reverse Pyramid: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
          
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
