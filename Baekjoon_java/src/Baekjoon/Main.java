package Baekjoon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int t = 0;
		while(t < T) {
			int R = sc.nextInt();
			String S = sc.next();
			
			for (int i=0; i < S.length(); i++) {
				for (int j=0; j < R; j++) {
					System.out.print(S.charAt(i));
				}
				
			}System.out.println();
			t++;
		}
	}
}

