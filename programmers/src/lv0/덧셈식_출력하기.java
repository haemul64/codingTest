package lv0;
import java.util.Scanner;

public class 덧셈식_출력하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181947

	public class Solution {
	    public void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();

	        System.out.printf(a + " + " + b + " = " + (a+b));
	    }
	}
}
