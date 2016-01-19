/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Dec 8, 2015
 * Last Update:				Dec 8, 2015
 * 
 * Project Filename:		GradeBook2FS6
 * Program Filename(s):		StudentRunner.java, Student.java, Grades.java,
 * 							Grade.java 
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will create a Grades class to store grades and a
 * 				Student class to store student name and grade information.
 * 
 * Formulas: None
 * 
 * Algorithm:
 *		1. Construct a Student to store a name and grades
 *		2. Pass two string containing the name, number of grades, and the grades
 *		3. Print the sum of all the grades
 *		4. Print the average of all the grades
 *		5. Print the average after dropping the lowest grade
 *		6. Print the lowest and highest grades
 *		7. Repeat for any test cases.
 */

import static java.lang.System.*;

public class StudentRunner 
{
	/**
		Purpose: Create a Grades class to store grades and a Student class to
			store student name and grade information.
		Preconditions: None
		Postconditions: Creates a Grades class to store grades and a Student
			class to store student name and grade information.
	 */
	public static void main(String[] args)
	{
		Student stu = new Student("Billy Bob", "5 - 90 85 95.5 77.5 88");

		out.println(stu);
		out.println("sum = " + stu.getSum());
		out.println("average = " + stu.getAverage());
		out.println("average after dropping low grade = " + stu.getAverageMinusLow());
		out.println("low grade = " + stu.getLowGrade()); 
		out.println("high grade = " + stu.getHighGrade());
	}
}
