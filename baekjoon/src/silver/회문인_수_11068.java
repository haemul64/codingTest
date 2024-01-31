package silver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class 회문인_수_11068 {
	public static boolean checkPalindromic(String num) {
		// 좌우 대칭을 끝과 끝부터 차례대로 비교해서 한 번이라도 다르면 false 리턴 
		int len = num.length();
		boolean isPalindromic = true;

		for (int i = 0; i < len / 2; i++) {
			char front = num.charAt(i);
			char rear = num.charAt(len - 1 - i);
			if(front != rear) {
				isPalindromic = false;
				break;
			}
		}
		return isPalindromic;
	}

	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);

		char[] number = new char[64];
		for (int i = 0; i < 26; i++)
			number[i] = (char) ('A' + i);
		for (int i = 26; i < 52; i++)
			number[i] = (char) ('a' + i - 26);
		for (int i = 52; i < 62; i++)
			number[i] = (char) ('0' + i - 52);
		number[62] = '+';
		number[63] = '/';
		
		int T = sc.nextInt(); // 테스트케이스 개수

		while (T-- > 0) {
			int data = sc.nextInt();
			boolean isPalindromic = false;

			// 1. 2 ~ 64진법으로 변환하면서
			for (int B = 2; B <= 64; B++) {
				int N = data;
				String num = "";
				while (N > 0) {
					num = number[N % B] + num;
					N /= B;
				}
				// 2. 회문수인지 확인
				if (checkPalindromic(num)) {
					isPalindromic = true;
					break;
				}
			}
			System.out.println(isPalindromic ? "1" : "0");
		}
	} // main
}
