package task_20th_june;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		
		double sum = 0;
		int rem = 0;
		if (scanner.hasNextInt()) {
			int number = scanner.nextInt();
			int armnumber = number;
			int digits = String.valueOf(number).length();
			scanner.close();
			while(number!=0) {
				rem = number%10;
				sum = sum+ Math.pow(rem, digits);
				number=number/10;
			}
			if(armnumber == sum) {
				System.out.println(armnumber + " is an Armstrong number");
			}
			else{
				System.out.println(armnumber + " is not an Armstrong number");
			}
		}
		else {
			System.out.println("Enter valid input i.e integers only");
		}

	}

}
