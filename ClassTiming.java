/* Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), find the minimum number of rooms required.
For example, given [(30, 75), (0, 50), (60, 150)], you should return 2. */

import java.io.*;
import java.util.*;
class ClassTiming
{
   public static void main(String[] args)
   {
       int i = 0;
       Scanner in = new Scanner(System.in);
       String str1 = in.nextLine();  
       String str2 = in.nextLine();  
 
       String[] integerStrings1 = str1.split(" "); 
       String[] integerStrings2 = str2.split(" "); 

       int[] integers1 = new int[integerStrings1.length]; 
       int[] integers2 = new int[integerStrings2.length];
 
       for (i = 0; i < integers2.length; i++)
       { 
          integers1[i] = Integer.parseInt(integerStrings1[i]);  
          integers2[i] = Integer.parseInt(integerStrings2[i]);
       }
       int n = integers1.length;
       int res = minimumClasses(integers1, integers2, n);
       System.out.println(res);
   }
    static int minimumClasses(int start[], int end[], int n) 
    { 
        Arrays.sort(start); 
        Arrays.sort(end); 
  
        int class_needed = 1, result = 1; 
        int i = 1, j = 0; 
  
        while (i < n && j < n)
       { 
            if (start[i] <= end[j])
            { 
                class_needed++; 
                i++; 
            } 
            else if (start[i] > end[j])
            { 
                class_needed--; 
                j++; 
            } 
            if (class_needed > result)
            { 
                result = class_needed; 
            }
        } 
  
        return result; 
    } 

}