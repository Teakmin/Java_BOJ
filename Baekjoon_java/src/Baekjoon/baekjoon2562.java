package Baekjoon;

import java.util.Scanner;

public class baekjoon2562 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] Nums = {};
      
      int T = sc.nextInt();
      int i = 0;
      
      while (i < T) {
         Nums[i] = sc.nextInt();   
         i++;
      }
      System.out.println(Nums[0]);
      
      }
   }