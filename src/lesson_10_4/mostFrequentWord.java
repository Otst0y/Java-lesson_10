package lesson_10_4;

import java.util.Scanner;

class mostFrequentWord {
	
	static void mostFrequentWord(String arr[]) {
		
		int frequency = 0;
		
		String mostFString = "";
		
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j].equals(arr[i])) {
					count++; 
				}
			}
			if(count >= frequency) {
				mostFString = arr[i];
				frequency = count;
			}
		}
		System.out.println("Most occured word is: " + mostFString);
	}
	

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the string.");
			String str = scan.nextLine();
			System.out.println("String is: " + str);

			String arr[] = str.split(" ");
			
			mostFrequentWord(arr);
			

		}

	
}


