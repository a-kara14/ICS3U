package karaalp;
/*SoccerQuiz.java
 * This program is a quiz about soccer and it tests your soccer IQ
 * Adem Karaalp
 * June 14, 2016
 */

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import hsa_new.Console;

public class SoccerQuiz {

	public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {

		// an array for my questions
		String[] questions = new String[] { "Which team won the most world cups?",
				"Which team won the most Champions league?", "Who is the top scorer in soccer history?",
				"Who has the most Ballon d'ors? (full name)", "Who won the Spor Toto cup in year 2011-2012?",
				"Who was the best goalkeeper for the last two years? (full name)",
				"Who has the most caps in Real Madrid? (last name)", "Which team won the 2014 world cup?",
				"Which team won the 2012 Euro cup", "Who won the golden boot of the 2014 world cup? (full name)",
				"Who won the golden ball of 2010 World cup? (full name)",
				"Who won the ballon d'or for 3 years in a row? (full name)",
				"Who was the Coach of Real Madrid when they won their 11th Champions league? (last name)",
				"Which player was the Man of the Math in 2015 champions league final? (full name)",
				"Which player is the most expensive transfer? (full name)",
				"What is Lionel Messi's Second team? (trick question or barcelona)",
				"Where was Cristiano Ronaldos first pro team? (sporting lisbon or manchester united)",
				"Who assisted Messi's first goal for Barcelona?", "Has Messi won a world cup? (yes or no)",
				"Has Cristiano Roanldo won a world cup? (yes or no)", "Has Ronaldo won the worldcup? (yes or no)" };

		// an array for the correct answers
		String[] answers = new String[] { "Brazil", "Real Madrid", "Pele", "Lionel Messi", "Fenerbahce", "Manuel Neuer",
				"Raul", "Germany", "Spain", "James Rodriguez", "Diego Forlan", "Lionel Messi", "Zidane",
				"Andres Iniesta", "Gareth Bale", "Trick question", "Sporting Lisbon", "Ronaldinho", "No", "No", "Yes" };
		// an array to store the users answers
		String[] userAnswer = new String[21];
		// variable declared for title picture
		Image titlePic;
		// variable is assigned a picture
		titlePic = Toolkit.getDefaultToolkit().getImage("soccer.jpg");
		// array for all the pictures in the program
		Image[] picture = new Image[21];
		// all the variables are assigned with the pictures
		picture[0] = Toolkit.getDefaultToolkit().getImage("worldcup.jpg");
		picture[1] = Toolkit.getDefaultToolkit().getImage("champions.jpg");
		picture[2] = Toolkit.getDefaultToolkit().getImage("pele.jpg");
		picture[3] = Toolkit.getDefaultToolkit().getImage("ballondor.jpg");
		picture[4] = Toolkit.getDefaultToolkit().getImage("fenerbahce.jpg");
		picture[5] = Toolkit.getDefaultToolkit().getImage("goalie.jpg");
		picture[6] = Toolkit.getDefaultToolkit().getImage("raul.jpg");
		picture[7] = Toolkit.getDefaultToolkit().getImage("2014brazil.jpg");
		picture[8] = Toolkit.getDefaultToolkit().getImage("2012euro.jpg");
		picture[9] = Toolkit.getDefaultToolkit().getImage("golden.jpg");
		picture[10] = Toolkit.getDefaultToolkit().getImage("ball.jpg");
		picture[11] = Toolkit.getDefaultToolkit().getImage("messi.jpg");
		picture[12] = Toolkit.getDefaultToolkit().getImage("zidane.jpg");
		picture[13] = Toolkit.getDefaultToolkit().getImage("andresiniesta.jpg");
		picture[14] = Toolkit.getDefaultToolkit().getImage("bale.jpg");
		picture[15] = Toolkit.getDefaultToolkit().getImage("mark.jpg");
		picture[16] = Toolkit.getDefaultToolkit().getImage("ronaldo.jpg");
		picture[17] = Toolkit.getDefaultToolkit().getImage("messi_first.jpg");
		picture[18] = Toolkit.getDefaultToolkit().getImage("messi_world.jpg");
		picture[19] = Toolkit.getDefaultToolkit().getImage("ronaldo_world.jpg");
		picture[20] = Toolkit.getDefaultToolkit().getImage("roanldo_worldcup.jpg");

		// all variables declared
		String play;
		boolean playOrNah;
		String answer;
		double score = 0;
		double total;
		DecimalFormat df = new DecimalFormat("0.00");
		Console soccer = new Console(45, 155);

		// sets the font
		soccer.setFont(new Font("SansSerif", Font.BOLD, 45));
		// displays the title
		soccer.drawString("Soccer Quiz", 400, 35);
		// sets the cursor
		soccer.setCursor(5, 3);
		// changes the font
		soccer.setFont(new Font("SansSerif", Font.PLAIN, 15));
		// the quiz starts
		soccer.drawString("Welcome,", 15, 50);
		soccer.drawString("Do you want to play? (yes or no)", 15, 70);
		// title picutre is displayed
		soccer.drawImage(titlePic, 0, 200, 1250, 700, null);
		play = soccer.readLine();

		if (play.equalsIgnoreCase("yes")) {
			// if answer is yes the progrma enters the while loop
			playOrNah = true;
		} else {
			// if answer is no the program skips the while loop
			soccer.println("I guess we wont play");
			playOrNah = false;
		}
		soccer.clear();
		// loop starts
		while (playOrNah == true) {
			try {
				// the font is changed
				soccer.setFont(new Font("SansSerif", Font.BOLD, 45));
				// the title is displayed
				soccer.drawString("Soccer Quiz", 400, 35);
				// the font is changed
				soccer.setFont(new Font("SansSerif", Font.PLAIN, 15));
				// intro to the game
				soccer.drawString("Welcome to the soccer quiz where you can test your soccer IQ", 15, 50);
				Thread.sleep(2000);
				// the rules to the game
				soccer.drawString(
						"Rules are simple: I ask the questions and you answer, spelling matters but the case of the letters dont and at the end i'll tell you all the correct answers",
						15, 70);
				Thread.sleep(3000);
				soccer.clear();
				// the loop for the questions, pictures and adding score begins
				for (int i = 0; i <= 20; i++) {
					// sets the font
					soccer.setFont(new Font("SansSerif", Font.BOLD, 45));
					// the title is displayed
					soccer.drawString("Soccer Quiz", 400, 35);
					// font is changed
					soccer.setFont(new Font("SansSerif", Font.PLAIN, 25));
					// displays which question the game is on
					soccer.drawString("Question:" + (i + 1), 25, 30);

					// this if statement is for picture 10
					if (i == 10) {
						// changes this specific picture to make it look nice
						soccer.drawImage(picture[i], 200, 200, 400, 600, null);
					}
					// this else if statement is for picture 19
					else if (i == 19) {
						// changes this specific picture to make it look nice
						soccer.drawImage(picture[i], 200, 200, 400, 600, null);

					} else {
						// every other picture is in this size
						soccer.drawImage(picture[i], 0, 200, 1250, 700, null);
					}

					// the method questions is called
					question(questions, soccer, i);

					// the answers of the user is taken
					answer = soccer.readLine();
					// the answers are stored in a array
					userAnswer[i] = answer;

					// the method is stored in the variable and is called at the
					// same time
					score = scores(answers, soccer, score, i, answer);
					Thread.sleep(1000);
					soccer.clear();

					// loop ends here
				}
				// sets font
				soccer.setFont(new Font("SansSerif", Font.PLAIN, 25));
				// displays what score the user got
				soccer.drawString("You scored " + score + " Out of 21", 25, 30);
				Thread.sleep(1000);
				// the percentage is found for the users score
				total = ((score / 21) * 100);
				// displays the percentage the user got
				soccer.drawString("Your percentage is " + df.format(total) + "%", 25, 60);
				Thread.sleep(2000);

				soccer.clear();

				// the answers the user inputed is displayed
				soccer.drawString("Your answers are", 30, 20);
				soccer.setCursor(2, 1);
				// the loop starts
				for (int i = 0; i <= 20; i++) {

					// user answers are displayed
					soccer.println(userAnswer[i]);

					// loop ends here
				}
				Thread.sleep(3000);
				// the font is set
				soccer.setFont(new Font("SansSerif", Font.PLAIN, 25));
				// the correct answers are about to be displayed
				soccer.drawString(
						"All the correct answers are: (you can compare your naswer and see what you got wrong)", 30,
						450);
				Thread.sleep(3000);
				soccer.setCursor(24, 1);
				// loop starts
				for (int i = 0; i <= 20; i++) {

					// the method to display the correct answers is called
					correctAnswer(answers, soccer, i);

					// loop ends here
				}
				Thread.sleep(5000);

				// asks if you want to play again
				soccer.println("Do you want to play again?");
				// gets the answer
				play = soccer.readLine();

				if (play.equalsIgnoreCase("yes")) {
					// restarts the loop all the way from the top
					soccer.clear();
					playOrNah = true;
				} else {

					// exits the main loop
					playOrNah = false;
				}

			} catch (InterruptedException ie) {
				System.err.println(ie.getMessage());
			}
		}
	}

	/**
	 * this method changes the font and displays the questions
	 * 
	 * @param questions
	 * @param soccer
	 * @param i
	 */
	public static void question(String[] questions, Console soccer, int i) {

		// changes font
		soccer.setFont(new Font("Serif", Font.ITALIC, 20));
		// displays the questions
		soccer.drawString(questions[i], 25, 100);
		// sets the cursor at those points
		soccer.setCursor(7, 4);

	}

	/**
	 * this method displays the correct answers
	 * 
	 * @param answers
	 * @param soccer
	 * @param i
	 */

	public static void correctAnswer(String[] answers, Console soccer, int i) {

		// this method displays the correct answers
		soccer.println(answers[i]);

	}

	/**
	 * this method checks if the answer is right if it is adds one and displays
	 * "coorect". if its wrog it just displays "wrong"
	 * 
	 * @param answers
	 * @param soccer
	 * @param score
	 * @param i
	 * @param answer
	 * @return score
	 */

	public static double scores(String[] answers, Console soccer, double score, int i, String answer) {

		// sets the font
		soccer.setFont(new Font("Serif", Font.PLAIN, 20));
		// if statement to see if the answer is right or wrong
		if (answer.equalsIgnoreCase(answers[i])) {
			// displays correct
			soccer.drawString("correct", 25, 160);
			// adds one to the score
			score++;
		} else {
			// displays wrong
			soccer.drawString("wrong", 25, 160);
		}
		// returns the score
		return score;

	}

}
