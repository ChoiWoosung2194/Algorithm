import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList();
        int x = 0;
        for(int i = 0; i< intStrs.length; i++){
            x = Integer.parseInt(intStrs[i].substring(s,s+l));
           if(x > k){
               answer.add(x);
           }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}