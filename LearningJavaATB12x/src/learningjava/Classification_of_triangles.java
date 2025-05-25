package learningjava;

import java.util.Scanner;

public class Classification_of_triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of each side of triangle: ");
		int L1 = scanner.nextInt();
		int L2 = scanner.nextInt();
		int L3 = scanner.nextInt();
		
		String result = ((L1+L2>L3 && L3+L1>L2 && L2+L3>L1))? ((L1==L2)&&(L2==L3)&&(L3==L1)) ? "Equilateral triangle" : (L1==L2)||(L2==L3)||(L3==L1) ? "isosceles triangle" : "scalene triangle" : "Not a triangle";
		System.out.println("This is "+ result);
		scanner.close();

	}

}
