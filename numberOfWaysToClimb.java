/* There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.

For example, if N is 4, then there are 5 unique ways:

1, 1, 1, 1
2, 1, 1
1, 2, 1
1, 1, 2
2, 2
*/
import java.io.*;
import java.util.*;
class numberOfWaysToClimb
{ 
        static int numberOfways(int n) 
	{ 
	   int f[] = new int[n+2]; 
	   int i; 
	   f[0] = 0; 
	   f[1] = 1; 
	
           for (i = 2; i <= n; i++) 
	   { 
		f[i] = f[i-1] + f[i-2]; 
	   } 
	   return f[n]; 
	} 
	
	public static void main (String args[]) 
	{ 
                Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(numberOfways(n)); 
	} 
} 
