import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     static int[] TwoNumbers(int[] numbers, int target) {
      	Map<Integer, Integer> visitednumber = new HashMap<>();
          
          for (int i=0 ; i < numbers.length; i++)
          {
              int delta = target- numbers[i];
              if (visitednumber.containsKey(delta))
              {
                  return new int[] {i, visitednumber.get(delta)};
              }
              visitednumber.put(numbers[i], i);
          }
          
          return new int[] {-1,-1};
   }

 public static void main(String[] args) {
        int[] numbers = new int[] {2,4,7,9,1};
        int target = 5;
        
        int [] result = TwoNumbers(numbers, target);
        
        System.out.println("Result is: " +result[0] + ", " + result[1]);
   }
}
