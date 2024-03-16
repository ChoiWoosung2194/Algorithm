class Solution {
    public int solution(int hp) {
        int answer = 0;
        int cnt = 0;
        //장군 5공격 , 병정 3, 일 1
        //hp에서 5로 나눈 나머지 값 , 그 나머지값 3으로 나눈 값 , 그 나머지 1로 나눈 값
       cnt +=(hp /5);
        hp %= 5;
        cnt+=(hp/3);
        hp %= 3;
        cnt+=(hp/1);
        
            
        
        return cnt;
    }
}