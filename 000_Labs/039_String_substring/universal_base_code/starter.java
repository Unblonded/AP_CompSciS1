/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String str = sc.nextLine();
		
		System.out.println("Here's the word: ");
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(i + ". " + str.substring(i, i + 1));
		}
	}
}
