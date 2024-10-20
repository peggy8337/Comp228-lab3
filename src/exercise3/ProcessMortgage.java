package exercise3;
import java.util.Scanner;

public class ProcessMortgage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current interest rate: ");
        double currentInterestRate = scanner.nextDouble();
        scanner.nextLine();

        Mortgage[] mortgages = new Mortgage[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter mortgage details for Mortgage " + (i + 1));

            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();

            System.out.print("Enter mortgage amount (up to $300,000): ");
            double mortgageAmount = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter term (1 for short-term, 3 for medium-term, 5 for long-term): ");
            int term = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter mortgage type (B for Business, P for Personal): ");
            String mortgageType = scanner.nextLine().toUpperCase();

            int mortgageNumber = i + 1;

            if (mortgageType.equals("B")) {
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, mortgageAmount, term);
            } else if (mortgageType.equals("P")) {
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, term);
            } else {
                System.out.println("Invalid mortgage type. Skipping this entry.");
            }
        }

        System.out.println("\nAll Mortgages:");
        for (Mortgage mortgage : mortgages) {
            if (mortgage != null) {
                mortgage.getMortgageInfo();
                System.out.println();
            }
        }

        scanner.close();
    }
}
