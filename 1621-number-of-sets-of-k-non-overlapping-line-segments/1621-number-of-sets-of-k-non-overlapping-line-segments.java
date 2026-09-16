import java.math.BigInteger;

class Solution {
    public int numberOfSets(int n, int k) {
        long MOD = 1_000_000_007L;
        
        int N = n + k - 1;
        int R = 2 * k;
        
        if (R > N) {
            return 0;
        }
        
    
        BigInteger num = BigInteger.ONE;
        BigInteger den = BigInteger.ONE;
        
        for (int i = 1; i <= R; i++) {
            num = num.multiply(BigInteger.valueOf(N - i + 1));
            den = den.multiply(BigInteger.valueOf(i));
        }
        
        BigInteger result = num.divide(den).mod(BigInteger.valueOf(MOD));
        return result.intValue();
    }
}