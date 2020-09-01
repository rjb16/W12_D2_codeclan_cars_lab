import car.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car1;
    Engine engine1;
    Transmission transmission1;
    Tyres tyres1;

    @Before
    public void before() {
        engine1 = new Engine(1600, 4);
        transmission1 = new Transmission("Manual", 6);
        tyres1 = new Tyres("Michelin", "205/17/40");
        car1 = new Car(
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
    }

    @Test
    public void canGetMake() {
        assertEquals("Ford", car1.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Fiesta", car1.getModel());
    }

    @Test
    public void canGetCarType() {
        assertEquals(CarType.PETROL, car1.getType());
    }

    @Test
    public void canGetEngine() {
        assertEquals(engine1, car1.getEngine());
    }

    @Test
    public void canGetTransmission() {
        assertEquals(transmission1, car1.getTransmission());
    }

    @Test
    public void canGetTyres() {
        assertEquals(tyres1, car1.getTyres());
    }

    @Test
    public void canGetPrice() {
        assertEquals(12500.00, car1.getPrice(), 0.01);
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", car1.getColour());
    }

    @Test
    public void canGetBody() {
        assertEquals("Hatchback", car1.getBody());
    }

    @Test
    public void canGetDoors() {
        assertEquals(3, car1.getDoors());
    }
}
