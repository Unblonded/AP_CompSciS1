/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Role (Wizard, Rouge, Warrior): ");
		myCharacter guy = new myCharacter(sc.nextLine());
		
	}
}
