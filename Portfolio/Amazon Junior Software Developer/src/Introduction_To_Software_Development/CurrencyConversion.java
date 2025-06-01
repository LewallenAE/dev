package Introduction_To_Software_Development;

public class CurrencyConversion {
    public static void main(String[] args) {

        double amountInUSD = 100.00;
        double exchangeRateUSDToEUR = 0.85;

        System.out.println("Amount in USD: " + amountInUSD);
        System.out.println();

        double conversion = amountInUSD * exchangeRateUSDToEUR;

        System.out.println("The amount converted to Euros is " + conversion);
        System.out.println();
        System.out.println("After subtracting 55 Euros the new amount is: " + (conversion - 55.0));
        System.out.println();

        // concatenate with , instead of + when using printf and %.2f
        System.out.printf("The amount converted to USD is: $ %.2f", (conversion - 55) / exchangeRateUSDToEUR);

    }
}
