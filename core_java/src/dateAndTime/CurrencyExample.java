package dateAndTime;

import java.util.Currency;

public class CurrencyExample {
	
	public static void main(String[] args) {
		Currency currency = Currency.getInstance("USD");
		System.out.println("Currency Code: " + currency.getCurrencyCode());
		System.out.println("Currency Symbol: " + currency.getSymbol());
		System.out.println("Currency Name: " + currency.getDisplayName());

		Currency currency2 = Currency.getInstance("INR");
		System.out.println("Currency Code: " + currency2.getCurrencyCode());
		System.out.println("Currency Symbol: " + currency2.getSymbol());
		System.out.println("Currency Name: " + currency2.getDisplayName());
	}

}
