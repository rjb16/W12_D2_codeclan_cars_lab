package car;

public class Engine {
    private int capacity;
    private int cylinders;

    public Engine(int capacity, int cylinders) {
        this.capacity = capacity;
        this.cylinders = cylinders;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCylinders() {
        return cylinders;
    }
}
