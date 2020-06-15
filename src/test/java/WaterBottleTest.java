import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle bottle;

    @Before
    public void before() {
        bottle = new WaterBottle();
    }

    @Test
    public void volumeStartsAt100() {
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void drinkDecreasesVolumeBy10() {
        bottle.drink();
        bottle.drink();
        assertEquals(80, bottle.getVolume());
    }

    @Test
    public void emptySetsVolumeToZero() {
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void fillSetsVolumeTo100() {
        bottle.drink();
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }
}
