package car;

public class CombustionEngine extends Engine{

    private int capacity;
    private int cylinders;

    public CombustionEngine(int capacity, int cylinders) {
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
