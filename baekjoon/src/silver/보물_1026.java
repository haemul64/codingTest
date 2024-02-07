package silver;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class 보물_1026 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int[] chkB = new int[101];
		int S = 0;
		
		// A의 최솟값과 B의 최댓값, A의 2번째 최솟값과 B의 2번째 최댓값, ...
		// ...을 짝지어서 곱하면 가장 작은 S의 값을 구할 수 있다.
		
		// 1. 배열 A는 오름차순 정렬한다.
		for (int i = 0; i < N; i++)
			A[i] = sc.nextInt();
		Arrays.sort(A);

		// 2. 배열 B는 재배열하면 안 된다 -> 원소의 범위가 [0, 100]이므로 카운트 배열로 만듦
		// -> B의 최댓값부터 순서대로 A의 최솟값(A[0])과 곱함
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
			chkB[B[i]]++;
		}

		int idxA = 0;
		for (int i = 100; i >= 0; i--)
			while (chkB[i]-- > 0)
				S += i * A[idxA++];

		System.out.println(S);
	} // main
}
