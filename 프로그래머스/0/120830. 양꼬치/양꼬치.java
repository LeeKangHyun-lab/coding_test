import java.util.*;

class Solution {
    public static int solution(int n, int k) {
        int answer = 0;
        int sheep;
        int drink;
        int sum = 0;
        
        sum = n / 10;
            k = k-sum;
        
        sheep = n * 12000;
        drink = k * 2000;
        
        answer = sheep + drink;
        return answer;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("양꼬치 개수를 입력해주세요.");
        int n = scan.nextInt();
        
        System.out.print("음료수의 개수를 입력해주세요.");
        int k = scan.nextInt();
        
        solution(n, k);
        System.out.print(solution(n,k));
    }
}