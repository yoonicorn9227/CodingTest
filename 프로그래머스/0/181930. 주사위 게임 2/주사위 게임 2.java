class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        // 풀이
		if (a != b && b != c && a != c) {
			int total = a+b+c;
			answer=total;
		} else if (a != b && a != c && b == c || a==b && a!=c && b!=c || a==c && a!=b && b!=c) {
			int sum1 = a+b+c;
			int sum2 = (int) (Math.pow(a, 2))+(int) (Math.pow(b, 2))+(int) (Math.pow(c, 2));
			int total = sum1*sum2;
			answer=total;
		} else if (a == b && b == c && a == c) {
			int sum1 = a+b+c;
			int sum2 = (int) (Math.pow(a, 2))+(int) (Math.pow(b, 2))+(int) (Math.pow(c, 2));
			int sum3 = (int) (Math.pow(a, 3))+(int) (Math.pow(b, 3))+(int) (Math.pow(c, 3));
			int total = sum1*sum2*sum3;
			answer=total;
		} // if-else
        
        return answer;
    }
}