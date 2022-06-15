public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int count = 0;
        for(int i=1; i<33; i++) {
            if(getBit(n, i) == true) {
                count++;
            }
        }
        return count;
    }

    public Boolean getBit(int n, int i) {
        return (n & (1 << i)) != 0;
    }
}