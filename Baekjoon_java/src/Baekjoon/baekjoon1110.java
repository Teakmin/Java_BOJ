package Baekjoon;

import java.util.Scanner;

public class baekjoon1110 {
	public static void main( String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();  //A = 26
		int i = 0;				
		int NewNum = -1;		
				
		while (NewNum!=A) {
			if (i == 0) {
				int x = A/10;     //x = 2
				int y = A%10;     //y = 6
				
				NewNum = (y*10) + ((x + y)%10);   //NewNum = 68
				i++;
			}else {
				int x = NewNum/10;     //x = 6
				int y = NewNum%10;     //y = 8
				
				NewNum = (y*10) + ((x + y)%10);   //NewNum = 84
				i++;
			}
		}System.out.println(i);
	}
}

