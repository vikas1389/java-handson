import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static String reversewithstrinbuilder(String str)
 {
     return new StringBuilder(str).reverse().toString();
 }
 
 public static String reverseManually(String str){
     StringBuilder sb= new StringBuilder();
     
     for(int i= str.length()-1 ; i>=0 ; i--)
     {
         sb.append(str.charAt(i));
     }
     
     return sb.toString();
 }
 
 public static void main(String[] args) {
        String str = "Hello";
        
        System.out.println("With StringBuilder: " + reversewithstrinbuilder(str));
        
        System.out.println("With Manual: " + reverseManually(str));
        
   }
}
