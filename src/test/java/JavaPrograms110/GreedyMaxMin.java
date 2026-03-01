package JavaPrograms110;

import java.util.Arrays;
import java.util.Collections;

public class GreedyMaxMin {

    public static void main(String[] args) {
        int iAmount = 104;
        int[] coin = {5,4,2};

//        Arrays.sort(coin);
        int remaining = iAmount;

        int totalCoins = 0;

        for (int i = 0; i <= coin.length - 1; i++) {

            if (remaining >= coin[i]) {
                int iCoin  = remaining / coin[i];
                totalCoins=iCoin+totalCoins;
                remaining = iAmount % coin[i];
                System.out.println("Coin " + coin[i] + " used " + iCoin + " times");
            }
        }
        if (remaining != 0) {
            System.out.println("Amount cannot be formed exactly");
        } else {
            System.out.println("Minimum coins used = " + totalCoins);
        }

    }

}
