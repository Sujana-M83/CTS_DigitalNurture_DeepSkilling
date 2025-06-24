public class ForecastTest {
    public static void main(String[] args) {
        double presentValue = 10000;
        double growthRate = 0.08; 
        int years = 5;

        double futureValue = FinancialForecast.calculateFutureValue(presentValue, growthRate, years);
        System.out.println("Predicted Future Value: " + futureValue);
    }
}
