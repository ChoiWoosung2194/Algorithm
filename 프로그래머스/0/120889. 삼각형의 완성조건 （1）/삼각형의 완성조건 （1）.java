import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int x = sides[0]+sides[1];
        if(sides[2]<x){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }
}