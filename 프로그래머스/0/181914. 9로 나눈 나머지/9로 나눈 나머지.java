class Solution {
    public int solution(String number) {
        int answer = 0;
            int sum = 0;
		int num=0;
		for (int i = 0; i < number.length(); i++) {
			System.out.println(number.charAt(i));
			int num1 = Integer.parseInt(String.valueOf(number.charAt(i)));
			sum += num1;
		
		} // for
		System.out.println(sum%9);
		answer =sum%9;
	
        return answer;
    }
}