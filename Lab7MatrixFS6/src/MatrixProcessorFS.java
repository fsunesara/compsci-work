

/**
 * Programmer:				Faisal Sunesara
 * Version: 				Eclipse
 * CS: AP					Period 06
 * Date created:			Jan 26, 2016
 * Last Update:				[ADD]
 * 
 * Project Filename:		Lab7MatrixFS6
 * Program Filename(s):		MatrixProcessorFS.java, 
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

import static java.lang.System.out;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MatrixProcessorFS 
{
	public static void input()
	{
		ArrayList<ArrayList<int[]>> matrices = new ArrayList<ArrayList<int[]>>();
		ArrayList<int[]> tempMat = new ArrayList<int[]>();
		
		String[] vals;
		String[] rowStr;
		int[] row;
		
		
		int currentMatrix = 0;
		String temp;
		
		try
		{
			Scanner firstMat = new Scanner(new FileInputStream("matrices.txt"));
			
			while(firstMat.hasNextLine())
			{
				temp = firstMat.nextLine();
				
				while(temp.charAt(temp.length() - 1) != ']')
				{
					temp = temp + "-" + firstMat.nextLine();
				}
				
				out.println(temp);
				temp = temp.replaceAll("\\[", "").replaceAll("\\]", "");
				out.println(temp);
				vals = temp.split("-");
				
				for(int a = 0; a < vals.length; a++)
				{
					rowStr = vals[a].split(",");
					row = new int[rowStr.length];
					
					
					for(int b = 0; b < rowStr.length; b++)
					{
						row[b] = Integer.parseInt(rowStr[b]);
						out.println(row[b]);
					}
					
					tempMat.add(a, row);
				}
				
				matrices.add(currentMatrix, tempMat);
				currentMatrix++;
			}
			
			firstMat.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}
	
	public int[][] multiply(ArrayList<int[]> mat1, ArrayList<int[]> mat2)
	{
		int height1 = mat1.size();
		int length1 = mat1.get(0).length;
		
		int height2 = mat2.size();
		int length2 = mat2.get(0).length;
	    
		if(length1 != height2)
		{
			
		}
	
		int[][] multiMat = new int[height1][length2];
	
		for (int i = 0; i < height1; i++)
		{
			for (int j = 0; j < length2; j++)
			{
				for (int k = 0; k < length1; k++)
				{
					multiMat[i][j] += mat1.get(i)[k] * mat2.get(k)[j];
				}	
			}
		}
		return multiMat;
	}
}
