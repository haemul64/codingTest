package silver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class 설탕_배달_2839 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);

		// 아래부터 풀이 작성
		int N = sc.nextInt();
		int remain = N;
		int five = 0;
		int three = 0;

		// 1. 5kg 봉지를 먼저 할당
		five = remain / 5;
		remain %= 5;

		// 2. 3kg 봉지를 딱 맞게 배달할 수 있는지 확인한다.
		// 2-1. 배달할 수 없다면, 할 수 있을 때까지 5kg 봉지 할당량을 줄이고 3kg 봉지 할당량을 늘린다.
		while (remain % 3 != 0 && remain < N) {
			remain += 5;
			five--;
		}

		if (remain % 3 != 0) {
			System.out.println(-1);
			return;
		}

		three = remain / 3;
		System.out.println(five + three);
	} // main
}
