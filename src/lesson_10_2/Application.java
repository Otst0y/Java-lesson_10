package lesson_10_2;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the string.");
			String str = scan.nextLine();
			String result = str.replaceAll("[AEIOUY]", "-").replaceAll("[aeiouy]", "-");
			System.out.println(result);
		

	}

}
