import Contracts.AbstractFactory;
import Contracts.FactoryProducer;
import Implementation.*;

public class Main {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryMaker();

        //Create Car factory
        Honda honda = (Honda) factoryProducer.getFactory("Honda");
        Tesla tesla = (Tesla) factoryProducer.getFactory("Tesla");
        Porsche porsche = (Porsche) factoryProducer.getFactory("Porsche");

        //Create Plane factory
        Boeing boeing = (Boeing) factoryProducer.getFactory("Boeing");
        Airbus airbus = (Airbus) factoryProducer.getFactory("Airbus");
        Embraer embraer = (Embraer) factoryProducer.getFactory("Embraer");

        // Create Boat Factory
        Mastercraft mastercraft = (Mastercraft) factoryProducer.getFactory("Mastercraft");
        SeaRay seaRay = (SeaRay) factoryProducer.getFactory("SeaRay");
        Bertram bertram = (Bertram) factoryProducer.getFactory("Bertram");

        // Creating a second Tesla and Airbus
        Tesla secondTesla = (Tesla) factoryProducer.getFactory("Tesla");
        Airbus secondAirbus = (Airbus) factoryProducer.getFactory("Airbus");

        System.out.println("Car Factory");
        System.out.println(honda);
        System.out.println(honda.buildVehicle());
        System.out.println(honda.repairVehicle());
        System.out.println(honda.restoreVehicle());

        System.out.println(tesla);
        System.out.println(porsche);
        System.out.println("Attempt at second Tesla Factory: " + secondTesla);

        System.out.println("");
        System.out.println("Plane Factory");
        System.out.println(boeing);
        System.out.println(airbus);
        System.out.println("Attempt at second Airbus Factory: "+ secondAirbus);
        System.out.println(embraer);

        System.out.println("");
        System.out.println("Boat Factory");
        System.out.println(bertram);
        System.out.println(seaRay);
        System.out.println(mastercraft);
    }
}