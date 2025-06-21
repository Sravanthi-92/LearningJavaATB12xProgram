package task_17_June;

import java.util.Scanner;

public class Vowel_Consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
			String str = scanner.nextLine();
			str = str.toLowerCase();
			char[] arr = str.toCharArray();
			for(int i = 0; i<arr.length; i++) {
				if (arr[i] >= 'a' && arr[i]<= 'z') {
					if(arr[i]== 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
						System.out.println(arr[i] + " is a vowel");
					}else {
						System.out.println(arr[i] + " is a consonant");
					}
				}
			}
		
		scanner.close();

	}

}
