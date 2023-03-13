public class CommisionEmployee extends Employee{
    private double commisionRate;
    private double grossSales;

    public CommisionEmployee(String firstName, String lastName, String SSN, double commisionRate, double grossSales) {
        super(firstName, lastName, SSN);
        this.commisionRate = commisionRate;
        this.grossSales = grossSales;
    }

    @Override
    public String toString() {
        return "CommisionEmployee{" +
                "commisionRate=" + commisionRate +
                ", grossSales=" + grossSales +
                "} " + super.toString();
    }
}
