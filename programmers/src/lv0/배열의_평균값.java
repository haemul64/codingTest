package lv0;

public class 배열의_평균값 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120817
	}

	class Solution {
	    public double solution(int[] numbers) {
	        double answer = 0;
	        int sum = 0;
	        
	        for(int i=0; i<numbers.length; i++) { // 확장for문 활용 가능
	            sum += numbers[i];
	        }
	        
	        answer = (double) sum / numbers.length;
	        
	        return answer;
	    }
	}
}
