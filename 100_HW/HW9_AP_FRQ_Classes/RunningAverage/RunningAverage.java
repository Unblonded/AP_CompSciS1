import java.util.*;

public class RunningAverage{

    private int count;
    private double average;

    public RunningAverage() {
        count = 0;
        average = 0.0;
    }

    public void updateAverage(double newVal) {
        average = ((newVal + (average * count)) / (count + 1));
        count++;
    }

    public int processNewRatings(int num) {
        if (num <= 0) 
            return 0;
        
        int c = 0;
        int r = 0;
        while (c < num) {
            double ratingGen = getNewRating();
            if(ratingGen < 0) {
                r++;
            }
            else {
                updateAverage(ratingGen);
            }
            c++;
        }
        return r;
    }

    public double getNewRating() {
       return (Math.random() * 5);
    }
}