class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        for(int i = 1; i<=n; i++){
        if(i %10 == 0){
            k-=1;
        }
        }
        int sheep = 12000*n;
        int drink = 2000*k;
        answer = sheep + drink;
        return answer;
    }
}