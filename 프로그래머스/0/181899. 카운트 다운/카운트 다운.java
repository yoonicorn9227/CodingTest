import java.util.*;

class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = {};
        
        int countDown = start - end_num+1;

        answer = new int [countDown];
        for(int i =0; i<countDown; i++) {
        	answer[i] =  start-i;
   
        }//for
                 Arrays.toString(answer); //배열로 변환
        
        
        return answer;
    }
}