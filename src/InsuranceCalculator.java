public class InsuranceCalculator {

    private final InsuranceStrategyVeryHigh insuranceStrategyVeryHigh = new InsuranceStrategyVeryHigh();

    public double calculateInsurance(double income) {
        return insuranceStrategyVeryHigh.calculateInsurance(income);
    }


}
