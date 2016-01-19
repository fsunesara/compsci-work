/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		GradeBook1FS6
 * Program Filename(s):		GradeTester.java, Grades.java, Grade.java 
 * I/O Files used:			None
 * I/O Files changed: 		None
 */

import java.util.Arrays;

import static java.lang.System.*;

public class Grades
{
	private Grade[] grades;
	
	public Grades(String newGrades)
	{
		newGrades.trim();
		String[] params = newGrades.split(" ");
		grades = new Grade[Integer.parseInt(params[0])];
		
		for(int a = 2; a < grades.length + 2; a++)
		{
			grades[a - 2] = new Grade(Double.parseDouble(params[a]));
		}
	}
	
	/**
		Purpose: Adds a grade to the grade list
		Preconditions: Grade[] grades
		Postconditions: Assigns g to the index spot in grades
	*/
	public void add(int spot, Grade g)
	{
		grades[spot] = g;
	}
	
	/**
		Purpose: Gets a grade from the grade list
		Preconditions: None
		Postconditions: Returns the Grade at index spot in grades
	*/
	public Grade get(int spot)
	{
		return grades[spot];
	}
	
	/**
		Purpose: Gets the sum of all the grades in the grade list
		Preconditions: double sum
		Postconditions: Returns sum
	*/
	public double getSum()
	{
		double sum = 0;
		
		for(int b = 0; b < grades.length; b++)
		{
			sum = sum + grades[b].getNumericGrade();
		}
		
		return sum;
	}
	
	/**
		Purpose: Gets the lowest grade in the grade list
		Preconditions: None
		Postconditions: Sorts grades and returns the
			Grade at index 0 in grades
	*/
	public Grade getLowGrade()
	{
		Arrays.sort(grades);
		return grades[0];
	}
	
	/**
		Purpose: Gets the highest grade in the grade list
		Preconditions: None
		Postconditions: Sorts grades and returns the Grade at index
			grades.length - 1 in grades
	*/
	public Grade getHighGrade()
	{
		Arrays.sort(grades);
		return grades[grades.length - 1];
	}
	
	/**
		Purpose: Gets the number of grades in the grade list
		Preconditions: None
		Postconditions: Returns grades.length
	*/
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		String gradeStr = "";
		
		for(int c = 0; c < grades.length; c++)
		{
			gradeStr = gradeStr + grades[c].getNumericGrade() + " ";
		}
		return gradeStr;
	}
}
