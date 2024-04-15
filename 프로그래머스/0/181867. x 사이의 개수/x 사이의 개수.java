class Solution {
	public int[] solution(String myString) {

		String[] spiltStr = myString.split("x", myString.length());
		int[] answer = new int[spiltStr.length];
		for (int i = 0; i < spiltStr.length; i++) {
			answer[i] = spiltStr[i].length();
			System.out.println(answer[i]);
		}

		return answer;
	}// solution
}// CLASS