import car.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void before() {
        tyres = new Tyres("Michelin", "205/17/40");
    }

    @Test
    public void canGetBrand() {
        assertEquals("Michelin", tyres.getBrand());
    }

    @Test
    public void canGetSize() {
        assertEquals("205/17/40", tyres.getSize());
    }
}
