package karaalp;
/*GradeProgram.java
 * this program asks how many students in the class and asks for their mark and tells them what they got
 * Adem Karaalp
 * March 30, 2016
 */

import java.util.Scanner;

public class GradeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		int grade;
		int studentsInClass;
		
		//Input
		Scanner scan = new Scanner (System.in);
		
		System.out.println("How many students are in the class?");
		studentsInClass = Integer.parseInt(scan.nextLine());
		
		//output
		for (int i=0; i <= studentsInClass; i++) {
			
			System.out.println("What is the mark for this Student?");
			grade = Integer.parseInt(scan.nextLine());
			
			if (grade <= 100 && grade >= 80)
			{
				System.out.println("The mark is " + grade + " So they got an A");
			}
			else if (grade <= 79 && grade >= 70)
			{
				System.out.println("The mark is " + grade + " So they got an B");
			}
			else if (grade <= 69 && grade >= 60)
			{
				System.out.println("The mark is " + grade + " So they got an C");
			}
			else if (grade <= 59 && grade >= 50)
			{
				System.out.println("The mark is " + grade + " So they got an D");
			}
			else if (grade <= 49 && grade >= 0)
			{
				System.out.println("The mark is " + grade + " So they got an F");
			}
			else 
			{
				System.out.println("You entered an invalid number so they get a X");
			}
		}
		
	}

}
