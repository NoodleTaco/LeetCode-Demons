public class BestStock {
    public static int maxProfit(int[] prices) {
        if(prices.length == 1)
        {
            return 0;
        }

        int relativeLeast = prices[0];
        int relativeHigh = prices[0];
        int highestProfit = 0;

        
        
        for(int i = 1 ; i < prices.length ; i++)
        {
            if(prices[i] > relativeHigh)
            {
                relativeHigh = prices[i];
            }

            else if(prices[i] < relativeLeast )
            {
                if ((relativeHigh - relativeLeast) > highestProfit)
                {
                     highestProfit = relativeHigh - relativeLeast;
                }
                relativeLeast = prices[i];
                relativeHigh = relativeLeast;

            }
        }
        if ((relativeHigh - relativeLeast) > highestProfit)
        {
            highestProfit = relativeHigh - relativeLeast;
        }
        if(highestProfit <= 0 )
        {
            return 0;
        }
        
        return highestProfit;
     }

    public static void main(String [ ] args)
    {
        int[] test = {2,11,1,4};

        System.out.println(maxProfit(test));
    }

        


    
}