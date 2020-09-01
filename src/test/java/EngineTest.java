import car.CombustionEngine;
import car.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    CombustionEngine engine;

    @Before
    public void before() {
        engine = new CombustionEngine(1600, 4);
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
