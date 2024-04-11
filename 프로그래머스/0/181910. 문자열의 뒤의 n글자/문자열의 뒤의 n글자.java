class Solution {
	public String solution(String my_string, int n) {
		String answer = "";

		// 풀이
		int wordLeng = my_string.length(); //my_string 문자열 길이
		int cutWord = wordLeng - n; // 자르고자 하는 문자열

		answer = my_string.substring(cutWord);
		System.out.println(answer);

		return answer;
	}// solution
}// CLASS(백준)