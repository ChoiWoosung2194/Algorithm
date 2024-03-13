class Solution {
    public int solution(int price) {
        int answer =  price;
        //지불할 금액 return, if price > 100000 , price * 0.95
        if(100000<= price && price <300000){
            answer *=0.95;
        }else if(300000<= price && price <500000){
            answer *= 0.9;
        }else if(500000 <= price){
            answer *= 0.8;
        }
        return answer;
    }
}