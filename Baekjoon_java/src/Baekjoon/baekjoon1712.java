package Baekjoon;

import java.util.Scanner;

public class baekjoon1712 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int sale=0;
      int count = 0;
      
      if (C <= B){
    	  System.out.println(-1);
      }else{
	      for (sale=1; A >=(C-B)*sale; sale++) {
	    	  count++;
	      }System.out.println(count+1);
	   }
	}
}