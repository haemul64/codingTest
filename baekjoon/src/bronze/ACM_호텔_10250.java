package bronze;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ACM_호텔_10250 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		while (T-- > 0) {
			int H = sc.nextInt(); // 층 수 (행)
			int W = sc.nextInt(); // 방 수 (열)
			int N = sc.nextInt(); // N번째 손님

			int h = 0;
			int w = 0;

			if (N % H == 0) {
				h = H;
				w = N / H;
			} else {
				h = N % H;
				w = N / H + 1;
			}

			System.out.println(h + (w < 10 ? "0" : "") + w);
		}
	} // main
}
