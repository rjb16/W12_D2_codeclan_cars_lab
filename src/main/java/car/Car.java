package car;

public class Car {
    private String make;
    private String model;
    private CarType type;
    private Engine engine;
    private Transmission transmission;
    private Tyres tyres;
    private double price;
    private String colour;
    private String body;
    private int doors;

    public Car(String make,
               String model,
               CarType type,
               Engine engine,
               Transmission transmission,
               Tyres tyres,
               double price,
               String colour,
               String body,
               int doors)
    {
        this.make = make;
        this.model = model;
        this.type = type;
        this.engine = engine;
        this.transmission = transmission;
        this.tyres = tyres;
        this.price = price;
        this.colour = colour;
        this.body = body;
        this.doors = doors;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public CarType getType() {
        return type;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public String getBody() {
        return body;
    }

    public int getDoors() {
        return doors;
    }
}
