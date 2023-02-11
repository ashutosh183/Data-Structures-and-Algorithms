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
   
   int xory = 0;
   for(int val: arr){
       xory ^= val;
   }
   
   int rbsm = xory & (-xory);
   int x = 0, y = 0;
   for(int val: arr){
       if((val & rbsm) == 0){
           x = x ^ val;
       }else{
           y = y ^ val;
       }
   }
   
   if(x < y){
       System.out.println(x);
       System.out.println(y);
   }else{
       System.out.println(y);
       System.out.println(x);
   }
   
  }

}