package lv0;
import java.util.Scanner;

public class 홀짝_구분하기 {

	// https://school.programmers.co.kr/learn/courses/30/lessons/181944

	public class Solution {
	    public void solution(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        
	        if(n%2>0)
	            System.out.print(n + " is odd");
	        else
	            System.out.print(n + " is even");
	    }
	}
}

// 삼항연산자 활용 
// System.out.print(n + " is " + (n%2==0 ? "even" : "odd"));