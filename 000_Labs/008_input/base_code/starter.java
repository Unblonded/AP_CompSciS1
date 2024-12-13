/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner scanThing = new Scanner(System.in);
        
        System.out.print("Whats Your Name: ");
        String userName = scanThing.nextLine();
        
        System.out.print("Whats Your Age: ");
        int userAge = scanThing.nextInt();
        
        System.out.print("Whats Your Birth Month: ");
        int userBM = scanThing.nextInt();
        
        System.out.print("Whats Your Birth Day: ");
        int userBD = scanThing.nextInt();
        
        System.out.print("Whats Your Birth Year: ");
        int userBY = scanThing.nextInt();
        
        System.out.print("If I have a dollar and two quarters, how much money do I have: ");
        double buckFifty = scanThing.nextDouble();
        
        System.out.print("\n");
        System.out.println("Your name is " + userName + ", you are " + userAge + " years old, you were born on " + userBM + "-" + userBD + "-" + userBY);
        System.out.println("A buck fifty is $"  + buckFifty);
	}
}
