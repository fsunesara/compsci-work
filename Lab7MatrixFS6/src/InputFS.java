/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		Lab7MatrixFS6
 * Program Filename(s):		Lab7MatrixFS6.java, InputFS.java, MultiplyFS.java,
 * 							WriteFS.java
 * I/O Files used:			matrices.txt, FirstSet.txt, SecondSet.txt
 * I/O Files changed: 		FirstSet.txt, SecondSet.txt
 */

import static java.lang.System.out;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InputFS 
{
	public ArrayList<ArrayList<int[]>> input()
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
				
				temp = temp.replaceAll("\\[", "").replaceAll("\\]", "");
				vals = temp.split("-");
				
				for(int a = 0; a < vals.length; a++)
				{
					rowStr = vals[a].split(",");
					row = new int[rowStr.length];
					
					for(int b = 0; b < rowStr.length; b++)
					{
						row[b] = Integer.parseInt(rowStr[b]);
					}
					
					tempMat.add(a, row);
				}
				
				matrices.add(currentMatrix, new ArrayList<int[]>(tempMat));
				tempMat.clear();
				currentMatrix++;
			}
			
			firstMat.close();
		}
		catch(Exception e)
		{
			out.println("Input error: " + e);
		}

		return matrices;
	}
}
