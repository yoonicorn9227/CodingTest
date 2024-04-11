class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
		
        //풀이
		int wordLength = control.length(); // control문자열 길이
		int WselectLength = control.replace("w", "").length();
		int SselectLength = control.replace("s", "").length();
		int DselectLength = control.replace("d", "").length();
		int AselectLength = control.replace("a", "").length();

		int WordCount_w = wordLength - WselectLength; // "w" 글자 갯수 || n은 +1
		int WordCount_s = wordLength - SselectLength; // "s" 글자 갯수 || n은 -1
		int WordCount_d = wordLength - DselectLength; // "d" 글자 갯수 || n은 +10
		int WordCount_a = wordLength - AselectLength; // "a" 글자 갯수 || n은 -10
		
		for(int w=0; w<WordCount_w; w++) {
			n+=1;
		}
		
		for(int s=0; s<WordCount_s; s++) {
			n-=1;
		}
		
		for(int d=0; d<WordCount_d; d++) {
			n+=10;
		}
		
		for(int a=0; a<WordCount_a; a++) {
			n-=10;
		}
		
		//System.out.println("control에 입력된 최종 n값 : "+n);
		
		answer = n;
        
        
        return answer;
    }
}