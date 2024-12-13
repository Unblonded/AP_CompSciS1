/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word to be repeated: ");
		String word = sc.nextLine();
		System.out.print("Enter the number of times to repeat the word: ");
		int itteration = sc.nextInt();
		int cycleCount = 0;
		
		while (true)
		{
			if (cycleCount == itteration)
				break;
			
			System.out.println(word);
			cycleCount++;
		}
		
	}
}
