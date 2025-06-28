package Task_24th_June;

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int i = 1;
		while(i<=10) {
			System.out.println(number + " * " + i + " = " + number*i);
			i++;
		}
		scanner.close();

	}

}
