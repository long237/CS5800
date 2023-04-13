package Implementation;

public class Loyalty {
    private Level level;
    public static double GOLDDISCOUNT = 0.2;
    public static double SILVERDISCOUNT = 0.15;
    public static double BRONZEDISCOUNT = 0.1;

    public Loyalty(Level level) {
        this.level = level;
    }
    public double applyDiscount(double cost) {
        double result = 0;
        switch (level) {
            case GOLD:
                result = cost - cost * GOLDDISCOUNT;
                return result;
            case SILVER:
                result = cost - cost * SILVERDISCOUNT;
                return result;
            case BRONZE:
                result = cost - cost * BRONZEDISCOUNT;
                return result;
        }
        return result;
    }
}
