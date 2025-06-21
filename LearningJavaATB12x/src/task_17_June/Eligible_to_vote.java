package task_17_June;

import java.util.Scanner;

public class Eligible_to_vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter age");
		  if(scanner.hasNextInt()) {
			  int age = scanner.nextInt();
			  scanner.close();
			  if(age>=18) {
				  System.out.println("Your are eligible to vote!!");
			  }
			  else {
				  System.out.println("Your are not eligible to vote!!");
			  }
		  }
		  else {
			  System.out.println("Enter valid input i.e integer's only");
		  }

	}

}
