package Baekjoon;
//                                              어디서 잘못 됐는지 잘 모르겠음 + 알고리즘이 좀 복잡하고 이상한 것 같음
import java.util.Scanner;

public class baekjoon10809problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] alphabet = {'a','b','c', 'd','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] Nums = new int[26];
		for (int i = 0; i < 26; i++) {
			Nums[i] = -1;
		}
		
		for (int i=0; i < S.length(); i++) {
			for (int j=0; j < 26; j++) {
				if (S.charAt(i) == alphabet[j]) {
					Nums[j]++;
				} 
			}
		}
		
		for(int i= 0; i < 26; i++) {
		System.out.print(Nums[i] + " ");
		}
	}
}
