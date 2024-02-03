package silver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class 행운의_바퀴_2840 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);

		// 아래부터 풀이 작성
		int N = sc.nextInt(); // 바퀴의 칸 수
		int K = sc.nextInt(); // 바퀴를 돌리는 횟수

		int[] change = new int[K];
		char[] alphabet = new char[K];
		char[] wheel = new char[N];
		int idx = 0;
		for (int i = 0; i < N; i++)
			wheel[i] = '?';
		char exp = '!';
		int[] chkAlp = new int[26]; // A - Z 가 써진 배열 인덱스 저장
		for (int i = 0; i < 26; i++)
			chkAlp[i] = -1;

		for (int i = 0; i < K; i++) {
			change[i] = sc.nextInt();
			alphabet[i] = sc.next().charAt(0);

			idx += change[i];
			if (idx >= N)
				idx %= N;

			if (wheel[idx] == '?') {
				if (chkAlp[alphabet[i] - 'A'] != -1 && chkAlp[alphabet[i] - 'A'] != idx) {
					System.out.println(exp);
					return;
				}
				wheel[idx] = alphabet[i];
				chkAlp[alphabet[i] - 'A'] = idx;
			} else if (wheel[idx] == alphabet[i]) {
				continue;
			} else {
				System.out.println(exp);
				return;
			}
		}

		for (int i = idx, j = 0; j < N; i--, j++) {
			if (i < 0)
				i += N;
			System.out.print(wheel[i]);
		}
	} // main
}
