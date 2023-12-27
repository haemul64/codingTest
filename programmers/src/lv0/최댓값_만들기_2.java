package lv0;
import java.util.Arrays;

public class 최댓값_만들기_2 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120862
	// +5

	class Solution {
	    public int solution(int[] numbers) {
	        int m_m=0, m_p=0, len=numbers.length;
	        
	        Arrays.sort(numbers);
	    
	        m_m = numbers[0]*numbers[1];
	        m_p = numbers[len-1]*numbers[len-2];
	        
	        return m_p >= m_m ? m_p : m_m;
	    }
	}
}
