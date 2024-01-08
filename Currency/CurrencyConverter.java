import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        // Populate exchange rates relative to INR
        exchangeRates.put("INR", 1.0);
        exchangeRates.put("USD", 0.012);
        exchangeRates.put("EUR", 0.011);
        exchangeRates.put("GBP", 0.0095);
        exchangeRates.put("JPY", 1.74);
        exchangeRates.put("AUD", 0.018);
        exchangeRates.put("CAD", 0.016);
        exchangeRates.put("RUB", 1.09);
        exchangeRates.put("SGD", 0.016);
        exchangeRates.put("AED", 0.044);
        // Add more currencies as needed
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");
        System.out.println("Supported currencies: INR, USD, EUR, GBP, JPY, AUD, CAD, RUB, SGD, AED");

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the source currency (e.g., INR): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the target currency (e.g., USD): ");
        String toCurrency = scanner.next().toUpperCase();

        double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency);
        System.out.println(amount + " " + fromCurrency + " is equivalent to " + convertedAmount + " " + toCurrency);

        scanner.close();
    }

    private static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        if (exchangeRates.containsKey(fromCurrency) && exchangeRates.containsKey(toCurrency)) {
            double rateFrom = exchangeRates.get(fromCurrency);
            double rateTo = exchangeRates.get(toCurrency);
            return amount * (rateTo / rateFrom);
        } else {
            System.out.println("Invalid currencies. Supported currencies: INR, USD, EUR, GBP, JPY, AUD, CAD, RUB, SGD, AED");
            System.exit(1);
            return -1; 
        }
    }
}
