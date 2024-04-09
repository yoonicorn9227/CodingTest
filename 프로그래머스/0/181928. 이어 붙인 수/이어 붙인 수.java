class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        // 풀이
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < num_list.length; i++) {
			if(num_list[i]%2==1) {
				System.out.println("홀수 : "+num_list[i]);
				sb1.append(num_list[i]);
			} else {
				System.out.println("짝수 : "+num_list[i]);
				sb2.append(num_list[i]);
				
			}//if - else(짝홀구분)
			
			
		} // for
		String result1 = sb1.toString(); //홀수 숫자문자열 합
		String result2 = sb2.toString(); //짝수 숫자문자열 합
		int newNum1 = Integer.parseInt(result1);
		int newNum2 = Integer.parseInt(result2);
		int total = newNum1 + newNum2;
		answer = total;
		
        return answer;
    }
}