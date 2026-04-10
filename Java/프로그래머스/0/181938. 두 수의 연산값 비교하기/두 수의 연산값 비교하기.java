class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int Z = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        if (Z >2 * a * b){
            answer = Z;
        } else {
            answer = 2*a*b;
        }
        return answer;
    }
}