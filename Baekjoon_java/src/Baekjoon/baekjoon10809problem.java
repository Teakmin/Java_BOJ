package Baekjoon;
//                                              ��� �߸� �ƴ��� �� �𸣰��� + �˰������� �� �����ϰ� �̻��� �� ����
import java.util.Scanner;

public class baekjoon10809problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] alphabet = {'a','b','c', 'd','e','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y'};
		int[] Nums = new int[26];
		for (int i = 0; i < 26; i++) {
			Nums[i] = -1;
		}
		
		char[] Words = new char[S.length()];
		for (int i=0; i < S.length(); i++) {
			Words[i] = S.charAt(i);
		}
		
		for (int i=0; i < S.length(); i++) {
			for (int j=0; j < 26; j++) {
				if (Words[i] == alphabet[j]) {
					Nums[j]++;
				} 
			}
		}
		
		for(int i= 0; i < S.length(); i++) {
		System.out.print(Nums[i]);
		}
	}
}