/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What do you want to be a Wizard, Warrior or Rouge: ");
		String userType = new String(sc.nextLine());
		
		
		if (userType.toLowerCase().equals("wizard"))
		{
			System.out.println("You have chosen wizard");
		}
		else if (userType.toLowerCase().equals("warrior"))
		{
			System.out.println("You have chosen warrior");
		}
		else if (userType.toLowerCase().equals("rouge"))
		{
			System.out.println("You have chosen rouge");
		}
	}
}
