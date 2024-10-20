package exercise1;

public class Life extends Insurance{

    public Life(String typeOfInsurance) {
        super(typeOfInsurance);
    }

    @Override
    public void setInsuranceCost(double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    @Override
    public void displayInfo(){
        System.out.println("Insurance Type: " + getTypeOfInsurance());
        System.out.println("Monthly Cost: " + getMonthlyCost());
    }
}
