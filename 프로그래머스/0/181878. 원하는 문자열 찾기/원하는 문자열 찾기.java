class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = myString.toLowerCase();
        String str1 = pat.toLowerCase();
        if(str.contains(str1)){
            answer = 1;
        }
        return answer;
    }
}