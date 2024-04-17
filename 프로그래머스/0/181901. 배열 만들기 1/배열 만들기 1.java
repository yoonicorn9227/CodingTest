
import java.util.*;



class Solution {
    public int[] solution(int n, int k) {
    
        ArrayList<Integer> list = new ArrayList<>();        
        
       for(int i=1; i<=n; i++) {
    	   if(i%k==0) {
    		   
    		   list.add(i);
    	   }//if
       }//for(배열에 들어갈 값)
    	int[] answer = new int[list.size()]; //배열 사이즈 정의
        
       for(int i=0; i<list.size(); i++) {
    	   answer[i]= list.get(i);
    	   
       }// for(배열로 형성)
       System.out.println(Arrays.toString(answer));
        return answer;
    }
}//CLASS