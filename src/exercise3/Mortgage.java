package exercise3;

public abstract class Mortgage implements MortgageConstants {
    private int mortgageNumber;
    private String customerName;
    protected double mortgageAmount;
    protected double interestRate;
    private int term;

    public Mortgage(int mortgageNumber, String customerName, double mortgageAmount, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;

        if (mortgageAmount > MAXIMUM_AMOUNT) {
            this.mortgageAmount = MAXIMUM_AMOUNT;
        } else {
            this.mortgageAmount = mortgageAmount;
        }

        if (term == SHORT_TERM || term == MEDIUM_TERM || term == LONG_TERM) {
            this.term = term;
        } else {
            this.term = SHORT_TERM;
        }
    }

    public abstract void setInterestRate(double rate);

    public abstract double calculateTotalOwed();

    public void getMortgageInfo() {
        System.out.println("Mortgage Information:");
        System.out.println("Mortgage Number: " + mortgageNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.printf("Mortgage Amount: $%.2f\n", mortgageAmount);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Term: " + term + " year(s)");
        System.out.println("Total Owed: $" + calculateTotalOwed());
    }


}

