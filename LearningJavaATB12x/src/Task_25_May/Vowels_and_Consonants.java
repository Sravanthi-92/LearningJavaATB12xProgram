package Task_25_May;

import java.util.Scanner;

public class Vowels_and_Consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = scanner.nextLine();
		scanner.close();
		string = string.toLowerCase();
		int length = string.length();
		int vowel_count = 0;
		int con_count = 0;
		
 		for(int i = 0; i<length; i++) {
 			char ch = string.charAt(i);
 			if(Character.isLetter(ch)) {
 				if((ch == 'a') || (ch == 'e') || (ch == 'i') 
 						|| (ch == 'o') || (ch == 'u')) {
 					
 					vowel_count++;
 				}else {
 					con_count++;
 				}
 			}
			
		}
 		System.out.println("No.of vowels in " + string + " : " + vowel_count);
 		System.out.println("No.of consonants in " + string + " : " + con_count);
		
		scanner.close();
		

	}

}
