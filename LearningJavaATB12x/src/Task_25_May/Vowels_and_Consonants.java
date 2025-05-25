package Task_25_May;

import java.util.Scanner;

public class Vowels_and_Consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scanner.nextLine();
		str = str.toLowerCase();
		int length = str.length();
		int vowel_count = 0;
		int con_count = 0;
 		for(int i = 0; i<length; i++) {
 			char ch = str.charAt(i);
 			if(Character.isLetter(ch)) {
 				if((ch == 'a') || (ch == 'e') || (ch == 'i') 
 						|| (ch == 'o') || (ch == 'u')) {
 					
 					vowel_count++;
 				}else {
 					con_count++;
 				}
 			}
			
		}
 		System.out.println(vowel_count + " & " + con_count);
		
		scanner.close();
		

	}

}
