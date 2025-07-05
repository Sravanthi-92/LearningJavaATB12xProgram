package WrapperClassesExceptionsGenerics;

import java.util.Scanner;

public class Challenge_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = 0;
		 try {
	            n3 = n1 / n2;
	            System.out.println(n3);
	        } catch (Exception e) {
	            System.out.println("Error: Cannot divide by zero Finally block executed");
	        }finally {
	            System.out.println("Result: " + n3 + " Finally block executed");
	        }
	        

	}

}
