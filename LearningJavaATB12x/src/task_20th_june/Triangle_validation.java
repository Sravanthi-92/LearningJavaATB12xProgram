package task_20th_june;

import java.util.Scanner;

public class Triangle_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int side1 = scanner.nextInt();
		int side2 = scanner.nextInt();
		int side3 = scanner.nextInt();
		
		scanner.close();
		
		if(side1+side2>side3 && side2+side3>side1 && side1+side3>side2) {
			if(side1 == side2 && side2 ==side3) {
				System.out.println("Equilateral triangle");
			}
			else if(side1 == side2 || side2 == side3 || side1 == side3) {
				System.out.println("Isosceles triangle");
			}
			else {
				System.out.println("Scalene");
			}
		}
		else {
			System.out.println("Not a valid triangle.");
		}
	}

}
