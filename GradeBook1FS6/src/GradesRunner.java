/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Nov 20, 2015
 * Last Update:				Dec 8, 2015
 * 
 * Project Filename:		GradeBook1FS6
 * Program Filename(s):		GradesRunner.java, Grades.java, Grade.java 
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will create a Grades class which contains an array
 * 				of the Grade[] class. The program will create multiple
 * 				instances of the Grades class to demonstrate its functions and
 * 				purpose.
 * 
 * Formulas: None
 * 
 * Algorithm:
 *		1. Create an instance of Grades
 *		2. Print the grades, the sum of the grades, the number of grades,
 *			and the lowest and highest grades
 *		3. Repeat for multiple instances
 */

import static java.lang.System.*;

public class GradesRunner 
{
	/**
		Purpose: Creates multiple Grades and prints their grades, the sum of
			their grades, their number of grades, and their lowest and highest
			grades
		Preconditions: None
		Postconditions: Creates multiple Grades and prints their grades, the sum of
			their grades, their number of grades, and their lowest and highest
			grades
	*/
	public static void main(String[] args)
	{
		Grades grades1 = new Grades("5 - 90 85 95.5 77.5 88");
		
		out.println(grades1.toString());
		out.println("sum = " + grades1.getSum());
		out.println("num grades = " + grades1.getNumGrades());
		out.println("low grade = " + grades1.getLowGrade());
		out.println("high grade = " + grades1.getHighGrade());
		
		out.println();
		
		Grades grades2 = new Grades("9 - 10 100 90 92.5 85 95.5 77.5 88 100");
		
		out.println(grades2.toString());
		out.println("sum = " + grades2.getSum());
		out.println("num grades = " + grades2.getNumGrades());
		out.println("low grade = " + grades2.getLowGrade());
		out.println("high grade = " + grades2.getHighGrade());
	}
}

