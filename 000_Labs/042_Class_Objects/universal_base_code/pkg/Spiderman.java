/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class Spiderman {
    String actor;
    int age;
    String villain;

    public Spiderman() {
        this.actor = "Miles Morales";
        this.age = 13;
        this.villain = "King Pin";
    }
    
    public Spiderman(String actor) {
        this.actor = actor;
        this.age = 0;
        this.villain = "None";
    }

    public Spiderman(String actor, int age) {
        this.actor = actor;
        this.age = age;
        this.villain = "None";
    }

    public Spiderman(String actor, String villian) {
        this.actor = actor;
        this.age = 0;
        this.villain = villian;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setVillain(String villian) {
        this.villain = villian;
    }

    public void print() {
        System.out.println("--------------------------------");
        System.out.println("The actor " + this.actor + " is " + this.age + " years old.");
        System.out.println("They play Spiderman who's villain is " + this.villain + ".");
        System.out.println("--------------------------------");
        System.out.println();
    }
}