package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon2577 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int numbers = A * B * C;
      int[] counts = new int[10];
      
      	while (numbers> 0) {
    	  counts[numbers%10]++;
    	  numbers = numbers/10;
      	}
      	for (int i = 0; i < 10 ; i++) {
      		System.out.println(counts[i]);
      	}      	
   }
   }