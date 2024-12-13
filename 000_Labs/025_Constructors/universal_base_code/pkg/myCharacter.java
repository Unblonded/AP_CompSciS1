/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;




public class myCharacter {
	public String role = "Wizard";
    public int strength = 3;
    public int dexterity = 7;
    public int intelligence = 6;
    public int charisma = 4;
	
	public myCharacter(String input) {
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
}
