/* 
    Lecture note example - Classes
*/
package pkg;

public class Potato{
    //Global vars
    String color;
    String type;
    double mass;
    boolean isEdible;
    
    //Constructors
    public Potato() {
        color = "brown";
        type = "French Fry";
        mass = 170.5;
        isEdible = true;
    }
    
    public Potato(String c, String t, double m) {
        color = c;
        type = t;
        mass = m;
        isEdible = false;
    }
    
    //Methods
    public boolean getEdibility() {
        return isEdible;
    }
    
    public void eatPotato() {
        mass = 0.0;
    }
}