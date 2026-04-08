abstract class SmartDevice {
    private String deviceName;
    public SmartDevice(String name) {
        this.deviceName = name;
    }
    public void powerOn() {
        System.out.println(deviceName + " is powering on... Initializing system.");
    }
    abstract void performAction();
}

class SmartLight extends SmartDevice {
    public SmartLight(String name) {
        super(name);
    }
    @Override
    void performAction() {
        System.out.println("Action: Adjusting brightness to 70%.");
    }
}

public class SmartHome {
    public static void main(String[] args) {
        SmartLight livingRoomLight = new SmartLight("Philips Hue");
        livingRoomLight.powerOn();       
        livingRoomLight.performAction(); 
    }
}