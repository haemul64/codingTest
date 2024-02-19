package silver;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 배열_합치기_11728 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[M];
		for (int i = 0; i < N; i++)
			A[i] = sc.nextInt();
		for (int i = 0; i < M; i++)
			B[i] = sc.nextInt();
		int a = 0, b = 0; // 포인터

		while (a < N && b < M) {
			if (A[a] < B[b])
				bw.write(A[a++] + " ");
			else
				bw.write(B[b++] + " ");
		}

		if (a <= N - 1)
			for (int i = a; i < N; i++)
				bw.write(A[i] + " ");
		else if (b <= M - 1)
			for (int i = b; i < M; i++)
				bw.write(B[i] + " ");

		bw.write("\n");
		bw.flush();
	} // main
}
