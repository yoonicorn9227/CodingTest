import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};

		// 풀이
		//num_list = new int [] {2,1,6};
		//num_list = new int[] { 5, 2, 1, 7, 5 };
	ArrayList<Integer> list = new ArrayList<>();
		System.out.println(num_list[0]);

		for (int i = 0; i < num_list.length; i++) {

			if (num_list[(num_list.length) - 2] < num_list[(num_list.length) - 1]) {
				System.out.println(num_list[(num_list.length - 1)] - 1);
				list.add(num_list[i]);
			} else {
				list.add(num_list[i]);
			} // if-else(기존 배열원소)	
		} // for

		if (num_list[(num_list.length) - 2] < num_list[(num_list.length) - 1]) {
			list.add(num_list[(num_list.length - 1)] - num_list[(num_list.length) - 2] );

		} else {
			list.add(num_list[(num_list.length - 1)] * 2);

		} // if - else(조건에 따른 원소값 추가)
		 
		 // ArrayList를 int 배열로 변환
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
		Arrays.toString(answer);
		System.out.println(Arrays.toString(answer));
		return answer;
	}//solution
}//CLASS(백준)
        
        
