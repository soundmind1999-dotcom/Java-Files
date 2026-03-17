import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void turnOnTest() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        assertTrue(ac.isOn());
    }

    @Test
    public void turnOffTest() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        ac.turnOff();
        assertFalse(ac.isOn());
    }

    @Test
    public void increaseTemperatureTest() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        ac.increaseTemperature();
        assertEquals(17, ac.getTemperature());
    }

    @Test
    public void decreaseTemperatureTest() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        ac.increaseTemperature();
        ac.decreaseTemperature();
        assertEquals(16, ac.getTemperature());
    }

    @Test
    public void temperatureNotAbove30Test() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();

        for(int i = 0; i < 20; i++) {
            ac.increaseTemperature();
        }

        assertEquals(30, ac.getTemperature());
    }

    @Test
    public void temperatureNotBelow16Test() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        ac.decreaseTemperature();

        assertEquals(16, ac.getTemperature());
    }
}
