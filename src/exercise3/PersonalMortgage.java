package exercise3;

public class PersonalMortgage extends Mortgage{
    private static final double PERSONAL_INTEREST_RATE = 2.0;

    public PersonalMortgage(int mortgageNumber, String customerName, double mortgageAmount, int term) {
        super(mortgageNumber, customerName, mortgageAmount, term);
        setInterestRate(PERSONAL_INTEREST_RATE);
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
