import java.util.*;

public class StepTracker {
    
    int dailyActiveMinSteps;
    int activeDays;
    double avg;
    int count;
    
    public StepTracker(int s) {
        dailyActiveMinSteps = s;
    }
    
    public int activeDays() {
        return activeDays;
    }
    
    public double averageSteps() {
        return avg;
    }
    
    public void addDailySteps(int s) {
        
        if (s >= dailyActiveMinSteps) {
            activeDays++;
        }
        count++;
        avg = ((avg + s) / count);
    }
}