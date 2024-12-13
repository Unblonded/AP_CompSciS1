/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What's your name: ");
		String name = sc.nextLine();
		
		System.out.print("What's your title/clan: ");
		String clan = sc.nextLine();
		
		System.out.print("What do you want to be a Wizard, Warrior or Rouge: ");
		String roll = new String(sc.nextLine());
		
		
		if (roll.toLowerCase().equals("wizard"))
		{
			System.out.println("You have chosen wizard very smart");
		}
		else if (roll.toLowerCase().equals("warrior"))
		{
			System.out.println("You have chosen warrior very strong");
		}
		else if (roll.toLowerCase().equals("rouge"))
		{
			System.out.println("You have chosen rouge very scary");
		}
		else
		{
			System.out.println("You have chosen to not have a roll");
			roll = "";
		}
		
		int points = 20;
		int strength = 0;
		int dexterity = 0;
		int intelligence = 0;
		int charisma = 0;
		System.out.println("You have 20 points to spend in strength, dexterity, intelligence, charisma.");
		if (points > 0)
		{
			System.out.print("Strength (1-10 Max): ");
			
			strength = sc.nextInt();
			
			if (strength > 10)
			{
				System.out.print("Please use a smaller number, Strength (1-10 Max): ");
				strength = sc.nextInt();
			}
			else if (strength < 1)
			{
				System.out.print("Please use a larger number, Strength (1-10 Max): ");
				strength = sc.nextInt();
			}
			points -= strength;
		}
		
		if (points > 0)
		{
			System.out.println("You have " + points + " to spend!");
			
			System.out.print("Dexterity (1-10 Max): ");
			dexterity = sc.nextInt();
			if (dexterity > 10)
			{
				System.out.print("Please use a smaller number, Dexterity (1-10 Max): ");
				dexterity = sc.nextInt();
				
			}
			else if (dexterity < 1)
			{
				System.out.print("Please use a larger number, Dexterity (1-10 Max): ");
				strength = sc.nextInt();
			}
			points -= dexterity;
		}
		
		if (points > 0)
		{
			System.out.println("You have " + points + " to spend!");
			
			System.out.print("Intelligence (1-10 Max): ");
			intelligence = sc.nextInt();
			if (intelligence > 10)
			{
				System.out.print("Please use a smaller number, Intelligence (1-10 Max): ");
				strength = sc.nextInt();
			}
			else if (intelligence < 1)
			{
				System.out.print("Please use a larger number, Intelligence (1-10 Max): ");
				strength = sc.nextInt();
			}
			points -= intelligence;
		}
		
		if (points > 0)
		{
			System.out.println("You have " + points + " to spend!");
			
			System.out.print("Charisma (1-10 Max): ");
			charisma = sc.nextInt();
			if (charisma > 10)
			{
				System.out.print("Please use a smaller number, Charisma (1-10 Max): ");
				charisma = sc.nextInt();
			}
			else if (charisma < 1)
			{
				System.out.print("Please use a larger number, Charisma (1-10 Max): ");
				charisma = sc.nextInt();
			}
			points -= charisma;
		}
		
		System.out.println("\n-------------------------\n");
		
		if (roll.isEmpty())
			System.out.println("You are " + name +  ", the " + clan + " of the land");
		else
			System.out.println("You are " + name + ", a " + roll + ", the " + clan + " of the land");
			
		System.out.print("Your Stats are: \nStrength: " + strength + "\nDexterity: " + dexterity + "\nIntelligence: " + intelligence + "\nCharisma: " + charisma);
		
	}
}
