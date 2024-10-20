package exercise3;

public class BusinessMortgage extends Mortgage {
    private static final double BUSINESS_INTEREST_RATE = 1.0;

    public BusinessMortgage(int mortgageNumber, String customerName, double mortgageAmount, int term) {
        super(mortgageNumber, customerName, mortgageAmount, term);
        setInterestRate(BUSINESS_INTEREST_RATE);
    }

    @Override
    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }

    @Override
    public double calculateTotalOwed() {
        return mortgageAmount * (1 + interestRate / 100);
    }
}

