class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int [n];
        int x = 0;
        for(int i = 0; i < n; i++){
            answer[x] = num_list[i];
            x++;
        }
        return answer;
    }
}