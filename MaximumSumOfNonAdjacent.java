/* Given an array of integers, find the first missing positive integer in linear time and constant space. In other words,
For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5 */
 
 
import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;
class MaximumSumOfNonAdjacent
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
       int k = MaximumSumFunc(integers,n);
       System.out.println("Maximum Sum Of Non Adjacent elemnets in an array: " + k);
   }
    static int MaximumSumFunc(int arr[], int n) 
    { 
        int old = arr[0]; 
        int new1 = 0; 
        int new2; 
        int i; 
  
        for (i = 1; i < n; i++) 
        { 
            if(old > new1) 
           {
               new2 =  old; 
           }
           else
           {
              new2 =  new1;
            } 
            old = new1 + arr[i]; 
            new1 = new2; 
        } 
        if(old > new1)
        {
           return old;
        } 
        else 
        {
             return new1;
        }
     }
}