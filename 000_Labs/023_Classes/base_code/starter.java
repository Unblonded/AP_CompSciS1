/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class Character {
	String role = "Wizard";
	int strength = 3;
	int dexterity = 7;
	int intelligence = 6;
	int charisma = 4;
}

class starter {
	public static void main(String args[]) {
		Character guy = new Character();
		
		System.out.println("Your role is " + guy.role);
		System.out.println("Your strength is " + guy.strength);
		System.out.println("Your dexterity is " + guy.dexterity);
		System.out.println("Your intelligence is " + guy.intelligence);
		System.out.println("Your charisma is " + guy.charisma);
	}
}
