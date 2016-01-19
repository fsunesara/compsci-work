/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Dec 9, 2015
 * Last Update:				Dec 10, 2015
 * 
 * Project Filename:		GradeBook4FS6
 * Program Filename(s):		GradeBookRunner.java, Class.java, Student.java,
 * 							Grades.java, Grade.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 *
 * Function:	The program will create a Class to store Students.
 * 				Each student will have a number of Grades. The program will	
 * 				print the class name, each student's grades and average,
 * 				the failing students, the highest and lowest averages,
 * 				and the class average.
 * 
 * Formulas: None
 * 
 * Algorithim:
 *		1. Ask the user for the class name
 *		2. Ask the user for the number of students
 *		3. Ask the user to enter the name and grades for each student
 *		4. Print the class name and students with grades and averages
 *		5. Print the failing list
 *		6. Print the highest and lowest averages
 *		7. Print the class average
 */

import java.util.Scanner;
import static java.lang.System.*;

public class GradeBookRunner
{
	
	/**
		Purpose: Create a Class to store Students.
 			Each student will have a number of Grades. The program will
 			print the class name, each student's grades and average,
 			the failing students, the highest and lowest averages,
 			and the class average.
		Preconditions: None
		Postconditions: Creates a Class to store Students and
 			prints the class name, each student's grades and average,
 			the failing students, the highest and lowest averages,
 			and the class average.
	 */
	public static void main(String args[])
	{
	   Class class1;
	   
	   out.println("Welcome to the Class Stats program!");
		
	   Scanner scan = new Scanner(System.in);
		
	   out.print("Enter the class name: ");
	   String className = scan.nextLine();
	   
	   out.print("Enter the number of students: ");
	   int stuNum = scan.nextInt();
	   scan.nextLine();
	   out.println();
	   
	   class1 = new Class(className, stuNum);
	   
	   String stuName;
	   String grades;
	   
	   for(int a = 0; a < class1.getClassSize(); a++)
	   {
		   out.print("Enter the name for student " + (a + 1) + ": ");
		   stuName = scan.nextLine();
		   
		   out.println("Enter the grades for " + stuName);
		   out.print("Use the format x - grades: ");
		   grades = scan.nextLine();
		   
		   class1.addStudent(a, new Student(stuName, grades));
		   
		   out.println();
	   }
	   
	   out.println(class1.toString());
	   
	   out.println("Failure List = " + class1.getFailureList(70));	
	   out.println("Highest Average = " 
			+ class1.getStudentWithHighestAverage());
	   out.println("Lowest Average = " 
			+ class1.getStudentWithLowestAverage());
		
	   out.println(String.format("Class Average = %.2f",
			class1.getClassAverage()));							
	}
}