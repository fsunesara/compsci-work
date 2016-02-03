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
import java.io.*;

public class WriteFS 
{
	public void write(boolean canMulti, int[][] multiMat, String fileName)
	{
		try
		{	
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
			
			if(canMulti == true)
			{
				bw.write("[");
				
				for(int a = 0; a < multiMat.length; a++)
				{
					for(int b = 0; b < multiMat[a].length; b++)
					{
						bw.write(multiMat[a][b] + " ");
					}
					
					if(a != multiMat.length - 1)
					{
						bw.newLine();
					}
						
				}
				
				bw.write("]");
			}
			else
			{
				bw.write("Matrices could not be multiplied");
			}
			
			bw.close();
		}
		catch(Exception e)
		{
			out.println("Output error:" + e);
		}
	}
}
