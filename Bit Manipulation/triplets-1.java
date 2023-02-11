// 1. You are given an array(arr) of N numbers.
// 2. You have to select three indices i,j,k following this condition -> 
//       0 <= i < j <= k < arr.length
// 3. Two numbers X and Y as defined as :
//       X = arr[i] ^ arr[i+1] ^ ... ^ arr[j - 1]
//       Y = arr[j] ^ arr[j+1] ^ ... ^ arr[k]
// 4. You have to print the number of triplets where X is equal to Y.


import java.io.*;
import java.util.*;

public class Main {

      public static void solution(int[] arr){
            //write your code here
            int cnt = 0;
            
            for(int i=0; i<arr.length; i++){
                int xor = arr[i];
                
                for(int k=i+1; k<arr.length; k++){
                    xor = xor ^ arr[k];
                    
                    if(xor == 0){
                        cnt += (k-i);
                    }
                }
            }
            System.out.println(cnt);
            
    }
      public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        solution(arr);
    }
      
      
}