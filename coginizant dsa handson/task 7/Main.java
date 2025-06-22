import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FinancialForecaster forecaster = new FinancialForecaster();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current value (e.g., investment amount): ");
        double currentValue = sc.nextDouble();

        System.out.print("Enter expected annual growth rate (e.g., 0.05 for 5%): ");
        double growthRate = sc.nextDouble();

        System.out.print("Enter number of years to forecast: ");
        int years = sc.nextInt();

        double resultRecursive = forecaster.forecastValue(currentValue, growthRate, years);
        double resultIterative = forecaster.forecastValueIterative(currentValue, growthRate, years);

        System.out.printf("\n📈 Forecasted Value (Recursive): %.2f\n", resultRecursive);
        System.out.printf("📉 Forecasted Value (Iterative): %.2f\n", resultIterative);
    }
}
