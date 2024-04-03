class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        
        String str3 = str1+str2;
        String str4 = str2+str1;
        
        int num1 = Integer.parseInt(str3);
        int num2 = Integer.parseInt(str4);
        
           if(num1>num2) {
        	answer = num1;
        }else if(num1<num2) {
        	answer = num2;
        	
        } else if(num1==num2) {
        	answer = num1;
        	
        }
        
        
        
        return answer;
    }
}