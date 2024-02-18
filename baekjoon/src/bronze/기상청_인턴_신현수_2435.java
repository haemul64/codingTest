package bronze;

import java.io.IOException;
import java.util.Scanner;

public class 기상청_인턴_신현수_2435 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] temp = new int[N];
		int[] acc = new int[N];
		temp[0] = sc.nextInt();
		acc[0] = temp[0];

		for (int i = 1; i < N; i++) {
			temp[i] = sc.nextInt();
			acc[i] = acc[i - 1] + temp[i];
		}

		int max = acc[K - 1];
		for (int i = K; i < N; i++) {
			int ondo = acc[i] - acc[i - K];
			max = Math.max(max, ondo);
		}

		System.out.println(max);
	} // main
}
