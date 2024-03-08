class Solution {
 	public int solution(int n) {
		int answer = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 1) {
				cnt1 += i;
				answer = cnt1;
			}else {
				int x = (int) Math.pow(i, 2);
				cnt2 += x;
				answer = cnt2;
				
			}
		}
		return answer;
	}
}