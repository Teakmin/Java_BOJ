package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      S = S.toLowerCase();
      char[] Alpha = new char[S.length()];
      int[] count = new int[26];
      int[] arr = new int[26];

      
      for (int i =0; i < S.length(); i++) {
         Alpha[i] = S.charAt(i);                           //Alpha에 char로 넣기
      }
      for (int i=0; i < S.length(); i++) {
         count[(int)Alpha[i]-97]++;
      }
      
      int max = 0;
      for (int i=0; )
      }
      if (count[0]==count[1]) {
    	  System.out.println("?");
      }else {
    	  System.out.println();
      }
      
      for (int i= 0; i < count.length; i++) {
    	  System.out.println(count[i]);
      }
      
//      if (count[25]==count[24]) {
//         System.out.println("?");
//         System.out.println(count[25] + count[24]);
//      }else {
//         System.out.println("수정");
//      }
   }
}