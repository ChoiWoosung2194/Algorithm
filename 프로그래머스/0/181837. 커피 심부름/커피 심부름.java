class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(int i = 0; i< order.length; i++){
            if(order[i].equals("cafelatte") || order[i].equals("icecafelatte") || order[i].equals("cafelatteice") || order[i].equals("hotcafelatte") || order[i].equals("cafelattehot")){
                answer += 5000;
            }else if(order[i].equals("iceamericano") || order[i].equals("hotamericano") || order[i].equals("americanohot") || order[i].equals("americanoice") || order[i].equals("americano")){
                answer += 4500;
            }else{
                answer += 4500;
            }
        }
        return answer;
    }
}