package bronze;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class 진법_변환_2_11005 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);

		// 2 ~ 36 진법에서 사용할 수 있는 숫자 배열 정의 
		char[] number = new char[36];
		for(int i=0; i<10; i++)
			number[i] = (char)(i + '0');
		for(int i=10; i<number.length; i++)
			number[i] = (char)(i - 10 + 'A');
		
		int N = sc.nextInt();
		int B = sc.nextInt();
		String num = "";
		
		while(N > 0) {
			num = number[N % B] + num;
			N /= B;
		}
		
		System.out.println(num);
	} // main
}
