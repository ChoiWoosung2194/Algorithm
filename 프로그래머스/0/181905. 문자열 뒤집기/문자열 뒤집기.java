public class Solution {
    public String solution(String my_string, int s, int e) {
        // 인덱스 s부터 e까지의 부분 문자열 추출
        String subString = my_string.substring(s, e + 1);

        // 추출한 부분 문자열을 뒤집음
        StringBuilder reversedSubString = new StringBuilder(subString);
        reversedSubString.reverse();

        // 뒤집은 부분 문자열을 원래 문자열에 대체
        StringBuilder result = new StringBuilder(my_string);
        result.replace(s, e + 1, reversedSubString.toString());

        return result.toString();
    }
}