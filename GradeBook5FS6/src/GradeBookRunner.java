/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Dec 11, 2015
 * Last Update:				Dec 11, 2015
 * 
 * Project Filename:		GradeBook5FS6
 * Program Filename(s):		GradeBookRunner.java, Class.java, Student.java,							
 * 							Grades.java, Grade.java
 * I/O Files used:			gradebook.dat
 * I/O Files changed: 		None
 *
 * Function:	The program will create a Class to store Students.
 				Each student will have a number of Grades. The program will
 				print the class name, each student's grades and average,
 				the failing students, the highest and lowest averages,
 				and the class average.
 * 
 * Formulas: None
 * 
 * Algorithim:
 *		1. Get the class name from the dat file
 *		2. Get the number of students from the dat file
 *		3. Get the name and grades for each student from the dat file
 *		4. Print the class name and students with grades and averages
 *		5. Print the failing list
 *		6. Print the highest and lowest averages
 *		7. Print the class average
 */

import java.io.*;
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
	public static void main(String args[]) throws Exception
	{
	   Class class1;
	   
	   out.println("Welcome to the Class Stats program!");
	   out.println();
	   
	   Scanner fileIn = new Scanner(new File("gradebook.dat"));
	   
	   String className = fileIn.nextLine();
	   int stuNum = fileIn.nextInt();
	   fileIn.nextLine();

	   class1 = new Class(className, stuNum);
	   
	   String stuName = "";
	   String grades = "";
	   
	   for(int a = 0; a < class1.getClassSize(); a++)
	   {
		   stuName = fileIn.nextLine();
		   grades = fileIn.nextLine();
		   
		   class1.addStudent(a, new Student(stuName, grades));
		   
	   }
	   
	   out.println(class1.toString());
	   
	   out.println("Failure List = " + class1.getFailureList(70));
	   out.println("Highest Average = " 
			+ class1.getStudentWithHighestAverage());
	   out.println("Lowest Average = " 
			+ class1.getStudentWithLowestAverage());
		
	   out.println(String.format("Class Average = %.2f",
			class1.getClassAverage()));
	   
	   fileIn.close();
	}
}
