package WrapperClassesExceptionsGenerics;

import java.util.Scanner;

public class Challenge_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		scanner.close();
		if(age < 18){
            try {
                throw new Exception("InvalidAgeException");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("Enjoying clubbing");
        }

	}

}
