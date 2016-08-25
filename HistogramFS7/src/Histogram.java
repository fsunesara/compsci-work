//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 


public class Histogram
{
	private int[] digitFreqs;
	
	public void countFreqs(int[] array)
	{
		digitFreqs = new int[10];
		
		for(int i : array)
		{
			if(i == 0){digitFreqs[0]++;}
			if(i == 1){digitFreqs[1]++;}
			if(i == 2){digitFreqs[2]++;}
			if(i == 3){digitFreqs[3]++;}
			if(i == 4){digitFreqs[4]++;}
			if(i == 5){digitFreqs[5]++;}
			if(i == 6){digitFreqs[6]++;}
			if(i == 7){digitFreqs[7]++;}
			if(i == 8){digitFreqs[8]++;}
			if(i == 9){digitFreqs[9]++;}
		}
		
		for(int a = 0; a < digitFreqs.length; a++)
		{
			System.out.println(a + "-" + digitFreqs[a]);
		}
		
		System.out.println();
	}
}