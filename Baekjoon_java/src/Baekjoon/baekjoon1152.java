package Baekjoon;

import java.util.Scanner;

public class baekjoon1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int count = 0;
		
		for (int i =0; i < S.length(); i++) {
			if (S.charAt(i)==' ') {
				count++;
			}
		}
		if(S.charAt(0)==' ') {
			count--;
		}
		if (S.charAt(S.length()-1)==' ') {
			count--;
		}
		System.out.println(count+1);
	}
}