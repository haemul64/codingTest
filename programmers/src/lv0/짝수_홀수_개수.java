package lv0;

public class 짝수_홀수_개수 {

	public static void main(String[] args) {
		//https://school.programmers.co.kr/learn/courses/30/lessons/120824
	}

	class Solution {
	    public int[] solution(int[] num_list) {
	        int[] answer = {0, 0};
	        
	        for(int i : num_list) {
	            if(i%2==0) { // 짝수
	                answer[0]++;
	            }
	            else { // 홀수
	                answer[1]++;
	            }
	        }
	        
	        return answer;
	    }
	}
}

// 수학적 아이디어
// answer[num_list[i]%2]++;
