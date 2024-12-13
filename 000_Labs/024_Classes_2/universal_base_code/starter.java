/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		myCharacter guy = new myCharacter();
		
		System.out.println("Your role is " + guy.role);
		System.out.println("Your strength is " + guy.strength);
		System.out.println("Your dexterity is " + guy.dexterity);
		System.out.println("Your intelligence is " + guy.intelligence);
		System.out.println("Your charisma is " + guy.charisma);
	}
}
