package lv0;

public class 양꼬치 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120830
	}

	class Solution {
	    public int solution(int n, int k) {
	        int sum = 0; // 지불 금액
	        int freeDrink = n / 10; // 음료수 서비스 개수
	        
	        sum = (n * 12000) + ((k-freeDrink) * 2000);
	        
	        return sum;
	    }
	}
}
