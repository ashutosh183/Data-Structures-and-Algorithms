// 1. The gray code is a binary numeral system where two successive numbers differ in only one bit.
// 2. Given a non-negative integer n representing the total number of bits in the code, print the 
//      sequence of gray code. A gray code sequence must begin with 0.
 
//  Example:
//  Input: 2
//  Output: [0,1,3,2]
//  Explanation:
//  00 - 0
//  01 - 1
//  11 - 3
//  10 - 2
//  [0,2,3,1] is also a valid gray code sequence.
//  00 - 0
//  10 - 2
//  11 - 3
//  01 - 1

 import java.util.*;
 
 public class Main {
 
    public static List<Integer> grayCode(int n) {
      //Write your code here
      List<Integer>ans = new ArrayList<>();
      if(n == 0){
          ans.add(0);
          return ans;
      }
      ans.add(0);
      ans.add(1);
      int curr = 1;
      for(int i=2; i<=n; i++){
          curr *= 2;
          for(int j = ans.size()-1; j >= 0; j--){
              ans.add(ans.get(j) + curr);
          }
      }
      
      return ans;
    }
 
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         List<Integer> ans=grayCode(scn.nextInt());
         Collections.sort(ans);
         System.out.println(ans);
     }
 }