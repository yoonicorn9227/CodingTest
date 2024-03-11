
class Solution {
    public String solution(String my_string, int k) {
        String answer = "";

        for(int z = 0; z < k; z++)
            for(int i = 0; i < my_string.length(); i++){
                answer += my_string.charAt(i);
            }

        return answer;
    }
}