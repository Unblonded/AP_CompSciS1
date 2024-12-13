/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int guessedNum = -1;
		int numToGuess = (int)(Math.random() * 1000);
		Scanner sc = new Scanner(System.in);
		
		while (guessedNum != numToGuess)
		{
			System.out.print("Enter Guess: ");
			guessedNum = sc.nextInt();
			if (guessedNum < numToGuess)
				System.out.println("You Guessed Too Low");
				
			else if  (guessedNum > numToGuess)
				System.out.println("You Guessed Too High");
		}
		
		System.out.println("You guessed the correct number: " + numToGuess);
	}
}
