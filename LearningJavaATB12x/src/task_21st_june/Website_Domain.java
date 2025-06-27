package task_21st_june;

import java.util.Scanner;

public class Website_Domain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String website = scanner.next();
		website = website.toLowerCase();
		
		if(website.endsWith(".com")) {
			System.out.println("The website type is: Commercial website");
		}
		else if(website.endsWith(".org")) {
			System.out.println("The website type is: Non-profit organization");
		}
		else if(website.endsWith(".edu")) {
			System.out.println("The website type is: Educational institution");
		}
		else if(website.endsWith(".gov")) {
			System.out.println("The website type is: Government website");
		}
		else if(website.endsWith(".net")) {
			System.out.println("The website type is: Network-related website");
		}
		else if(website.endsWith(".info")) {
			System.out.println("The website type is: Informational website");
		}else if(website.endsWith(".xyz")) {
			System.out.println("The website type is: Unknown or other types of websites");
		}
		
		
		scanner.close();

	}

}
