/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		GradeBook2FS6
 * Program Filename(s):		StudentRunner.java, Student.java, Grades.java, Grade.java 
 * I/O Files used:			None
 * I/O Files changed: 		None
 */

public class Student
{
	  private String stuName;
	  private Grades stuGrades; 

	  public Student(String n, String grades)
	  {
		  setName(n);
		  stuGrades = new Grades(grades);
	  }
	  
	  /**
	  		Purpose: Sets the value for name
	  		Preconditions: String stuName
	  		Postconditions: Assigns name to stuName
	   */
	  public void setName(String name)
	  {
		  stuName = name;
	  } 

	  /**
	  		Purpose: Adds a grade to the student's grade list 
	  		Preconditions: Grades stuGrades
	  		Postconditions: Creates a grade in stuGrades
	   */
	  public void setGrade(int spot, double grade)
	  {
		  stuGrades.add(spot, grade);
	  } 

	  /**
	  		Purpose: Returns the number of grades the student has
	  		Preconditions: None
	  		Postconditions: Returns the length of stuGrades
	   */
	  public int getNumGrades()
	  {
	    return stuGrades.getNumGrades();
	  }
	  
	  /**
	  		Purpose: Returns the sum of all the student's grades 
	  		Preconditions: None
	  		Postconditions: Returns the sum of all values in stuGrades
	   */
	  public double getSum()
	  {
	    return stuGrades.getSum();
	  }

	  /**
	  		Purpose: Returns the average of all the student's grades
	  		Preconditions: None
	  		Postconditions: Returns the sum of the grades divided by the number
	  			of grades
	   */
	  public double getAverage()
	  {
	    return getSum() / getNumGrades();
	  }

	  /**
	  		Purpose: Returns the student's average without their lowesr grade 
	  		Preconditions: None
	  		Postconditions: Returns the sum minus the lowest grade divided by the
	  			number of grades minus 1
	   */
	  public double getAverageMinusLow()
	  {
	    return (getSum() - getLowGrade()) / (getNumGrades() - 1);
	  } 

	  /**
	  		Purpose: Returns the student's highest grade 
	  		Preconditions: None
	  		Postconditions: Returns the highest value in stuGrades
	   */
	  public double getHighGrade()
	  {
	    return stuGrades.getHighGrade(); 
	  } 

	  /**
	  		Purpose: Returns the student's lowest grade 
	  		Preconditions: None
	  		Postconditions: Returns the lowest value in stuGrades
	   */
	  public double getLowGrade()
	  {
	    return stuGrades.getLowGrade();
	  }
	  
	  /**
	  		Purpose: Returns the student's name
	  		Preconditions: None
	  		Postconditions: Returns stuName
	   */
	  public String getName()
	  {
		  return stuName;
	  }
	  
	  public String toString()
	  {
		  return stuName + " = " + stuGrades + "\t" + getAverage();
	  }

}