package lv0;

public class 배열_회전시키기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120844

	class Solution {
	    public int[] solution(int[] numbers, String direction) {
	        int tmp = 0;
	        int len = numbers.length;
	        
	        if(direction.equals("right")) {
	            tmp = numbers[len-1];
	            for(int i=len-1; i>0; i--)
	                numbers[i] = numbers[i-1];
	            numbers[0] = tmp;
	            return numbers;
	        }
	        
	        tmp = numbers[0];
	        for(int i=0; i<len-1; i++)
	            numbers[i] = numbers[i+1];
	        numbers[len-1] = tmp;
	        return numbers;
	    }
	}
}
