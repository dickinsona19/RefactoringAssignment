public class InsuranceStrategyVeryHigh {
    public InsuranceStrategyVeryHigh() {
    }

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            return income * 0.365;
        } else if (income <= 30000) {
            return (income - 10000) * 0.2 + 35600;
        } else if (income <= 60000) {
            return (income - 30000) * 0.1 + 76500;
        } else {
            return calculateInsuranceVeryHigh(income);
        }
    }

    static double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    static int getAdjustment() {
        return 60000;
    }

    static double getWeight() {
        return 0.02;
    }

    static int getConstant() {
        return 105600;
    }
}