package silver;

import java.io.IOException;
import java.util.Scanner;

public class 수들의_합_5_2018 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int s = 1, e = 1; // start, end
		int sum = e;
		int cnt = 0;
		while (e <= N) {
			if (sum == N) {
				cnt++;
				sum += ++e;
			} else if (sum > N)
				sum -= s++;
			else if (sum < N)
				sum += ++e;
		}
		System.out.println(cnt);
	} // main
}
