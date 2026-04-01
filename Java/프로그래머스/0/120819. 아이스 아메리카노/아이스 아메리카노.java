class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int A = 0;
        int B = 0;
        int ice_Americano = 5500;
        A = money / ice_Americano;
        B = money % ice_Americano;
        answer[0] = A;
        answer[1] = B;
        return answer;
    }
}