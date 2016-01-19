/**
 * Programmer:				Faisal Sunesara
 * Version:					Java 1.6 using Eclipse v. Mars
 * CS: AP					Period 6
 * Date Created:			Dec 12, 2015
 * Last Update:				Dec 12, 2015
 *
 * Project Filename:		GradeBook3FS6
 * Program Filename(s):		ClassTester.java, Class.java, Student.java,
 * 							Grades.java, Grade.java
 * I/O Files used:			None
 * I/O Files changed:		None
 *
 * Function:	The program will create an instance of Class, which contains
 * 				an array of Student[]. The program will create multiple
 * 				instances of the Class class to demonstrate its functions and
 * 				purpose.
 * 
 * Formulas: 	None
 * 
 * Algorithm:
 *		1. Create an instance of Class and adds students to it
 *		2. Print the class name, students, their averages, the list of failing
 *			students, the students with the highest and lowest averages, and
 *			the class average.
 */

import static java.lang.System.*;

public class ClassTester
{
	/**
		Purpose: Create a Class and print the class name, students, their
			averages, the list of failing students, the students with the
			highest and lowest averages, and the class average.
		Preconditions: None
		Postconditions: Creates a Class and prints the class name, students, their
			averages, the list of failing students, the students with the
			highest and lowest averages, and the class average.
	 */
   public static void main(String args[])
   {
		Class class1 = new Class("Comp Sci 1", 3);
		
		class1.addStudent(0, new Student("Jimmy", "4 - 100 90 80 60"));
		class1.addStudent(1, new Student("Sandy", "4 - 100 100 80 70"));
		class1.addStudent(2, new Student("Fred",  "4 - 50 50 70 68"));	
		
		out.println(class1.getClassName());
		out.println();
		
		out.println(class1);
		
		out.println(String.format(class1.getStudentName(0) 
			+ "\'s average = %.2f",class1.getStudentAverage(0)));
		out.println(String.format(class1.getStudentName(1) 
			+ "\'s average = %.2f",class1.getStudentAverage(1)));
		out.println(String.format(class1.getStudentName(2) 
			+ "\'s average = %.2f",class1.getStudentAverage(2)));
		out.println();
		
		out.println(String.format("Sandy\'s average = %.2f",
			class1.getStudentAverage("Sandy")));
		out.println();

		out.println("Failure List = " + class1.getFailureList(70));	
		out.println("Highest Average = " 
			+ class1.getStudentWithHighestAverage());
		out.println("Lowest Average = "
			+ class1.getStudentWithLowestAverage());
		out.println();
								
		out.println(String.format("Class Average = %.2f", 
			class1.getClassAverage()));									
	}		
}
