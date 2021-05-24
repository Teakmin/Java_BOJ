package Baekjoon;

import java.util.Scanner;                   // 잘 나오는 것 같은데 채점해보면 틀림, 뭐가 문제인지 잘 모르겠음

public class baekjoon2292problem {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int result;
      int number = 2;
      
      if (N ==1) System.out.println(1);
      else {
    	  for (int i = 1; i < N; i++) {
    		  if (N < number + (6 * i)) {
    			  System.out.println(i + 1);
    			  System.out.println(number + (6 * i));
    			  break;
    		  }
    		  number = number + (6 * i);
    	  }
      }
  }
}
