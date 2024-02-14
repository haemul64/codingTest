package bronze;

import java.io.IOException;
import java.util.Scanner;

public class 알람_시계_2884 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();
		int timeSec = H * 3600 + (M - 45) * 60;
		if(timeSec < 0) timeSec += 24 * 3600;
		System.out.println(timeSec / 3600 + " " + timeSec % 3600 / 60);
	} // main
}
