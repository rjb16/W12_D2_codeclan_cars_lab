import car.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Customer customer;
    Car car1;
    Car car2;
    ArrayList<Car> cars;
    CombustionEngine engine1;
    Transmission transmission1;
    Tyres tyres1;
    ElectricMotor engine2;
    Transmission transmission2;
    Tyres tyres2;

    @Before
    public void before() {
        dealership = new Dealership(123456.00);
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
    }

    @Test
    public void canGetStock() {
        assertEquals(0, dealership.getStock().size());
    }

    @Test
    public void canGetTillAmount() {
        assertEquals(123456.00, dealership.getTill(), 0.01);
    }

    @Test
    public void canAddStock() {
        dealership.addStock(car1);
        assertEquals(1, dealership.getStock().size());
    }

    @Test
    public void canBuyCar() {
        dealership.buyCar(car1);
        assertEquals(1, dealership.getStock().size());
        assertEquals(110956.00, dealership.getTill(), 0.01);
    }

    @Test
    public void canSellCar() {
        dealership.addStock(car1);
        dealership.sellCar(customer, car1);
        assertEquals(0, dealership.getStock().size());
        assertEquals(135956.00, dealership.getTill(), 0.01);
        assertEquals(1, customer.getOwnedCars().size());
        assertEquals(87500.00, customer.getMoney(), 0.01);
    }
}
