
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;
        while (condition) {
            System.out.println("Enter the type of conversion you would like to perform. For temperature conversion enter 1 For currency conversion enter 2: ");
            String conversionType = scanner.nextLine().trim();

            if (!conversionType.equalsIgnoreCase("1") && !conversionType.equalsIgnoreCase("2")) {
                System.out.println("Please enter a valid input either 1 or 2 to select the conversion type");
            }
            else if (conversionType.equalsIgnoreCase("1")) {
                TemperatureConverter converter = new TemperatureConverter();
                converter.convertTemperature();
                condition = false;
            }
            else {
                CurrencyConverter converter = new CurrencyConverter();
                converter.convertCurrency();
                condition = false;
            }

        }

    }
}
