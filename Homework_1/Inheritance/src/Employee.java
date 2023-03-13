public class Employee {
    private String firstName;
    private String lastName;
    private String SSN;

    public Employee () {
        this.firstName = "John";
        this.lastName = "Doe";
        this.SSN = "123456789";
    }

    public Employee(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", SSN='" + SSN + '\'' +
                '}';
    }
}
