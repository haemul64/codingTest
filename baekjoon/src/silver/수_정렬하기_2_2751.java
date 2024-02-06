package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 수_정렬하기_2_2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Integer[] numbers = new Integer[N];

		for (int i = 0; i < N; i++)
			numbers[i] = Integer.parseInt(br.readLine());

		Arrays.sort(numbers);

		for (int i = 0; i < N; i++)
			bw.write(numbers[i] + "\n");
		bw.flush();
	} // main
}
