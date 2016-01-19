/**
 * Programmer:				Faisal Sunesara
 * 
 * Project Filename:		Lab17eFS6
 * Program Filename(s):		Lab17eFS6.java, ArrayOfPrimes.java
 * I/O Files used:			None
 * I/O Files changed: 		None
 */

public class ArrayOfPrimes 
{
	//instance variables and constructors could be present, but are not necessary
	
		//getPrimeList(int numPrimes) will return an array 
		//containing the first numPrimes primes starting at 2
		public static int[] getPrimeList(int numPrimes)
		{
			int[] primes = new int[numPrimes];
			int b = 0;
			
			for(int a = 2; a <= Integer.MAX_VALUE; a++)
			{
				if(isPrime(a))
				{
					primes[b] = a;
					b++;
					
					if(b == numPrimes)
					{
						break;
					}
				}
			}
			return primes;
		}

		//getPrimeList(int numPrimes, int primeStart) will return an array 
		//containing the first numPrimes primes starting at primeStart
		public static int[] getPrimeList(int numPrimes, int primeStart)
		{
			int[] primes = new int[numPrimes];
			int c = 0;
			
			for(int d = primeStart; d <= Integer.MAX_VALUE; d++)
			{
				if(isPrime(d))
				{
					primes[c] = d;
					c++;
					
					if(c == numPrimes)
					{
						break;
					}
				}
				
			}
			
			return primes;
		}
			
		//isPrime will return true if num is prime
		//a prime number is any number only divisible by 1 and itself
		private static boolean isPrime(int num)
		{
			boolean isPrime = true;
			
			for (int e = 2; e <= num / 2; e++)
			{
				if(num % e == 0)
				{
					isPrime = false;
				}
			}
			
			return isPrime;
		}
}
