/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		GradeBook4FS6
 * Program Filename(s):		GradeBookRunner.java, Class.java, Student.java,
 * 							Grades.java, Grade.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 */

import java.util.Arrays;

public class Class 
{
	private String name;
	private Student[] studentList; 

	public Class(String c, int stuNum)
	{
		name = c;
		studentList = new Student[stuNum];
	}
	
	/**
			Purpose: Adds a student to the class
			Preconditions: Student[] studentList
			Postconditions: Creates a Student at index spot
	 */
	public void addStudent(int spot, Student s)
	{
		studentList[spot] = s;
	} 
	
	/**
			Purpose: Gets the class name
			Preconditions: None
			Postconditions: Returns name
	 */
	public String getClassName()
	{
		return name; 
	} 
	
	/**
			Purpose: Gets the class size
			Preconditions: None
			Postconditions: Returns the length of studentList
	 */
	public int getClassSize()
	{
		return studentList.length;
	}
	
	/**
			Purpose: Gets the average of every student's average
			Preconditions: double classSum
			Postconditions: Returns classSum
	 */
	public double getClassAverage()
	{
		double classSum = 0.0;
		
		for(int a = 0; a < studentList.length; a++)
		{
			classSum += studentList[a].getAverage();
		}
		
		return classSum / studentList.length;
	}

	/**
			Purpose: Gets a student's average
			Preconditions: None
			Postconditions: Returns the average of the student in spot
	 */
	public double getStudentAverage(int spot)
	{
	    return studentList[spot].getAverage();
	}

	/**
			Purpose: Gets a student's average
			Preconditions: double stuAvg
			Postconditions: Returns the average of the student with the passed
				name
	 */
	public double getStudentAverage(String stuName)
	{
		double stuAvg = 0;
		
		for(int b = 0; b < studentList.length; b++)
		{
			if(studentList[b].getName().equals(stuName))
			{
				stuAvg = studentList[b].getAverage();
				break;
			}
		}
		
		return stuAvg;
	}

	/**
			Purpose: Gets a student's name
			Preconditions: None
			Postconditions: Returns the name of the student in spot
	 */
	public String getStudentName(int spot)
	{
		return studentList[spot].getName(); 
	}

	/**
			Purpose: Gets the student with the highest average
			Preconditions: None
			Postconditions: Returns the name of the last student
	 */
	public String getStudentWithHighestAverage()
	{
		Arrays.sort(studentList);
		return studentList[studentList.length - 1].getName();
	}

	/**
			Purpose: Gets the student with the lowest average
			Preconditions: None
			Postconditions: Returns the name of the first student
	 */
	public String getStudentWithLowestAverage()
	{
		Arrays.sort(studentList);
		return studentList[0].getName();
	} 

	/**
			Purpose: Gets a list of failing students 
			Preconditions: String failList
			Postconditions: Returns failList
	 */
	public String getFailureList(double failingGrade)
	{
		String failList = "";
		
		for(int c = 0; c < studentList.length; c++)
		{
			if(studentList[c].getAverage() <= failingGrade)
			{
				failList = failList + studentList[c].getName() + ", ";
			}
		}
		failList = failList.substring(0, failList.length() - 2);
		return failList;
	}

	public String toString()
	{
		String classStr = name + "\n";
		
		for(int d = 0; d < studentList.length; d++)
		{
			classStr = classStr + studentList[d].toString() + "\n";
		}
		
		return classStr;
	}
}

