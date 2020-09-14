/* Given an array of integers, find the first missing positive integer in linear time and constant space. In other words,
 find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well. */
 
 
import java.io.*;
import java.util.*;
class FirstPositive
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
       int k = FirstPosFunc(integers,n);
       System.out.println("first positive integer is: " + k);
   }
   public static int FirstPosFunc(int arr[], int n)
   {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) 
        {
            set.add(i);
        }

        for (int i = 1; i <= arr.length; i++)
        {
            if (!set.contains(i))
            {
                return i;
            }
        }
        return arr.length + 1;
   }

   /*without using HashSet or HashMap
   public void SumOfTwoFunc(int arr[], int n)
   {
        int n = arr.length; 
        boolean[] present = new boolean[n + 1]; 
        for (int i = 0; i < n; i++) 
        {  
            if (A[i] > 0 && A[i] <= n) 
                present[arr[i]] = true; 
        } 
        for (int i = 1; i <= n; i++) 
        {
            if (!present[i]) 
            {
                return i; 
            }
        }
        return n + 1; 
   }
   */
}