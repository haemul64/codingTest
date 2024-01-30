package bronze;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class 유레카_이론_10448 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); // 테스트 케이스의 개수

		// 각각의 테스트케이스에 대하여,
		Loop: while (t-- > 0) {
			int K = sc.nextInt();
			int n1 = 2; // 공차의 첫번째 항은 2
			for (int t1 = 1; t1 < 1000; t1 += n1++) {
				int n2 = 2;
				for (int t2 = 1; t2 < 1000; t2 += n2++) {
					int n3 = 2;
					for (int t3 = 1; t3 < 1000; t3 += n3++) {
						if (t1 + t2 + t3 == K) {
							System.out.println(1);
							continue Loop;
						}
					}
				}
			}
			System.out.println(0);
		}
	} // main
}
