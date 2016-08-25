//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class HistogramRunner
{
	public static void main(String args[])
	{
		Histogram hist = new Histogram();
		
		int[] array = {1,5,3,4,5,5,5,4,3,2,5,5,5,3};
		hist.countFreqs(array);
		
		array =  new int[]{2, 3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};
		hist.countFreqs(array);
	}
}
