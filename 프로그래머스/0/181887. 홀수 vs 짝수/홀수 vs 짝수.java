class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int x = 0;
        int y = 0;
        for(int i = 0; i < num_list.length; i+=2){
            x += num_list[i];
        }
        for(int i = 1; i < num_list.length; i+=2){
            y += num_list[i];
        }
        if(x>y || x == y){
            answer = x;
        }else {
            answer = y;
        }
        return answer;
    }
}