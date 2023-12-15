package lv0;

public class 순서_바꾸기 {

	// https://school.programmers.co.kr/learn/courses/30/lessons/181891

	class Solution {
	    public int[] solution(int[] num_list, int n) {
	        int[] answer = new int[num_list.length];
	        
	        for(int i=n; i<num_list.length; i++)
	            answer[i-n] = num_list[i];
	        
	        for(int i=0; i<n; i++)
	            answer[num_list.length-n+i] = num_list[i];
	        
	        return answer;
	    }
	}
}

// 연속된 answer의 인덱스에 차례대로 값을 대입하므로 idx 변수를 따로 만들어서 관리하는 것이 낫겠다.
