import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Temperature Converter ===");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double c = sc.nextDouble();
                double fResult = (c * 9/5) + 32;
                System.out.println("Fahrenheit: " + fResult);
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double f = sc.nextDouble();
                double cResult = (f - 32) * 5/9;
                System.out.println("Celsius: " + cResult);
                break;

            default:
                System.out.println("Invalid option!");
        }

        sc.close();
    }
}
