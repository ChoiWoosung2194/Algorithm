import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];

        // 모든 접미사 추출
        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(i);
        }

        // 접미사 정렬
        Arrays.sort(answer);

        return answer;
    }

    
    }
