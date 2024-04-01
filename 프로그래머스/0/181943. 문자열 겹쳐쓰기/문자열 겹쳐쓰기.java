class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
    
        int sRange=my_string.length()-overwrite_string.length();
        if(overwrite_string.length()>=1 && overwrite_string.length()<=1000 && my_string.length()>=1 && my_string.length()<=1000 && overwrite_string.length()<=my_string.length()) {
        	if(s>=0&& s<=sRange) {
        		String str1=my_string.substring(0,s);
        		String str2=overwrite_string;
        		String str3 =my_string.substring(s+overwrite_string.length());
        		System.out.println(str1);
        		System.out.println(str2);
        		System.out.println(str3);
        		System.out.println(str1+str2+str3);
                	answer=str1+str2+str3;
        	}
        
        }
        
		return answer;
    }
}