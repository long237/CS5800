package Implementation;

public class Square {
    private int locationID;

    public Square(int locationID) {
        this.locationID = locationID;
    }

    public String PayUsingSquare() {
        String result = "Pay using Square with locationID: " + this.locationID;
        return result;
    }
}
