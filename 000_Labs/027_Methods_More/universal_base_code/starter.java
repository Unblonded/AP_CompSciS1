import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Pick a role (Wizard, Rouge, Warrior): ");
		myCharacter guy = new myCharacter(sc.nextLine());
		
		System.out.print("Pick a role again (Wizard, Rouge, Warrior): ");
		
		guy.setRole(sc.nextLine());
		guy.setStrength(100);
		guy.setDexterity(100);
		guy.setIntelligence(100);
		guy.setCharisma(100);
		
		System.out.println("--------------------");
		
		guy.myToString();
	}
}