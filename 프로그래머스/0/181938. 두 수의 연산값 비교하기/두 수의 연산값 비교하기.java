class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int num1 = a;
        int num2 = b;
        int total = 2* num1 * num2;
        
        String x = Integer.toString(a);
        String y = Integer.toString(b);
        
        String z = x + y;
        int i = Integer.parseInt(z);
        if(i > total || i == total) {
        	answer = i;
        }else {
        	answer = total;
        }
        return answer;
    }
}