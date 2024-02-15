package silver;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class 먹을_것인가_먹힐_것인가_7795 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		while (T-- > 0) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] A = new int[N];
			int[] B = new int[M];
			for (int i = 0; i < N; i++)
				A[i] = sc.nextInt();
			for (int i = 0; i < M; i++)
				B[i] = sc.nextInt();

			Arrays.sort(B);

			int cnt = 0; // A의 각 원소 a와 B의 각 원소 b에 대하여 a > b 인 숫자쌍의 개수를 구해서, 모두 더한다.
			for (int a : A) {
				// 배열 B에서 마지막으로 a>b인 인덱스를 찾는다. (그 다음 인덱스부터는 a<=b 이므로 조건에 부합하지 않음)
				int idx = findLastEdibleIndex(B, a);
				cnt += idx + 1;
			}
			System.out.println(cnt);
		}
		System.out.println();
	}

	static int findLastEdibleIndex(int[] B, int a) {
		int idx = -1; // a>b인 경우가 없을 때, 리턴할 기본 값 (main 메서드의 cnt += idx + 1에서 0됨)
		int l = 0, r = B.length - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (B[m] < a) {
				l = m + 1;
				idx = m;
			} else
				r = m - 1;
		}
		return idx;
	}
} // Main
