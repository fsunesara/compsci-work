/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Jan 19, 2016
 * Last Update:				Feb 02, 2016
 * 
 * Project Filename:		Lab7MatrixFS6
 * Program Filename(s):		Lab7MatrixFS6.java, InputFS.java, MultiplyFS.java,
 * 							WriteFS.java
 * I/O Files used:			matrices.txt, FirstSet.txt, SecondSet.txt
 * I/O Files changed: 		FirstSet.txt, SecondSet.txt
 *
 * Function:	The program will create an application which intakes matrices
 * 				from a file, multiplies them, and then reprints them in a new
 * 				file. Multiplication of arrays will be done in dot product
 * 				format.
 * 
 * Formulas: 	None
 * 
 * Algorithm:
 *		1. Obtains matrices from an input file and places them into arrays
 *		2. Multiplies two sets of matrices
 *		3. Writes the new matrix or failure message to an output file
 */

import java.util.ArrayList;

public class Lab7MatrixFS6 
{
	ArrayList<ArrayList<int[]>> matrices;
	String[] vals;
	String[] rowStr;
	int[] row;
	
	
	int currentMatrix = 0;
	String temp;
	boolean canMulti = true;
	
	/**
		Purpose: 
		Preconditions: 
		Postconditions: 
	 */
	public static void main(String[] args) 
	{
		InputFS input = new InputFS();
		MultiplyFS multiply = new MultiplyFS();
		
		ArrayList<ArrayList<int[]>> matrices = input.input();
		multiply.multiply(matrices.get(0), matrices.get(1), "FirstSet.txt");
		multiply.multiply(matrices.get(2), matrices.get(3), "SecondSet.txt");
	}
}
