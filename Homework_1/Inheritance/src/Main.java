public class Main {
    public static void main(String[] args) {
        System.out.println("Creating new employees");

        Employee joe = new Employee("Joe", "Jones", "111-11-1111");
        HourlyEmployee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee quinn = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommisionEmployee nicole = new CommisionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        SalariedEmployee renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommisionEmployee mahnaz = new CommisionEmployee("Mahanz", "Vaziri", "777-77-7777", 0.22, 40000);

        System.out.println(joe);
        System.out.println("-------------------");
        System.out.print("");

        System.out.println(stephanie);
        System.out.println("-------------------");
        System.out.print("");

        System.out.println(quinn);
        System.out.println("-------------------");
        System.out.print("");

        System.out.println(nicole);
        System.out.println("-------------------");
        System.out.print("");

        System.out.println(renwa);
        System.out.println("-------------------");
        System.out.print("");

        System.out.println(mike);
        System.out.println("-------------------");
        System.out.print("");

        System.out.println(mahnaz);
        System.out.println("-------------------");
        System.out.print("");

    }
}