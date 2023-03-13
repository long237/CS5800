import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ship normalShip = new Ship("Des Moines", "1945");
        CruiseShip cruiseShip = new CruiseShip("Bella", "1968", 1000);
        CargoShip cargoShip = new CargoShip("Dolphin", "1999", 20000);

        Ship[] predeterminedShip = {normalShip, cruiseShip, cargoShip};
        for (int i = 0; i < predeterminedShip.length; i++) {
            System.out.println(predeterminedShip[i]);
        }

        // Asking user Inputs to create new ships
        Scanner scanner = new Scanner(System.in);

        // normal ship
        System.out.println("");
        System.out.println("Creating a new normal ship: ");
        System.out.println("Please enter ship name: ");
        String nShipName = scanner.nextLine();
        System.out.println("Please enter the year that the ship was built: ");
        String nYearBuilt = scanner.nextLine();
        Ship userNormalShip = new Ship(nShipName, nYearBuilt);

        // Cruise ship
        System.out.println("");
        System.out.println("Creating a cruise ship: ");
        System.out.println("Please enter ship name: ");
        String cShipName = scanner.nextLine();
        System.out.println("Please enter the year that the ship was built: ");
        String cYearBuilt = scanner.nextLine();
        System.out.println("Please enter number of passenger: ");
        int cPassenger = Integer.parseInt(scanner.nextLine());
        CruiseShip userCruiseShip = new CruiseShip(cShipName, cYearBuilt, cPassenger);

        // Cargo ship
        System.out.println("");
        System.out.println("Creating a cruise ship: ");
        System.out.println("Please enter ship name: ");
        String cargoShipName = scanner.nextLine();
        System.out.println("Please enter the year that the ship was built: ");
        String cargoYearBuilt = scanner.nextLine();
        System.out.println("Please enter the tonnage: ");
        int cargoTonnage = Integer.parseInt(scanner.nextLine());
        CargoShip userCargoShip = new CargoShip(cargoShipName, cargoYearBuilt, cargoTonnage);

        Ship[] userShips = {userNormalShip, userCruiseShip, userCargoShip};
        System.out.println("");
        System.out.println("User created ships are: ");
        for (int i = 0; i < userShips.length; i++) {
            System.out.println(userShips[i]);
        }
    }
}