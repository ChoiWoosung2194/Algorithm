class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int [arr.length];
        int x = 0;
        for(int i = 0; i < answer.length; i++){
        if(k % 2 == 1){
            answer[x] = arr[i]* k;
            x++;
        }else{
            answer[x] = arr[i]+k;
            x++;
        }
        }
        return answer;
    }
}