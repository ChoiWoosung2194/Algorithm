class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int cnt = 0;
        int cnt2 = 0;
        if(arr1.length > arr2.length ){
            answer = 1;
        }else if(arr1.length < arr2.length ){
            answer = -1;
        }else {
            for(int i = 0; i< arr1.length; i++){
                cnt += arr1[i];
            }
            for(int i = 0; i< arr2.length; i++){
                cnt2 += arr2[i];
            }
            if(cnt > cnt2){
                answer = 1;
            }else if(cnt<cnt2){
                answer = -1;
            }else{
                answer = 0;
            }
        }
        return answer;
    }
}