// 1. You are given an array of length n containing numbers from 1 to n.
// 2. One number is present twice in array and one is missing.
// 3. You have to find these two numbers.


import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n; i++){
      arr[i] = scn.nextInt();
    }
    solution(arr);
  }

  public static void solution(int[] arr){
   //write your code here
   
   int n = arr.length;
   int xory = 0;
   for(int val: arr){
       xory ^= val;
   }
   
   for(int i=1; i<=n; i++){
       xory ^= i;
   }
   
   int rsb = xory & (-xory);
   
   int x = 0;
   int y = 0;
   
   for(int val: arr){
       if((val & rsb) == 0){
           x ^= val;
       }else{
           y ^= val;
       }
   }
   for(int i=1; i<=n; i++){
       if((i & rsb) == 0){
           x ^= i;
       }else{
           y ^= i;
       }
   }
   
   for(int val: arr){
       if(y == val){
           System.out.println("Missing Number -> "+x);
           System.out.println("Repeating Number -> "+y);
           break;
       }else{
           System.out.println("Missing Number -> "+y);
           System.out.println("Repeating Number -> "+x);
           break;
       }
   }
  }

}
