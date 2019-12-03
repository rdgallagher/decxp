package smarthome;

public class SmartHome9000 {

    private final OnOffSwitch onOffSwitch;
    private final Switchable switchable;

    public SmartHome9000(OnOffSwitch onOffSwitch, Switchable switchable) {
        this.onOffSwitch = onOffSwitch;
        this.switchable = switchable;
    }

    public void run() {
        switchable.turnOn();
    }
}
