import java.util.Scanner;

public class CurrencyConverter {
    private double exchangeRate = 00.92;
    private Scanner scanner = new Scanner(System.in);
    private boolean condition = true;
    public void convertCurrency() {
        while (condition) {
            System.out.println("Enter Dollar or Euro: ");
            String conversionType = scanner.nextLine().trim();

            // Check if the temperature type is valid (case-insensitive)
            if (!conversionType.equalsIgnoreCase("dollar") && !conversionType.equalsIgnoreCase("euro")) {
                System.out.println("Please enter a valid currency type either Dollar or Euro to perform conversion");
            }

            System.out.println("Enter the amount you Would like to convert: ");
            String amountInput = scanner.nextLine().trim();

            // Validate and convert degrees using try-catch (equivalent to your Python try-except)
            double amountAsDouble = 0;
            try {
                amountAsDouble = Double.parseDouble(amountInput);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid numeric value to perform conversion");
            }

            // Perform the conversion based on the type
            double result;
            if (conversionType.equalsIgnoreCase("dollar")) {
                // Dollar to Euro conversion (D * exchange rate:
                result = amountAsDouble * exchangeRate;
                System.out.println("The converted amount is: " + result + " Euros");
                condition = false;
            } else {
                // Euro to Dollar conversion (E / exchange rate:
                result = amountAsDouble / exchangeRate;
                System.out.println("The converted amount is: " + result + " Dollars");
                condition = false;
            }
        }
    }

}
