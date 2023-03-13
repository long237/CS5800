public class SalariedEmployee extends Employee{
    private int weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String SSN, int weeklySalary) {
        super(firstName, lastName, SSN);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "weeklySalary=" + weeklySalary +
                "} " + super.toString();
    }
}
