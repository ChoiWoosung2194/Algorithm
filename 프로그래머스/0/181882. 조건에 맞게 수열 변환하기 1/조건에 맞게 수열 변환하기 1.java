class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int [arr.length];
        int x =0;
        for(int i = 0; i<answer.length; i++){
            if(arr[i]>=50 && arr[i]%2 ==0 ){
               answer [x] = arr[i]/2;
            }else if(arr[i]<50 && arr[i]%2 == 1){
                answer [x] = arr[i]*2 ;
            }else{
                answer[x] = arr[i];
            }
            x++;
        }
        return answer;
    }
}