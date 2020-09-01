import car.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car1;
    Car car2;
    ArrayList<Car> ownedCars;
    CombustionEngine engine1;
    Transmission transmission1;
    Tyres tyres1;
    ElectricMotor engine2;
    Transmission transmission2;
    Tyres tyres2;

    @Before
    public void before() {
        customer = new Customer(100000.00);
        engine1 = new CombustionEngine(1600, 4);
        transmission1 = new Transmission("Manual", 6);
        tyres1 = new Tyres("Michelin", "205/17/40");
        engine2 = new ElectricMotor();
        transmission2 = new Transmission("Manual", 6);
        tyres2 = new Tyres("Michelin", "205/17/40");
        car1 = car1 = new Car(
                "Ford",
                "Fiesta",
                CarType.PETROL,
                engine1,
                transmission1,
                tyres1,
                12500.00,
                "Black",
                "Hatchback",
                3);
        car2 = new Car(
                "Tesla",
                "Model 3",
                CarType.ELECTRIC,
                engine2,
                transmission2,
                tyres2,
                50000.00,
                "Black",
                "Saloon",
                5);

        ownedCars = new ArrayList<Car>();
        ownedCars.add(car1);
        ownedCars.add(car2);
    }

    @Test
    public void canGetMoney() {
        assertEquals(100000.00, customer.getMoney(), 0.01);
    }

    @Test
    public void canGetOwnedCars() {
        assertEquals(0, customer.getOwnedCars().size());
    }

    @Test
    public void canAddOwnedCars() {
        customer.addOwnedCars(car1);
        assertEquals(1, customer.getOwnedCars().size());
    }

    @Test
    public void canSetOwnedCars() {
        customer.setOwnedCars(ownedCars);
        assertEquals(2, customer.getOwnedCars().size());
    }

    @Test
    public void canBuyCar() {
        customer.buyCar(car1);
        assertEquals(1, customer.getOwnedCars().size());
        assertEquals(87500.00, customer.getMoney(), 0.01);
    }
}
