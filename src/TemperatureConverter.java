import java.util.Scanner;

public class TemperatureConverter {
    private final Scanner scanner = new Scanner(System.in);
    private boolean condition = true;

    public void convertTemperature() {
        while (condition) {
            System.out.println("Enter Fahrenheit or Celsius: ");
            String conversionType = scanner.nextLine().trim();

            // Check if the temperature type is valid (case-insensitive)
            if (!conversionType.equalsIgnoreCase("fahrenheit") && !conversionType.equalsIgnoreCase("celsius")) {
                System.out.println("Please enter a valid temperature type either Fahrenheit or Celsius to perform conversion");
            }

            System.out.println("Enter the degrees you Would like to convert: ");
            String degreesInput = scanner.nextLine().trim();

            // Validate and convert degrees using try-catch (equivalent to your Python try-except)
            float degreesAsFloat = 0;
            try {
                degreesAsFloat = Float.parseFloat(degreesInput);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid numeric value to perform conversion");
            }

            // Perform the conversion based on the type
            float result;
            if (conversionType.equalsIgnoreCase("fahrenheit")) {
                // Fahrenheit to Celsius formula: (F - 32) * 5/9
                result = (degreesAsFloat - 32) * (5.0f / 9.0f);
                System.out.println("The converted temperature is: " + result + " Celsius");
                condition = false;
            } else {
                // Celsius to Fahrenheit formula: (C * 9/5) + 32
                result = (degreesAsFloat * (9.0f / 5.0f)) + 32;
                System.out.println("The converted temperature is: " + result + " Fahrenheit");
                condition = false;
            }
        }

    }
}
