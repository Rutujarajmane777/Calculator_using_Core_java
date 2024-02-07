package Calculator_project;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        while (true) {
        	System.out.println("******WELCOME TO CALCULATOR*****");
        	System.out.println();
            System.out.println("Choose operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Square");
            System.out.println("7. Square Root");
            System.out.println("0. Exit");
            
            calculate_implemention obj = new calculate_implemention();

            int choice = Sc.nextInt();
            double result;

            switch (choice) {
                case 1:
                    result = obj.Addition();
                    break;
                case 2:
                    result = obj.Subtraction();
                    break;
                case 3:
                    result = obj.Multiplication();
                    break;
                case 4:
                    result = obj.Division();
                    break;
                case 5:
                    result = obj.Modulus();
                    break;
                case 6:
                    result = obj.Square();
                    break;
                case 7:
                    result = obj.SquareRoot();
                    break;
               
                case 0:
                    System.out.println("Exiting calculator. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a valid operation.");
                    continue;
            }

            System.out.println("Result: " + result);
        }
    }
   
}
