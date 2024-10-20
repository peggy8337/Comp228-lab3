package exercise1;

public class Health extends Insurance{
    public Health(String typeOfInsurance) {
        super(typeOfInsurance);
    }

    @Override
    public void setInsuranceCost(double monthlyCost){
        this.monthlyCost = monthlyCost;
    }

    @Override
    public void displayInfo(){
        System.out.println("Insurance Type: " + getTypeOfInsurance());
        System.out.println("Insurance Cost: " + getMonthlyCost());
    }

}
