/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Nov 19, 2015
 * Last Update:				Dec 10, 2015
 * 
 * Project Filename:		GradeBook0FS6
 * Program Filename(s):		GradeTester.java, Grade.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will create a Grade class which contains a numeric
 * 				and letter grade. The program will create multiple instances
 * 				of the Grade class to demonstrate its functions and purpose.
 * 
 * Formulas: None
 * 
 * Algorithim:
 *		1. Create an instance of Grade
 *		2. Print the numeric and letter grade of the Grade
 *		3. Repeat for multiple instances
 */

import static java.lang.System.*;

public class GradeTester 
{
	/**
		Purpose: Creates multiple Grades and prints their numeric and letter
			grades
		Preconditions: None
		Postconditions: Creates multiple Grades and prints their numeric and
			letter grades
	 */
	public static void main(String[] args) 
	{
		Grade grade1 = new Grade(92.5);
		out.println(grade1.getNumericGrade());
		out.println(grade1.getLetterGrade());
		
		Grade grade2 = new Grade(77.5);
		out.println(grade2.getNumericGrade());
		out.println(grade2.getLetterGrade());		
		
		Grade grade3 = new Grade(47.5);
		out.println(grade3.getNumericGrade());
		out.println(grade3.getLetterGrade());		
		
		Grade grade4 = new Grade(87.5);
		out.println(grade4.getNumericGrade());
		out.println(grade4.getLetterGrade());		
	}
}
