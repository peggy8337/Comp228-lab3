package exercise1;

abstract class Insurance {
    String typeOfInsurance;
    double monthlyCost;

    public Insurance(String typeOfInsurance) {
        this.typeOfInsurance = typeOfInsurance;
    }

    public String getTypeOfInsurance() {
        return typeOfInsurance;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    public abstract void setInsuranceCost(double monthlyCost);
    public abstract void displayInfo();
}
