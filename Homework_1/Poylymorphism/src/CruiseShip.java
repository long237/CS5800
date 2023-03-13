public class CruiseShip extends Ship{
    private int maxPassenger;

    public CruiseShip(String name, String yearBuilt, int maxPassenger) {
        super(name, yearBuilt);
        this.maxPassenger = maxPassenger;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    @Override
    public String toString() {
        return "CruiseShip{" +
                "shipName=" + this.getName() + '\'' +
                ", maxPassenger=" + maxPassenger +
                '}';
    }
}
