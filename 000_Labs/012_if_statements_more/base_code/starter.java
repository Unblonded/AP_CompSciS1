/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input First Number: ");
		int x = sc.nextInt();
		System.out.print("Input Second Number: ");
		int y = sc.nextInt();
		
		if (x != y)
		{
			System.out.println("The Numbers Are Different");
		}
		if (x == y)
		{
			System.out.println("The Numbers Are The Same");
		}
	}
}
