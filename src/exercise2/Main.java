package exercise2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of game tester: ");
        String name = scanner.nextLine();

        System.out.println("Is the game tester full-time? (yes/no): ");
        String status = scanner.nextLine();

        GameTester tester;
        if (status.equals("yes")) {
            tester = new FullTimeGameTester(name);
        } else {
            System.out.println("Enter the numbers of work hours: ");
            int hoursWorked = scanner.nextInt();
            tester = new PartTimeGameTester(name, hoursWorked);
        }

        System.out.println("Game tester: " + tester.getName());
        System.out.println("Full-time: " + (tester.isFullTime()? "Yes" : "No"));
        System.out.println("Salary: " + tester.determineSalary());

        scanner.close();
    }
}
