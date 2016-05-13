package karaalp;
/*WordGuess.java
 * made a game similar to hangman but you have unlimited lives
 * Adem karaalp
 * May 11 2016
 */

import java.util.Scanner;

public class WordGuess {

	public static void main(String[] args) {

		// variables and my arrays
		String[] actualWord = new String[] { "word", "bug", "brain", "human", "woman", "children", "build", "work",
				"blanket", "bag" };
		int random;
		Scanner scan = new Scanner(System.in);
		String letterGuess = null;
		String wordGuess;
		String play;
		int num;
		boolean fullWord = false;
		boolean playOrNah = false;

		
		System.out.println("Do you want to play hangman?");
		play = scan.nextLine();
		if (play.equalsIgnoreCase("yes")) {
			playOrNah = true;
		} else {
			playOrNah = false;
		}
		
		while (playOrNah == true) {
			// gets the word
			random = (int) (Math.random() * actualWord.length);
			String word = "";

			for (int i = 0; i < actualWord[random].length(); i++) {
				word = word + "-";
			}

			System.out.println("Welcome lets play hangman");
			System.out
					.println("Rules are simple: you guess a letter each time, and if you know the word just enter '!'");
			System.out.println(word);

			do {
				if (word.equals(actualWord[random])) {
					fullWord = true;
				} else {
					System.out.println("Guess a letter");
					letterGuess = scan.nextLine();
					if (letterGuess.equals("!")) {
						fullWord = true;
					} else {

						num = actualWord[random].indexOf(letterGuess);
						if (num == -1) {
							System.out.println("that isnt in the word");
						} else {
							word = word.substring(0, num) + letterGuess + word.substring((num + 1), word.length());

							System.out.println(word);
						}
					}
				}
			} while (!fullWord);

			if (letterGuess.equals("!")) {
				System.out.println("Enter the whole word now");
				wordGuess = scan.nextLine();
				if (wordGuess.equals(actualWord[random])) {
					System.out.println("You guessed the word, Congratulations you won!");

				} else {
					System.out.println("you only had one chance to guess the word and you got it wrong so you lost.");

				}
			} else {
				System.out.println("You guessed the word, congragulations you won!");
			}
			System.out.println("Do you want to play again?");
			play = scan.nextLine();
			if (play.equalsIgnoreCase("yes")) {
				playOrNah = true;
				fullWord = false;
			} else {
				playOrNah = false;
			}

		}
		System.out.println("Guess we wont play");
	}
}
