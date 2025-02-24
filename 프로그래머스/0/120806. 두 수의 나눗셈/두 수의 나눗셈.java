import java.util.*;

class Solution {
    public static int solution(double num1, double num2) {
        int answer = 0;
        double sum = 0;
        sum = num1 / num2 * 1000;
        answer = (int)sum;
        return answer;
    }
    
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    double num1 = scan.nextInt();
    double num2 = scan.nextInt();
    solution(num1,num2);
        
    }
}