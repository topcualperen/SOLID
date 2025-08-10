
class LightBulb {
    public void turnOn() {
        System.out.println("Ampulu yak");
    }
}

class Switch {
    private LightBulb bulb = new LightBulb();

    public void operate() {
        bulb.turnOn();
    }
}