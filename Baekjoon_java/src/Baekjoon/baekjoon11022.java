package Baekjoon;

import java.util.Scanner;

public class baekjoon11022 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	int i = 0;
	while (i < T) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println("Case #" + (i + 1) + ": " + A + " + " + B + " = " + (A + B));
		i++;
	}
			
}
}