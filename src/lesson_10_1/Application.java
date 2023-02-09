package lesson_10_1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws Exception {

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the word.");
			String str = scan.next().toLowerCase();
			System.out.println("The word is: " + str);

			if (str.length() != 5) {
				throw new Exception("String must contain 5 characters.");
			}

			if (str.charAt(0) == str.charAt(4) && str.charAt(1) == str.charAt(3)) {
				System.out.println("The word " + str + " is a palindrome");
			} else {
				System.out.println("The word " + str + " is not a palindrome");
			}
		}

	}
}
