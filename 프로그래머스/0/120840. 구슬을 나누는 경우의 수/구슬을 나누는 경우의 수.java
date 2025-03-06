import java.math.BigInteger;
class Solution {
    public long solution(int balls, int share) {
        return combination(balls, share).longValue();  
    }

    BigInteger combination(int n, int r) {
        if (r == 0 || n == r) return BigInteger.ONE;
        
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < r; i++) {
            result = result.multiply(BigInteger.valueOf(n - i))
                           .divide(BigInteger.valueOf(i + 1));
        }
        
        return result;
    }
}
