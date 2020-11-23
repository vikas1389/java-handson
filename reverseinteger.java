import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 
 
 public static int reverseManually(int number){
     
     int reversed = 0;
     
     while (number !=0){
         reversed = reversed * 10 + number % 10;
         
         number = number/10;
         
     }
     
     return reversed;
 }
 
 public static void main(String[] args) {
        int number = 54321;
        
       System.out.println("Reverse Number is: " +  reverseManually(number));
        
   }
}
