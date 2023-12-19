package lv0;
import java.util.Scanner;

public class 직각삼각형_출력하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120823

	public class Solution {
	    public void solution(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        for(int i=0; i<n; i++) {
	            for(int j=0; j<i+1; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}
}
