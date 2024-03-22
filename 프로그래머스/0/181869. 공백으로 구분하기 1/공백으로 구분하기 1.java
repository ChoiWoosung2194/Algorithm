class Solution {
    public String[] solution(String my_string) {
        String[] x = my_string.split(" ");
        String[] answer = new String[x.length];
        for(int i = 0; i< x.length; i++){
            answer[i]=x[i];
        }
        
        return answer;
    }
}