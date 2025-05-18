package learningjava;

import java.util.Scanner;

public class Max_number_Using_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three numbers :");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		
		int maxnum = (n1>n2) ? (n1>n3)? n1 : n3 : ((n2>n3) ? n2 : n3);
		
		System.out.println("Maximum of three number is " + maxnum);
		
		scanner.close();
		

	}

}
