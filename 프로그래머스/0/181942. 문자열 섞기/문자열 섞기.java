class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        int str1Length = str1.length();
        int str2Length = str2.length();
        
       if(str1Length==str2Length && str1Length>=1 && str1Length<=10 && str2Length>=1 && str2Length<=10) {
    	   System.out.println(str1);
    	   System.out.println(str2);
    	   System.out.println(str1.substring(0,1));
    	   System.out.println(str2.substring(0,1));
    	   
    	   
    	   for(int i=0; i<str1Length; i++) {
    		   String result = str1.substring(i,i+1)+str2.substring(i,i+1);
    		   System.out.println(result);
    		   answer+=result;
    	   }
    	   
       }
        System.out.print("결과 : " +answer);
        
	return answer;
    }
}
