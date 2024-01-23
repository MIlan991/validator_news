package cubes;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		String title;
		String text;
		String link;
		String email;
		String author;

		Scanner scanner = new Scanner(System.in);
		
		// TITLE SCANNER
		System.out.print("Enter title here (3-50 characters): ");
		title = scanner.nextLine();
		
		// TEXT SCANNER
		System.out.print("Enter title here (10-250 characters): ");
		text = scanner.nextLine();
		
		// LINK SCANNER
		System.out.print("Enter link here (min. 10 characters and must star with 'http://'): ");
		link = scanner.next();
		
		// EMAIL SCANNER
		System.out.print("Enter email here (min. 5 characters and must have '@'): ");
		email = scanner.next();
		
		scanner.nextLine();
		
		// AUTHOR SCANNER
		System.out.print("Enter author here (not required): ");
		author = scanner.nextLine();
		
		scanner.close();
		
		// TITLE VALIDATOR CHECK
		if(title != null && title.length() < 50 && title.length() > 3) {
			System.out.println("Title: " + title);
		} else {
			System.out.println("Title: Please, enter title with 3 to 50 characters");
		}
		
		// TEXT VALIDATOR CHECK
		if(text != null && text.length() < 250 && text.length() > 10) {
			System.out.println("Text: " + text);
		} else {
			System.out.println("Please, enter text with 10 to 250 characters: ");
		}
		
		// LINK VALIDATOR CHECK
		if(link != null && link.length() > 10 && link.startsWith("http://")) {
			System.out.println("Link: " + link);
		} else {
			System.out.println("Please, enter title with 10 to 250 characters and start with 'http://': ");
		}
		
		// EMAIL VALIDATOR CHECK
		if(email != null && email.length() > 5 && email.contains("@")) {
			System.out.println("Email: " + email);
		} else {
			System.out.println("Must contain min. 5 characters and '@'.");
		}
		
		// AUTHOR VALIDATOR CHECK
		if((author != null && author.length() > 5)) {
			System.out.println("Author: " + author);
		} else {
			System.out.println("No data.");
		}
		
		System.out.println("--------------------------------------------------------");
		System.out.println(" ");
		System.out.println("End of code!");
	}

}