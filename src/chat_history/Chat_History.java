package chat_history;

import java.util.ArrayList;
import java.util.Scanner;

public class Chat_History {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		boolean stop = false;
		
		while (!stop) {
			System.out.print("Enter a sentence: ");
			String line = scan.nextLine();
			if (line.equals("STOP")) {
				stop = true;
			} else {
				String[] sentence = line.split(" ");
				for (String word : sentence) {
					words.add(word);
				}
			}
		}
		scan.close();
		
		System.out.println("\nChat Report:");
		
		System.out.println("You used "+ words.size() +"words.");
		
		ArrayList<String> unique = new ArrayList<>();
		for (int i = 0; i < words.size(); i++) {
			String word = words.get(i);
			int first = words.indexOf(word);
			int last = words.lastIndexOf(word);
			
			if (first == last) {
				unique.add(word);
			}
		}
		System.out.println("You used "+ unique.size() +"unique words.");
		
		int summ = 0;
		for (String word : words) {
			if ((word.toUpperCase()).equals("THE")) {
				summ++;
			}
		}
		System.out.println("You used \"the\" "+ summ +"times.");
		
		int index = 0;
		for (int i = 0; i < words.size(); i++) {
			if ((words.get(index).length()) < (words.get(i).length())) {
				index = i;
			}
		}
		System.out.println("\""+words.get(index)+"\" was the longest word.");
		
		boolean upperCase = false;
		for (String word : words) {
			if (word.equals(word.toUpperCase())) {
				upperCase = true;
			} else {
				upperCase = false;
			}
		}
		System.out.println("Are all words lowercase? "+upperCase);
		
		System.out.println("\nCondensed Chat History:");
		for (String word : unique) {
			if (word.length() > 3) {
				System.out.println((word.toLowerCase()));
			}
		}
	}

}
