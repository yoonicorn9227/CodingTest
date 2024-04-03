class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        
        String str3 = str1+str2;
        
        int str3Num = Integer.parseInt(str3);
        
        int num = 2*a*b;
        
        
        if(str3Num<num) {
        	answer=num;
        }else {
        	answer=str3Num;
        }//if-else
        
        return answer;
    }
}
