/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Day (0-6): ");
		int day = sc.nextInt();
		
		if (day >= 1 && day <= 5)
		{
			System.out.println("It's a week day wake up at 7:00 AM");
		}
		else if (day == 0 || day == 6)
		{
			System.out.println("It's a weekend wake up at 10:00 AM");
		}
		else
			System.out.println("Invalid Day");
	}
}
