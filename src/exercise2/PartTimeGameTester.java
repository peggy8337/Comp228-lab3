package exercise2;

public class PartTimeGameTester extends GameTester {
    private int hoursWorked;
    private final double hourlyRate = 20;

    public PartTimeGameTester(String name, int hoursWorked) {
        super(name, false);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double determineSalary() {
        return hoursWorked * hourlyRate;
    }
}
