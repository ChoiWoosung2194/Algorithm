import java.util.*;
class Solution {
    public String solution(String my_string, int[] index_list) {
       StringBuilder result = new StringBuilder();

        for (int index : index_list) {
            // 주어진 인덱스가 문자열 범위를 벗어나지 않는지 확인
            if (index >= 0 && index < my_string.length()) {
                // 주어진 인덱스의 글자를 결과에 추가
                result.append(my_string.charAt(index));
            }
        }

        return result.toString();
    }
}