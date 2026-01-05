package DSA.Arrays;

public class PBuySellStocks {
    public static void perfectTimeToBuyOrSellStocks(int arr[], int n) {
        int maxProfit = 0;
        int buyPrice = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > buyPrice) {
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = arr[i];
            }
        }
        System.out.println("Maximum Profit is: " + maxProfit);
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int n = arr.length;
        perfectTimeToBuyOrSellStocks(arr, n);
    }
}
