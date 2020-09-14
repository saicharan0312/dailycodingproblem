/* given an array of integers, return a new array such that each at index i of the new array is the product of all the numbers in the original array except the one at i
 * without using division operatot */
import java.io.*;
import java.util.*;
class Product
{
	   public static void main(String[] args)
		      {
			             int i = 0;
				            Scanner in = new Scanner(System.in);
					           String str = in.nextLine();   
						          String[] integerStrings = str.split(" ");  
							         int[] integers = new int[integerStrings.length];  
								        for (i = 0; i < integers.length; i++)
										       { 
											                 integers[i] = Integer.parseInt(integerStrings[i]);  
													        }
									       int n = integers.length;
									              SumOfTwoFunc(integers,n);
										         }
	      public void SumOfTwoFunc(int arr[], int n)
		         {
				       int i=0,backproduct=1;
				             int[] Rarray =  new int[n];
					           if( n <= 1 )
							         {
									          return 0;   
										        }
						         Rarray[0] = arr[0];
							       for(i=1;i<n;i++)
								             {
										               Rarray[i] = arr[i] * Rarray[i-1];  
											             }
							             for(i=n-1; i>0; i--)
									           {
											            Rarray[i] = Rarray[i-1] * backproduct;
												             backproduct = backproduct * arr[i]; 
													           }
								           Rarray[0] = product;
									         return Rarray;
										    }
}
