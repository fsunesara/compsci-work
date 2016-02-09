/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Jan 20, 2016
 * Last Update:				[ADD]
 * 
 * Project Filename:		Lab7MatrixFS6
 * Program Filename(s):		MatrixMultiplyFS.java, 
 * I/O Files used:			[ADD]
 * I/O Files changed: 		[ADD]
 *
 * Function:	[ADD]	
 * 
 * Formulas: [ADD]
 * 
 * Algorithim:
 *		1. [ADD]
 *
 */

import java.util.Scanner;
import java.io.*;

public class MatrixMultiplyFS 
{
	public void input()
	{
		int[][] matrix1;
		String[] temp;
		int[] vals;
		
		try
		{
			Scanner firstMat = new Scanner(new FileInputStream("matrices.txt"));
			
			while(firstMat.hasNext())
			{
				temp = firstMat.nextLine().split(",");
				vals = new int[temp.length];
				
				
				for(int a = 0; a < temp.length; a++)
				{
					if(temp[a].contains("["))
					{
						temp[a].replaceAll("[", "");
					}
					
					else if(temp[a].contains("]"))
					{
						temp[a].replaceAll("]", "");
					}
					
					vals[a] = Integer.parseInt(temp[a]);
				}
				
				firstMat.nextLine();
			}
			

			firstMat.close();
		}
		
		catch(Exception e)
		{
			
		}
	}
	
public static double[][] multiply(int[][] A, int[][] B)
{
	int mA = A.length;
	int nA = A[0].length;
	int mB = B.length;
	int nB = B[0].length;
        
	if (nA != mB)
	{
	        	
	}
	double[][] C = new double[mA][nB];
	for (int i = 0; i < mA; i++)
		for (int j = 0; j < nB; j++)
			for (int k = 0; k < nA; k++)
				C[i][j] += A[i][k] * B[k][j];
	return C;
	
	}
}
