package Baekjoon;

import java.util.Scanner;

public class baekjoon10951 {
	public static void main( String[] args) {

	Scanner sc = new Scanner(System.in);
	
	while (sc.hasNextInt()) {
		if (sc.hasNextInt() == true) {			
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A + B);
		}else {
			break;
		}
	}
	}
}