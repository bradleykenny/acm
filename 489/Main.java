import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			int round = Integer.parseInt(in.nextLine());
			if (round == -1) {
				break;
			}

			String word = in.nextLine();
			String guesses = in.nextLine();
			int attempts = 0;
			ArrayList<Character> guessedChars = new ArrayList<>();
			boolean correct = false;

			for (char c : guesses.toCharArray()) {
				if (!guessedChars.contains(c)) {
					guessedChars.add(c);
					if (!word.contains("" + c)) {
						attempts++;
					}
				} 

				int check = 0;
				for (int i = 0; i < word.length(); i++) {
					if (guessedChars.contains(word.charAt(i))) {
						check++;
					}
				}

				if (check == word.length() && attempts < 7) {
					correct = true;
					break;
				}
			}
			
			System.out.println("Round " + round);
			if (correct) {
				System.out.println("You win.");
			} else if (!correct && attempts < 7) {
				System.out.println("You chickened out.");
			} else {
				System.out.println("You lose.");
			}
 		}
		in.close();
	}
}