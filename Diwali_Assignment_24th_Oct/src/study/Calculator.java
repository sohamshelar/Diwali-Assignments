package study;

import java.util.Scanner;

class Calculator {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       while(true) {
    	   System.out.println("Enter the First number: ");
    	   double number1=sc.nextInt();

           System.out.println("Enter the Second number: ");
           double number2=sc.nextInt();

           System.out.println("1. +\n2. -\n3. *\n4. /\n5.4 %");
           System.out.println("Enter the operator from abow list which you want to perform on numbers: ");
           String operator=sc.next();
           try{
        	   double result = calculate(number1, number2, operator);
           	System.out.println("Result is: "+result);
           }
           catch(WrongOperatorException e){
           	System.out.println("Error : "+e.getMessage());
           }
           catch(ArithmeticException e){
           	System.out.println("Math Error : "+e.getMessage());
           }
            
       }
		
	}
	public static double calculate(double number1, double number2, String operator) throws WrongOperatorException {
  		 switch(operator) {
  		 case "+":
            return number1 + number2;
        case "-":
            return number1 - number2;
        case "*":
            return number1 * number2;
        case "/":
            if (number2 == 0)
                throw new ArithmeticException("Division by zero is not allowed.");
            return number1 / number2;
        case "%":
            if (number2 == 0)
                throw new ArithmeticException("Modulo by zero is not allowed.");
            return number1 % number2;
        default:
            throw new WrongOperatorException("Invalid operator: " + operator);
            
        }

	}

}
class WrongOperatorException extends Exception{
	public WrongOperatorException (String message) {
		super(message);
	}
}
