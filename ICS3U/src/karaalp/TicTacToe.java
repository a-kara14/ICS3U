package karaalp;
/*TicTacToe.java
 * Tic Tac toe game by entering coordinates
 * Adem Karaalp
 * May 12 2016
 */
import java.util.Scanner;

public class TicTacToe {
public static void main(String[] args) {
		
		//variables
		String [][] tttBoard=new String [3][3];
		tttBoard[0][0]="";
		tttBoard[0][1]="";
		tttBoard[0][2]="";
		tttBoard[1][0]="";
		tttBoard[1][1]="";
		tttBoard[1][2]="";
		tttBoard[2][0]="";
		tttBoard[2][1]="";
		tttBoard[2][2]="";
		boolean win=false;
		int row;
		int column;
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Alright lets play Tic Tac Toe");
		System.out.println("Rules are simple you just plot coordinates");
		System.out.println("you can enter from 1-3, first you enter the row you want, then you enter the column");
		
		while (win==false)
		{
			//X's turn
			System.out.println("First player what are the coordinates you want to place the X(e.g. 3 1)");
		
			row=scan.nextInt();
			column=scan.nextInt();
			
			//planting x
			tttBoard[row-1][column-1]="X";
			
			//display's board
			System.out.println(tttBoard[0][0]+"     "+tttBoard[0][1]+"     "+tttBoard[0][2]);
			System.out.println(tttBoard[1][0]+"     "+tttBoard[1][1]+"     "+tttBoard[1][2]);
			System.out.println(tttBoard[2][0]+"     "+tttBoard[2][1]+"     "+tttBoard[2][2]);
		
			//check's for winner
			if(tttBoard[0][0]==tttBoard[0][1]&&tttBoard[0][0]==tttBoard[0][2]&&!tttBoard[0][2].equals(""))
			{
				System.out.println(tttBoard[0][0]+" wins!");
				win=true;
			}
			else if(tttBoard[1][0]==tttBoard[1][1]&&tttBoard[1][1]==tttBoard[1][2]&&!tttBoard[1][2].equals(""))
			{
				System.out.println(tttBoard[1][0]+" wins!");
				win=true;
			}
			else if(tttBoard[2][0]==tttBoard[2][1]&&tttBoard[2][0]==tttBoard[2][2]&&!tttBoard[2][2].equals(""))
			{
				System.out.println(tttBoard[2][0]+" wins!");
				win=true;
			}
			else if(tttBoard[0][0]==tttBoard[1][0]&&tttBoard[0][0]==tttBoard[2][0]&&!tttBoard[1][0].equals(""))
			{
				System.out.println(tttBoard[1][0]+" wins!");
				win=true;
			}
			else if(tttBoard[1][0]==tttBoard[1][1]&&tttBoard[1][0]==tttBoard[1][2]&&!tttBoard[1][2].equals(""))
			{
				System.out.println(tttBoard[1][0]+" wins!");
				win=true;
			}
			else if(tttBoard[2][0]==tttBoard[2][1]&&tttBoard[2][0]==tttBoard[2][2]&&!tttBoard[2][2].equals(""))
			{
				System.out.println(tttBoard[2][0]+" wins!");
				win=true;
			}
			else if(tttBoard[0][0]==tttBoard[1][1]&&tttBoard[0][0]==tttBoard[2][2]&&!tttBoard[2][2].equals(""))
			{
				System.out.println(tttBoard[2][2]+" wins!");
				win=true;
			}
			else if(tttBoard[0][2]==tttBoard[1][1]&&tttBoard[0][2]==tttBoard[2][0]&&!tttBoard[0][2].equals(""))
			{
				System.out.println(tttBoard[0][0]+" wins!");
				win=true;
			}
			else
			{
				win=false;
			}
			
			//O's turn
			if (win==false){
			System.out.println("second player what are the coordinates you want to place the O(e.g. 3 1)");
		
			row=scan.nextInt();
			column=scan.nextInt();
			
			//planting O
			tttBoard[row-1][column-1]="O";
		
			//show's board
			System.out.println(tttBoard[0][0]+"     "+tttBoard[0][1]+"     "+tttBoard[0][2]);
			System.out.println(tttBoard[1][0]+"     "+tttBoard[1][1]+"     "+tttBoard[1][2]);
			System.out.println(tttBoard[2][0]+"     "+tttBoard[2][1]+"     "+tttBoard[2][2]);
			
			//check's for winner
			if(tttBoard[0][0]==tttBoard[0][1]&&tttBoard[0][0]==tttBoard[0][2]&&!tttBoard[0][2].equals(""))
			{
				System.out.println(tttBoard[0][0]+" wins!");
				win=true;
			}
			else if(tttBoard[1][0]==tttBoard[1][1]&&tttBoard[1][1]==tttBoard[1][2]&&!tttBoard[1][2].equals(""))
			{
				System.out.println(tttBoard[1][0]+" wins!");
				win=true;
			}
			else if(tttBoard[2][0]==tttBoard[2][1]&&tttBoard[2][0]==tttBoard[2][2]&&!tttBoard[2][2].equals(""))
			{
				System.out.println(tttBoard[2][0]+" wins!");
				win=true;
			}
			else if(tttBoard[0][0]==tttBoard[1][0]&&tttBoard[0][0]==tttBoard[2][0]&&!tttBoard[1][0].equals(""))
			{
				System.out.println(tttBoard[1][0]+" wins!");
				win=true;
			}
			else if(tttBoard[1][0]==tttBoard[1][1]&&tttBoard[1][0]==tttBoard[1][2]&&!tttBoard[1][2].equals(""))
			{
				System.out.println(tttBoard[1][0]+" wins!");
				win=true;
			}
			else if(tttBoard[2][0]==tttBoard[2][1]&&tttBoard[2][0]==tttBoard[2][2]&&!tttBoard[2][2].equals(""))
			{
				System.out.println(tttBoard[2][0]+" wins!");
				win=true;
			}
			else if(tttBoard[0][0]==tttBoard[1][1]&&tttBoard[0][0]==tttBoard[2][2]&&!tttBoard[2][2].equals(""))
			{
				System.out.println(tttBoard[2][2]+" wins!");
				win=true;
			}
			else if(tttBoard[0][2]==tttBoard[1][1]&&tttBoard[0][2]==tttBoard[2][0]&&!tttBoard[0][2].equals(""))
			{
				System.out.println(tttBoard[0][0]+" wins!");
				win=true;
			}
			else
			{
				win=false;
			}
			if (!tttBoard[0][0].equals("") && !tttBoard[0][1].equals("") &&!tttBoard[0][2].equals("") && !tttBoard[1][0].equals("") &&!tttBoard[1][1].equals("") &&!tttBoard[1][2].equals("") &&!tttBoard[2][0].equals("") &&!tttBoard[2][1].equals("") &&!tttBoard[2][2].equals("")){
				win = true;
				System.out.println("Tie game!");
			}
		}
		}
	}

}
