/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		Lab7MatrixFS6
 * Program Filename(s):		Lab7MatrixFS6.java, InputFS.java, MultiplyFS.java,
 * 							WriteFS.java
 * I/O Files used:			matrices.txt, FirstSet.txt, SecondSet.txt
 * I/O Files changed: 		FirstSet.txt, SecondSet.txt
 */

import java.util.ArrayList;

public class MultiplyFS 
{
	public static void multiply(ArrayList<int[]> mat1, ArrayList<int[]> mat2,
			String fileName)
	{
		WriteFS write = new WriteFS();
		
		int rows1 = mat1.size();
		int cols1 = mat1.get(0).length;
		
		int rows2 = mat2.size();
		int cols2 = mat2.get(0).length;
		
	    int[][] multiMat = new int[rows1][cols2];
	    
		if(cols1 == rows2)
		{
			for (int i = 0; i < rows1; i++)
			{
				for (int j = 0; j < cols2; j++)
				{
					for (int k = 0; k < cols1; k++)
					{
						multiMat[i][j] += mat1.get(i)[k] * mat2.get(k)[j];
					}	
				}
			}
			
			write.write(true, multiMat, fileName);
		}
		else
		{
			write.write(false, multiMat, fileName);
		}
	}
}
