package exercise1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Insurance[] insurances = new Insurance[2];

        System.out.println("Enter the type of Insurance (Life/Health): ");
        String type = scanner.nextLine();
        if (type.equals("Life")) {
            Life lifeInsurance = new Life(type);
            System.out.println("Enter the monthly fee of Insurance: ");
            double monthlyFee = scanner.nextDouble();
            lifeInsurance.setInsuranceCost(monthlyFee);
            insurances[0] = lifeInsurance;
        } else if (type.equals("Health")) {
            Health healthInsurance = new Health(type);
            System.out.println("Enter the monthly fee of Insurance: ");
            double monthlyFee = scanner.nextDouble();
            healthInsurance.setInsuranceCost(monthlyFee);
            insurances[1] = healthInsurance;
        }

        for (Insurance insurance : insurances) {
            if(insurance != null) {
                insurance.displayInfo();
                System.out.println();
            }}


        scanner.close();
    }
}
