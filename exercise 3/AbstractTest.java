abstract class Robot {
    public abstract void doWork(); 
    public void startup() {
        System.out.println("Robot is booting up...");
    }
}

class WorkingRobot extends Robot {
    public void doWork() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Robot is cleaning room number " + i);
        }
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        WorkingRobot myBot = new WorkingRobot();
        
        myBot.startup(); 
        myBot.doWork();  
    }
}