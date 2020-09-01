import car.Transmission;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransmissionTest {

    Transmission transmission;

    @Before
    public void before() {
        transmission = new Transmission("Manual", 6);
    }

    @Test
    public void canGetType() {
        assertEquals("Manual", transmission.getType());
    }

    @Test
    public void canGetGears() {
        assertEquals(6, transmission.getGears());
    }
}
