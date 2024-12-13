import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Pick a role (Wizard, Rouge, Warrior): ");
		myCharacter guy = new myCharacter(sc.nextLine());
		
		guy.myToString();
	}
}