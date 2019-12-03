package smarthome;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SmartHome9000Test {

    @Test
    public void whenSwitchIsOn_turnBulbOn() {
        // arrange
        AlwaysOnSwitch alwaysOnSwitch = new AlwaysOnSwitch();
        SpyBulb spyBulb = new SpyBulb();

        // act
        new SmartHome9000(alwaysOnSwitch, spyBulb).run();

        // assert
        assertTrue(spyBulb.turnOnWasCalled());
        assertFalse(spyBulb.turnOffWasCalled());
    }

    private class AlwaysOnSwitch implements OnOffSwitch {
        @Override
        public boolean isOn() {
            return true;
        }
    }

    private class SpyBulb implements Switchable {

        private boolean turnOnWasCalled = false;
        private boolean turnOffWasCalled = false;

        @Override
        public void turnOn() {
            turnOnWasCalled = true;
        }

        @Override
        public void turnOff() {
            turnOffWasCalled = true;
        }

        public boolean turnOnWasCalled() {
            return turnOnWasCalled;
        }

        public boolean turnOffWasCalled() {
            return turnOffWasCalled;
        }
    }
}