public class Stock {
    public int maxProfit(int[] prices) {
        int mProfit = 0;
        int minSoFar = prices[0];
        for(int i=0; i< prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
            int profit = prices[i] - minSoFar;
            mProfit = Math.max(mProfit, profit);
        }
        return mProfit;
    }

    public static void main(String[] args) {
        Stock st = new Stock();
        int[] prices = {7,6,4,3,1};
        System.out.println(st.maxProfit(prices));
    }
}
