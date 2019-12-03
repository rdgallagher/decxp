package smarthome;

import acme.Bulb9000;
import acme.Switch9000;

public class Main {
    public static void main(String[] args) {
        new SmartHome9000(new Switch9000(), new Bulb9000()).run();
    }
}
