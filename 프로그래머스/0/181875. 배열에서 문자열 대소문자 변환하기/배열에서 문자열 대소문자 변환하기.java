class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String [strArr.length];
        int x = 0;
        for(int i = 0; i< strArr.length ; i++){
            if(i%2==0){
               answer[x] = strArr[i].toLowerCase();
                x++;
            }else{
               answer[x] =  strArr[i].toUpperCase();
                x++;
                
            }
        }
        return answer;
    }
}