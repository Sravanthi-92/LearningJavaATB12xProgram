package task_20th_june;

import java.util.Scanner;

public class Electricity_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNextInt()) {
			int units = scanner.nextInt();
			double bill;
			if(units > 0 && units<=100) {
				bill = units*0.5;
				System.out.println(bill + " rupees of for " + units);
			}
			else if(units>100 && units<=200) {
				bill = units*0.75;
				System.out.println(bill +" rupees of for " + units );
			}
			else if(units>200 && units<=300) {
				bill = units*1.0;
				System.out.println(bill + " rupees of for " + units);
			}
			else if(units>300){
				bill = units*1.50;
				System.out.println(bill + " rupees of for " + units);
			}
			else {
				System.out.println("Enter only natural numbers");
			}
		}
		else {
			System.out.println("Enter valid number of units");
		}
		
		
		
		scanner.close();

	}

}
