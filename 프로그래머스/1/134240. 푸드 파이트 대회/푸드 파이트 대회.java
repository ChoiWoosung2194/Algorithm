class Solution {
    public String solution(int[] food) {
        String answer = "";
        	for (int i = 0; i < food.length; i++) {
			int temp = food[i];

			if (temp < 2) {
				continue;
			}

			temp /= 2;

			for (int j = 0; j < temp; j++) {
				answer += i;
			}
			
		}
		String reverse = "";
		for(int i = answer.length()-1; i>=0; i--) {
			reverse =reverse + answer.charAt(i);
		}
		
		return answer + "0" + reverse;
	}
}