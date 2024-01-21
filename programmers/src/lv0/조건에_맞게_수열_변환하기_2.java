package lv0;

public class 조건에_맞게_수열_변환하기_2 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181881
	// +3

	class Solution {
	    public int solution(int[] arr) {
	        // 조건: 50보다 작거나 같은 짝수 or 50보다 큰 홀수로만 이루어진 배열일 때,
	        // 더이상 조건에 맞는 수가 없으므로 연산이 발생하지 않는다.
	        
	        int x = -1; // 반복 횟수
	        int cnt = 0; // 조건을 만족하는 원소 개수를 카운트
	        
	        while(true) {
	        // 0. int x 에 연산 반복 횟수를 저장한다. (반복 횟수를 1회 더한다)
	            x++;
	            cnt = 0;
	            
	        // 1. arr의 각 원소가 위 조건을 만족하는지 확인(cnt로 카운트). 모두 만족하면 반복문 종료
	            for(int i=0; i<arr.length; i++) {
	                if(arr[i]<=50 && arr[i]%2==0 || arr[i]>50 && arr[i]%2!=0)
	                     cnt++;
	            }
	            
	            if(cnt == arr.length) break;
	            
	        // 2. 만족하지 않는 경우, 규칙에 따른 연산 결과를 저장
	            for(int i=0; i<arr.length; i++) {
	                if(arr[i]>=50 && arr[i]%2==0)
	                    arr[i] /= 2;
	                else if(arr[i]<50 && arr[i]%2!=0)
	                    arr[i] = arr[i]*2+1;
	            }
	        }
	        
	        return x;
	    }
	}
}
