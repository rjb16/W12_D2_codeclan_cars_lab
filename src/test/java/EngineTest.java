import car.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine(1600, 4);
    }

    @Test
    public void canGetCapacity() {
        assertEquals(1600, engine.getCapacity());
    }

    @Test
    public void canGetCylinders() {
        assertEquals(4, engine.getCylinders());
    }
}
