/**
 * Programmer:				Faisal Sunesara		
 *
 * Project Filename:		GradeBook3FS6
 * Program Filename(s):		ClassTester.java, Class.java, Student.java,
 * 							Grades.java, Grade.java
 * I/O Files used:			None
 * I/O Files changed:		None
 */

import java.util.Arrays;

public class Grades 
{
	private Grade[] grades;
	
	public Grades()
	{
		setGrades(0);
	}
	
	public Grades(String newGrades)
	{
		String[] params = newGrades.split(" ");
		setGrades(Integer.parseInt(params[0]));
		
		for(int a = 2; a < grades.length + 2; a++)
		{
			grades[a - 2] = new Grade(Double.parseDouble(params[a]));
		}
	}
	
	/**
		Purpose: Creates a Grade array with the set number of values
		Preconditions: Grade[] grades
		Postconditions: Initializes grades
	*/
	public void setGrades(int size)
	{
		grades = new Grade[size];
	}
	
	/**
		Purpose: Adds a grade to the specified spot
		Preconditions: None
		Postconditions: Assigns g to index spot in grades
	*/
	public void add(int spot, double g)
	{
		grades[spot] = new Grade(g);
	}
	
	/**
		Purpose: Returns the grade in the specified spot
		Preconditions: None
		Postconditions: Returns the grade in index spot
	*/
	public Grade get(int spot)
	{
		return grades[spot];
	}
	
	/**
		Purpose: Returns the sum of all numeric grades
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
		Purpose: Returns the lowest grade in grades[]
		Preconditions: None
		Postconditions: Returns the grade in index 0
	*/
	public double getLowGrade()
	{
		Arrays.sort(grades);
		return grades[0].getNumericGrade();
	}
	
	/**
		Purpose: Returns the highest
		Preconditions: 
		Postconditions: 
	*/
	public double getHighGrade()
	{
		Arrays.sort(grades);
		return grades[grades.length - 1].getNumericGrade();
	}
	
	/**
		Purpose: Returns the number of grades
		Preconditions: None
		Postconditions: Returns the length of grades[]
	*/
	public int getNumGrades()
	{
		return grades.length;
	}
	
	/**
		Purpose: Inserts all the numeric grades in grades[] into a String
		Preconditions: String gradeStr
		Postconditions: gradeStr has every grade in grades[]
	*/
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
