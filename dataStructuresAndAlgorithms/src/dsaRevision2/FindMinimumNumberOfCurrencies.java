package dsaRevision2;

import java.util.Arrays;
import java.util.Collections;

public class FindMinimumNumberOfCurrencies {

    public static void main(String[] args) {
        int amount = 250;
        int[] currencies = {1, 2, 5, 20, 100};

        System.out.println(getMinCountOfCurrency(amount, currencies));
    }

    public static void getMinCountForEveryCurrency(int amount) {
        int[] currencies1 = {1, 2, 5, 20, 100};
        int[] currencies2 = {1, 2, 5, 10, 20, 50};

        int count1 = getMinCountOfCurrency(amount, currencies1);
        int count2 = getMinCountOfCurrency(amount, currencies2);
        System.out.println(Math.min(count2, count1));
    }

    public static int getMinCountOfCurrency(int amount, int[] currencies) {
        Arrays.sort(currencies);

        int count = 0;
        for (int i = currencies.length - 1; i >= 0; i--) {
            count += amount / currencies[i];
            amount %= currencies[i];
        }

        return count;
    }

}
