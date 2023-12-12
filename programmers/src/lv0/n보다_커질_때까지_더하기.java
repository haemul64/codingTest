package lv0;

public class n보다_커질_때까지_더하기 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/181884
	}
	
	class Solution {
	    public int solution(int[] numbers, int n) {
	        int sum = 0;
	        
	        for(int i : numbers) {
	            sum += i;
	            if(sum > n) break;
	        }
	        
	        return sum;
	    }
	}
}
