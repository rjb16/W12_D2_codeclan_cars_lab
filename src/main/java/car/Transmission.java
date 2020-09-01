package car;

public class Transmission {
    private String type;
    private int gears;

    public Transmission(String type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    public String getType() {
        return type;
    }

    public int getGears() {
        return gears;
    }
}
