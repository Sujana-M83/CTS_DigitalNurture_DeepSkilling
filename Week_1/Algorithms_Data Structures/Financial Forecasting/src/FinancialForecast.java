public class FinancialForecast {

    
    public static double power(double base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    
    public static double fastPower(double base, int exp) {
        if (exp == 0) return 1;
        if (exp % 2 == 0) {
            double half = fastPower(base, exp / 2);
            return half * half;
        } else {
            return base * fastPower(base, exp - 1);
        }
    }

    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        return presentValue * fastPower(1 + growthRate, years); // Use optimized
    }
}
