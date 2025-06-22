public class FinancialForecaster {

    // Recursive method to predict future value
    public double forecastValue(double currentValue, double growthRate, int years) {
        if (years == 0) return currentValue;
        return forecastValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    // Optimized with memoization (for learning only - not necessary here due to simple function)
    public double forecastValueIterative(double currentValue, double growthRate, int years) {
        for (int i = 0; i < years; i++) {
            currentValue *= (1 + growthRate);
        }
        return currentValue;
    }
}
