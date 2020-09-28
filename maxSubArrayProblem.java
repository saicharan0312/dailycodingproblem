/* 
Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum values of each subarray of length k.

For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8], since:

10 = max(10, 5, 2)
7 = max(5, 2, 7)
8 = max(2, 7, 8)
8 = max(7, 8, 7)
Do this in O(n) time and O(k) space. You can modify the input array in-place and you do not need to store the results.
You can simply print them out as you compute them. 
*/

import java.io.*;
import java.util.*;
class maxSubArrayProblem
{
   public static void main(String[] args)
   {
       int i = 0;
       Scanner in = new Scanner(System.in);
       String str = in.nextLine(); 
       int k = in.nextInt(); 
       String[] integerStrings = str.split(" ");  
       int[] integers = new int[integerStrings.length];  
       for (i = 0; i < integers.length; i++)
       { 
          integers[i] = Integer.parseInt(integerStrings[i]);  
       }
       int n = integers.length;
       maxSubArray(integers,n,k);
   }
   public static void maxSubArray(int arr[], int n,int k)
   {
        Deque<Integer> Qi = new LinkedList<Integer>(); 
        int i; 
        for (i = 0; i < k; ++i) 
        { 
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) 
            {
                Qi.removeLast(); 
            }
            Qi.addLast(i); 
        } 
        for (i=k ; i < n; ++i)
        {  
            System.out.print(arr[Qi.peek()] + " "); 
            while ((!Qi.isEmpty()) && Qi.peek() <= i - k) 
            {
                Qi.removeFirst();
            } 
            while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()]) 
            {
                Qi.removeLast(); 
            }
            Qi.addLast(i); 
        } 
        System.out.print(arr[Qi.peek()]);
   }
}