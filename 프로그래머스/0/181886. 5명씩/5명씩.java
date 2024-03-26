import java.util.ArrayList;
class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> answer = new ArrayList<String>();
        for(int i = 0 ; i < names.length ; i ++) {
            if(i==0|| i%5 == 0){
            answer.add(names[i]);
            }
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}