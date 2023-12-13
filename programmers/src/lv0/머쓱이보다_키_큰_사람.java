package lv0;

import java.util.Arrays;

public class 머쓱이보다_키_큰_사람 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120585
	}

	class Solution {
	    public int solution(int[] array, int height) {
	        int nOfTallPeople = 0;
	        int order = 0;
	        
	        Arrays.sort(array);
	        
	        for(int i=0; i<array.length; i++) {
	            if(array[i]>height) {
	                order = i;
	                nOfTallPeople = array.length - order;
	                break;
	            }
	        }
	        
	        return nOfTallPeople;
	    }
	}
}

// 다른 풀이
// 향상된 for문 + array[i]>height 일 때 answer에 1씩 더하기

