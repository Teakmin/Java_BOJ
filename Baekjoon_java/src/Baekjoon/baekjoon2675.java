package Baekjoon;

import java.util.Scanner;

public class baekjoon2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int re=0; re < T; re++) {
			int times = sc.nextInt();
			String S = sc.next();
			
			for (int i=0; i < S.length(); i++) {
				for (int j=0; j < times; j++) {
					System.out.print(S.charAt(i));
				}
			}System.out.println();
		}
	}
}
