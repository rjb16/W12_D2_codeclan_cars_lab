import behaviors.IBuy;
import car.Car;

import java.util.ArrayList;

public class Customer implements IBuy {

    private double money;
    private ArrayList<Car> ownedCars;

    public Customer(double money) {
        this.money = money;
        this.ownedCars = new ArrayList<Car>();
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Car> getOwnedCars() {
        return ownedCars;
    }

    public void setOwnedCars(ArrayList<Car> ownedCars) {
        this.ownedCars = ownedCars;
    }

    public void addOwnedCars(Car car) {
        ownedCars.add(car);
    }

    public void buyCar(Car car) {
        addOwnedCars(car);
        money -= car.getPrice();
    }

    public void removeMoney(double amount) {
        money -= amount;
    }
}
