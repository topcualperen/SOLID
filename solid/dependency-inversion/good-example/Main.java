
interface Switchable {
    void activate();
}

class LightBulb implements Switchable {
    public void activate() {
        System.out.println("Ampul çalıştı");
    }
}

class Fan implements Switchable {
    public void activate() {
        System.out.println("Fan çalıştı");
    }
}

class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.activate();
    }
}

public class Main {
    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        Switch switch1 = new Switch(lightBulb);
    }
}
