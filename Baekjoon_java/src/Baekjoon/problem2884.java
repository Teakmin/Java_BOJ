package Baekjoon;

import java.util.Scanner;     //Integer.toString을 strH에 저장했는데 아직 int type인 것 같음. 값이 더해짐...

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