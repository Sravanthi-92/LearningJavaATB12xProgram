package Task_24th_June;

import java.util.Scanner;

public class Right_Angle_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		
		for(int i = 1; i<=rows; i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print("*\s");
			}
			System.out.println();
		}
		scanner.close();

		
	}

}
