import behaviors.IBuy;
import car.Car;
import sun.nio.cs.ext.IBM037;

import java.util.ArrayList;

public class Dealership implements IBuy {

    private ArrayList<Car> stock;
    private double till;

    public Dealership(double till) {
        this.stock = new ArrayList<Car>();
        this.till = till;
    }

    public ArrayList<Car> getStock() {
        return stock;
    }

    public double getTill() {
        return till;
    }

    public void addStock(Car car) {
        stock.add(car);
    }

    public void buyCar(Car car) {
        addStock(car);
        till -= car.getPrice();
    }
}