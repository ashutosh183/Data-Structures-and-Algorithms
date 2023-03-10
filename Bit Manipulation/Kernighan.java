// 1. You are given a number n.
// 2. You have to count the number of set bits in the given number.

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    //write your code here
    int cnt  = 0;
    while(n > 0){
        int rsb = n & (-n);
        n = n - rsb;
        cnt++;
    }
    
    System.out.println(cnt);
  }

}