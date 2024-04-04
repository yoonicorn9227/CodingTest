class Solution {
	public int solution(int n) {
		int answer = 0;

		int sumArry=0;
		if (n % 2 == 1) {
			for (int i = n; i > 0; i=i-2) {
				answer += i;
			} // for
		} else {
			for(int i=n; i>0; i=i-2) {
				answer += Math.pow(i, 2);
			}
		} // if-else
		System.out.println(answer);
		return answer;
	}
}