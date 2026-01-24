public class DefaultTest {
    int dailyStepsGoal = 10000; 

    public static void main(String[] args) {
        DefaultTest myTracker = new DefaultTest();
        
        int stepsTaken = 8500;
        
        System.out.println("Goal: " + myTracker.dailyStepsGoal);
        
        if (stepsTaken < myTracker.dailyStepsGoal) {
            System.out.println("Keep walking! You need " + (myTracker.dailyStepsGoal - stepsTaken) + " more steps.");
        } else {
            System.out.println("Goal reached!");
        }
    }
}