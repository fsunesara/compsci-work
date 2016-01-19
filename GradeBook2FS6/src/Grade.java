/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		GradeBook2FS6
 * Program Filename(s):		StudentRunner.java, Student.java, Grades.java, Grade.java 
 * I/O Files used:			None
 * I/O Files changed: 		None
 */

public class Grade implements Comparable
{
	private String letterGrade;
	private double numericGrade;
	
	public Grade()
	{
		setNumericGrade(0);
		setLetterGrade();
	}
	
	public Grade(double g)
	{
		setNumericGrade(g);
		setLetterGrade();
	}
	
	/**
		Purpose: Sets the letter grade based on the numeric grade
		Preconditions: String letterGrade
		Postconditions: Assigns a value to letterGrade determined by the value
			of numericGrade
	 */
	public void setLetterGrade()
	{
		if(numericGrade > 90)
		{
			letterGrade = "A";
		}
		
		else if(numericGrade > 80)
		{
			letterGrade = "B";
		}
		
		else if(numericGrade > 70)
		{
			letterGrade = "C";
		}
		
		else
		{
			letterGrade = "F";
		}
	}
	
	/**
		Purpose: Sets the numeric grade
		Preconditions: double numericGrade
		Postconditions: Assigns the value of g to numericGrade
	 */
	public void setNumericGrade(double g)
	{
		numericGrade = g;
	}
	
	/**
		Purpose: Gets the letter grade
		Preconditions: None
		Postconditions: Returns letterGrade
	 */
	public String getLetterGrade()
	{
		  return letterGrade;
	}
	
	/**
		Purpose: Gets the numeric grade
		Preconditions: None
		Postconditions: returns numericGrade
	 */
	public double getNumericGrade()
	{
		  return numericGrade;
	}
	
	public String toString()
	{
		return numericGrade + " ";
	}
	
	public int compareTo(Object o) 
	{
		
		if((Object)this.numericGrade == o)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}


