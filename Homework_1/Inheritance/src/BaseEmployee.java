public class BaseEmployee extends Employee{
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, String SSN, double baseSalary) {
        super(firstName, lastName, SSN);
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "BaseEmployee{" +
                "baseSalary=" + baseSalary +
                "} " + super.toString();
    }
}
