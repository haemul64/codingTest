package lv0;

public class 글자_지우기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181900

	class Solution {
		public String solution(String my_string, int[] indices) {

			String[] strArr = my_string.split("");

			for (int i = 0; i < indices.length; i++)
				strArr[indices[i]] = "";

			return String.join("", strArr);
		}
	}
}