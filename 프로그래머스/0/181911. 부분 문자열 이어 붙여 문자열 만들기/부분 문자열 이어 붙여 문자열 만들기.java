class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        // 풀이
		String newWord="";
		String sumWord;
		for (int i = 0; i < my_strings.length; i++) {
			
			newWord += my_strings[i].substring(parts[i][0],parts[i][1]+1);
		}//for(1)
		System.out.println(newWord);
		answer = newWord;
        return answer;
    }
}