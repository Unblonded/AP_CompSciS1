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
	}
	
	public void setRole(String input) {
		if (input.toLowerCase().equals("wizard")) {
			System.out.println("You have chosen Wizard");
			role = input;
			
		}
			
		else if (input.toLowerCase().equals("rouge")) {
			System.out.println("You have chosen Rouge");
			role = input;
		}
			
		else if (input.toLowerCase().equals("warrior")) {
			System.out.println("You have chosen Warrior");
			role = input;
		}
		
		else {
			System.out.println("You have not chosen a valid role");
			role = "none";
		}
	}
	
	public void setStrength(int input) {
		if (input < 0)	strength = 0;
		else	strength = input;
	}
	
	public void setDexterity(int input) {
		if (input < 0)	dexterity = 0;
		else	dexterity = input;
	}
	
	public void setIntelligence(int input) {
		if (input < 0)	intelligence = 0;
		else	intelligence = input;
	}
	
	public void setCharisma(int input) {
		if (input < 0)	charisma = 0;
		else	charisma = input;
	}
	
	
	public void myToString() {
		System.out.println("Your role is " + role);
		System.out.println("Your strength is " + strength);
		System.out.println("Your dexterirty is " + dexterity);
		System.out.println("Your intelligence is " + intelligence);
		System.out.println("You charisma is " + charisma);
	}
}
