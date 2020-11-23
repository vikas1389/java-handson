import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Stack {

        private int array[];
        private int top;
        private int capacity;
        
        Stack(int capacity){
            this.capacity = capacity;
            this.array = new int[capacity] ;
            this.top = -1;
        }
        
        public boolean isFull(){
            return top== capacity-1;
        }
        public boolean isEmpty(){
            return top == -1;
        }
        public void push(int item){
            if (isFull()){
                throw new RuntimeException("Stack is Full");
            }
            array[++top]= item;
        }
        
        public int pop()
        {
            if (isEmpty()){
                throw new RuntimeException("Stack is Empty");
            }
            return array[top--];
        }
        
        public int peek(){
            
            if (isEmpty()){
                throw new RuntimeException("Stack is Empty");
            }
            return array[top];
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
        
        Stack s = new Stack(7);
        
        s.push(8);
        s.push(11);
        
        System.out.println("Pop item is: " + s.pop());
        
   }
}
