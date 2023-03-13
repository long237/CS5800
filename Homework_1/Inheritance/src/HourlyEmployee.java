public class HourlyEmployee extends Employee{
    private int wage;
    private double hoursPerWeek;

    public HourlyEmployee(String firstName, String lastName, String SSN, int wage, double hoursPerWeek) {
        super(firstName, lastName, SSN);
        this.wage = wage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "wage=" + wage +
                ", hoursPerWeek=" + hoursPerWeek +
                "} " + super.toString();
    }
}
