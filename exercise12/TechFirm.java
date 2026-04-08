interface RemoteControl {
    void volumeUp();
    void volumeDown();
}

class Television implements RemoteControl {
    public void volumeUp() { System.out.println("TV: Volume +1"); }
    public void volumeDown() { System.out.println("TV: Volume -1"); }
}

class SoundSystem implements RemoteControl {
    public void volumeUp() { System.out.println("Soundbar: Boosting Bass and Volume"); }
    public void volumeDown() { System.out.println("Soundbar: Muting Surround Sound"); }
}

public class TechFirm {
    public static void main(String[] args) {
        RemoteControl myRemote; // Interface reference

        myRemote = new Television();
        myRemote.volumeUp();

        myRemote = new SoundSystem(); 
        myRemote.volumeUp();
    }
}