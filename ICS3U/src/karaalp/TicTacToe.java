package karaalp;

/*TicTacToe.java
 * Tic Tac toe game by entering coordinates
 * Adem Karaalp
 * May 12 2016
 */
import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {

		// declaring variables
		String[][] tttBoard = new String[3][3];
		boolean[][] checks = new boolean[3][3];
		boolean x = false;
		boolean o = false;
		tttBoard[0][0] = "";
		tttBoard[0][1] = "";
		tttBoard[0][2] = "";
		tttBoard[1][0] = "";
		tttBoard[1][1] = "";
		tttBoard[1][2] = "";
		tttBoard[2][0] = "";
		tttBoard[2][1] = "";
		tttBoard[2][2] = "";
		boolean win = false;
		int row;
		int column;
		boolean playOrNah = true;
		String play;

		Scanner scan = new Scanner(System.in);
		System.out.println("Do you want to play tic tac toe?");
		play = scan.nextLine();
		if ( play.equalsIgnoreCase("yes")){
			playOrNah = true;
		}else {
			playOrNah = false;
		}

		while (playOrNah) {
			System.out.println("Alright lets play Tic Tac Toe");
			System.out.println("The rules are simple, you enter the coordinate you want the X or the O to be");
			System.out.println("Minimum row and column is 1 and maximum is 3");
			while (!win) {
				// X's turn
				if (!o) {
					System.out.println("First player enter the coordinates you would like to place the X(e.g. 3 1)");

					row = scan.nextInt();
					column = scan.nextInt();
					if (!checks[row - 1][column - 1]) {
						checks[row - 1][column - 1] = true;
						// plant x
						tttBoard[row - 1][column - 1] = "X";

						// display board
						System.out.println(tttBoard[0][0] + "\t" + tttBoard[0][1] + "\t" + tttBoard[0][2]);
						System.out.println(tttBoard[1][0] + "\t" + tttBoard[1][1] + "\t" + tttBoard[1][2]);
						System.out.println(tttBoard[2][0] + "\t" + tttBoard[2][1] + "\t" + tttBoard[2][2]);

						// check for winner
						if (tttBoard[0][0] == tttBoard[0][1] && tttBoard[0][0] == tttBoard[0][2]
								&& !tttBoard[0][2].equals("")) {
							System.out.println(tttBoard[0][0] + " wins!");
							win = true;
						} else if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[1][2]
								&& !tttBoard[1][2].equals("")) {
							System.out.println(tttBoard[1][0] + " wins!");
							win = true;
						} else if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][0] == tttBoard[2][2]
								&& !tttBoard[2][2].equals("")) {
							System.out.println(tttBoard[2][0] + " wins!");
							win = true;
						} else if (tttBoard[0][0] == tttBoard[1][0] && tttBoard[0][0] == tttBoard[2][0]
								&& !tttBoard[1][0].equals("")) {
							System.out.println(tttBoard[1][0] + " wins!");
							win = true;
						} else if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][0] == tttBoard[1][2]
								&& !tttBoard[1][2].equals("")) {
							System.out.println(tttBoard[1][0] + " wins!");
							win = true;
						} else if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][0] == tttBoard[2][2]
								&& !tttBoard[2][2].equals("")) {
							System.out.println(tttBoard[2][0] + " wins!");
							win = true;
						} else if (tttBoard[0][0] == tttBoard[1][1] && tttBoard[0][0] == tttBoard[2][2]
								&& !tttBoard[2][2].equals("")) {
							System.out.println(tttBoard[2][2] + " wins!");
							win = true;
						} else if (tttBoard[0][2] == tttBoard[1][1] && tttBoard[0][2] == tttBoard[2][0]
								&& !tttBoard[0][2].equals("")) {
							System.out.println(tttBoard[0][0] + " wins!");
							win = true;
						} else {
							win = false;
						}
						// checks for cats game
						if (!tttBoard[0][0].equals("") && !tttBoard[0][1].equals("") && !tttBoard[0][2].equals("")
								&& !tttBoard[1][0].equals("") && !tttBoard[1][1].equals("")
								&& !tttBoard[1][2].equals("") && !tttBoard[2][0].equals("")
								&& !tttBoard[2][1].equals("") && !tttBoard[2][2].equals("")) {
							win = true;
							System.out.println("Cat's game!");
						}
						x = false;
					} else {
						System.out.println("Those coordinates were already entered, please enter a different one.");
						x = true;
					}
				}

				// O's turn
				if (!win && !x) { // checks if x has already won
					System.out.println("Second player enter coordinates you would like to place the O(e.g. 3 1)");

					row = scan.nextInt();
					column = scan.nextInt();

					if (!checks[row - 1][column - 1]) {
						checks[row - 1][column - 1] = true;
						// plant o
						tttBoard[row - 1][column - 1] = "O";

						// show board
						System.out.println(tttBoard[0][0] + "\t" + tttBoard[0][1] + "\t" + tttBoard[0][2]);
						System.out.println(tttBoard[1][0] + "\t" + tttBoard[1][1] + "\t" + tttBoard[1][2]);
						System.out.println(tttBoard[2][0] + "\t" + tttBoard[2][1] + "\t" + tttBoard[2][2]);

						// check for win
						if (tttBoard[0][0] == tttBoard[0][1] && tttBoard[0][0] == tttBoard[0][2]
								&& !tttBoard[0][2].equals("")) {
							System.out.println(tttBoard[0][0] + " wins!");
							win = true;
						} else if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[1][2]
								&& !tttBoard[1][2].equals("")) {
							System.out.println(tttBoard[1][0] + " wins!");
							win = true;
						} else if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][0] == tttBoard[2][2]
								&& !tttBoard[2][2].equals("")) {
							System.out.println(tttBoard[2][0] + " wins!");
							win = true;
						} else if (tttBoard[0][0] == tttBoard[1][0] && tttBoard[0][0] == tttBoard[2][0]
								&& !tttBoard[1][0].equals("")) {
							System.out.println(tttBoard[1][0] + " wins!");
							win = true;
						} else if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][0] == tttBoard[1][2]
								&& !tttBoard[1][2].equals("")) {
							System.out.println(tttBoard[1][0] + " wins!");
							win = true;
						} else if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][0] == tttBoard[2][2]
								&& !tttBoard[2][2].equals("")) {
							System.out.println(tttBoard[2][0] + " wins!");
							win = true;
						} else if (tttBoard[0][0] == tttBoard[1][1] && tttBoard[0][0] == tttBoard[2][2]
								&& !tttBoard[2][2].equals("")) {
							System.out.println(tttBoard[2][2] + " wins!");
							win = true;
						} else if (tttBoard[0][2] == tttBoard[1][1] && tttBoard[0][2] == tttBoard[2][0]
								&& !tttBoard[0][2].equals("")) {
							System.out.println(tttBoard[0][0] + " wins!");
							win = true;
						} else {
							win = false;
						}
						// checks for cats game
						if (!tttBoard[0][0].equals("") && !tttBoard[0][1].equals("") && !tttBoard[0][2].equals("")
								&& !tttBoard[1][0].equals("") && !tttBoard[1][1].equals("")
								&& !tttBoard[1][2].equals("") && !tttBoard[2][0].equals("")
								&& !tttBoard[2][1].equals("") && !tttBoard[2][2].equals("")) {
							win = true;
							System.out.println("Cat's game!");
						}
						o = false;
					} else {
						System.out.println("Those coordinates were already entered, please enter different one.");
						o = true;
					}
				}
			}
			System.out.println("Do you want to play again?");
			scan.nextLine();
			play = scan.nextLine();
			if (play.equalsIgnoreCase("no")) {
				playOrNah = false;
			} else {
				playOrNah = true;
				tttBoard[0][0] = "";
				tttBoard[0][1] = "";
				tttBoard[0][2] = "";
				tttBoard[1][0] = "";
				tttBoard[1][1] = "";
				tttBoard[1][2] = "";
				tttBoard[2][0] = "";
				tttBoard[2][1] = "";
				tttBoard[2][2] = "";

				checks[0][0] = false;
				checks[0][1] = false;
				checks[0][2] = false;
				checks[1][0] = false;
				checks[1][1] = false;
				checks[1][2] = false;
				checks[2][0] = false;
				checks[2][1] = false;
				checks[2][2] = false;

				win = false;
				playOrNah = true;
				x = false;
				o = false;
			}

		}
		System.out.println("Guess we wont play :(");
	}
}