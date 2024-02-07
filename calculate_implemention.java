package Calculator_project;

import java.util.Scanner;

public class calculate_implemention {
	
	/*
     * Addition Method takes numbers and return Addition of numbers in float
     */
	 static double Addition()
    {
        Scanner Sc = new Scanner(System.in);
        int sum=0;
		int i=1;
		System.out.println("Please enter you no: (enter 0 to finish): ");
		while (i!=0)
		{
			i=Sc.nextInt();
			sum=sum+i;
		}
	
		return sum;
    }

	    /*
	     * Subtraction Method takes numbers and return subtraction of numbers in float
	     */

	     static double Subtraction() 
	    {
	    	Scanner Sc = new Scanner(System.in);
	    	 System.out.println("Please enter you no: (enter 0 to finish): ");
	        int sub = Sc.nextInt();
	        int num = 1; 
	        while (num != 0) { 
	            num = Sc.nextInt();
	            sub -= num; 
	        }
	        
	        return sub;
	    }
	    /*
	     * Multiplication Method takes numbers and return multiplication of numbers in float
	     */
	      static double Multiplication() {
	         Scanner Sc = new Scanner(System.in);
	         int product = 1; 
	         int num = 1; 
	         
	         System.out.println("Please enter your numbers : (enter 0 to finish):");
	         while (num != 0) { 
	             num = Sc.nextInt();
	             if (num != 0) { 
	                 product *= num; 
	             }
	         }
	         
	         return product;
	     }

	    /*
	     * Division Method takes two number and return division of two numbers in float
	     */
	    static double Division() {
	        Scanner Sc = new Scanner(System.in);
	        System.out.print("Enter numerator: ");
	        int numerator = Sc.nextInt();
	        System.out.print("Enter denominator: ");
	        int denominator = Sc.nextInt();
	        int result = 0;
	        try {
	        	result = numerator / denominator;
	        }
	        catch (ArithmeticException ex) {
	            System.out.println("Divided by zero operation cannot possible");
	        }
	        return result;
	    }

	    /*
	     * Modulus Method takes two number and return modulus of two numbers in float
	     */
	    static double Modulus() {
	        Scanner Sc = new Scanner(System.in);
	        System.out.print("Enter dividend: ");
	        int dividend = Sc.nextInt();
	        System.out.print("Enter divisor: ");
	        int divisor = Sc.nextInt();
	        int result = 0;
	        try {
	        	result = dividend % divisor;
	        	
	        }
	        catch (ArithmeticException ex) {
	            System.out.println("Error: Modulus by zero is undefined.");
	        }
	        return result;
	    }

	    /*
	     * Square Method takes one number and return square of one number in float
	     */
	    static double Square() {
	        Scanner Sc = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        double num = Sc.nextDouble();
	        return num * num;
	    }

	    /*
	     * SquareRoot Method takes one number and return squareRoot of one number in float
	     */
	    static double SquareRoot() {
	        Scanner Sc = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        double num = Sc.nextDouble();
	        if (num < 0) {
	            System.out.println("Error: Square root of a negative number is undefined.");
	            return Double.NaN;
	        } else {
	            return Math.sqrt(num);
	        }
	    }

	 
}