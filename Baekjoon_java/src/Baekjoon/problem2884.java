package Baekjoon;

import java.util.Scanner;     //Integer.toString�� strH�� �����ߴµ� ���� int type�� �� ����. ���� ������...

public class problem2884 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int H = sc.nextInt();
	int M = sc.nextInt();
	
	if (M < 45) {
		if(H == 0) {
			H = 23;
			M = 60-(45-M);
			String strH = Integer.toString(H);
			String strM = Integer.toString(M);
			System.out.println(strH + strM);
		}else {
			H= H-1;  // H = 9
			M = 60-(45-M);  // M = 25
			String strH = Integer.toString(H);
			String strM = Integer.toString(M);
			System.out.println(H + M);
		}
	}else {
		M = M-45;
		String strH = Integer.toString(H);
		String strM = Integer.toString(M);
		System.out.println(H + M);
	}
	}
}