public class BuysellStocks{

    public static int buyAndSell(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i] > buyPrice){ //profit case
                int profit = prices[i] - buyPrice; //today's profit
                maxProfit = Math.max(maxProfit,profit);
            } else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]){
        int prices[] = {7,1,5,3,7,4};
        System.out.println(buyAndSell(prices));
    }
}

//time complexity = O(n)