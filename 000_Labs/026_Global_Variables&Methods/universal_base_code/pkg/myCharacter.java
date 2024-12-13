/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;




public class myCharacter {
	public String role;
    public int strength;
    public int dexterity;
    public int intelligence;
    public int charisma;
	
	public myCharacter(String input) {
    	strength = 3;
    	dexterity = 7;
    	intelligence = 6;
    	charisma = 4;
		role = input;
		
		if (role.toLowerCase().equals("wizard"))
			System.out.println("You have chosen Wizard");
			
		else if (role.toLowerCase().equals("rouge"))
			System.out.println("You have chosen Rouge");
			
		else if (role.toLowerCase().equals("warrior"))
			System.out.println("You have chosen Warrior");
		
		else
			System.out.println("You have not chosen a valid role");
	}
	
	public void myToString() {
		System.out.println("Your role is " + role);
		System.out.println("Your strength is " + strength);
		System.out.println("Your dexterirty is " + dexterity);
		System.out.println("Your intelligence is " + intelligence);
		System.out.println("You charisma is " + charisma);
	}
}
